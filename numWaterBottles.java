public class numWaterBottles {
    public static void main(String[] args) {
        int numBottles = 15;
        int numExchange = 4;

        int result = helper(numBottles, numExchange);
        System.out.println(result);
    }

    public static int helper(int numBottles, int numExchange) {
        int maxBottles = 0; // max bottles that can be obtained from the current bottles
        int newBottles = 0; // new bottles obtained from exchanging the current bottles
        int remainingBottles;   // remaining bottles that could not be exhanged

        /* 
         * loop until the number of bottles is not zero
         * maxBottles are updated as you drink the bottles
         * newBottles are obtained by exhanging the empty bottles
         * remainingBottles are the left which could not be exchanged
         * numBottles are the current number of bottles
         */
        while (numBottles != 0) {
            maxBottles = numBottles + newBottles;
            newBottles = numBottles / numExchange;  
            remainingBottles = numBottles % numExchange;
            numBottles = newBottles + remainingBottles;
        }
        return maxBottles;
    }
}
