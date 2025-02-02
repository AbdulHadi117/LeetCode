
public class averageWaitingTime {

    public static void main(String[] args) {
        int[][] customers = {{1, 2}, {2, 5}, {4, 3}};

        double result = helper(customers);
        System.out.println(result);
    }

    public static double helper(int[][] customers) {
        double totalWaitingTime = 0.0; // average waiting time for all customers
        double currentWaitingTime = 0.0; // current waiting time for each customers

        for (int[] customer : customers) {
            double orderTime = customer[0]; // Order Placed Time
            double timeToPrepare = customer[1]; // Time to prepare the order

            /*
             * Chef takes order at orderTime
             * Chef takes timeToPrepare to prepare the order
             * Chef should get free at max(orderTime + timeToPrepare, currentWaitingTime)
             * Customer will wait for timeToFree - orderTime
             */

            double timeToFree = (currentWaitingTime == 0) ? orderTime + timeToPrepare
                    : Math.max(orderTime + timeToPrepare, currentWaitingTime);

            double waitingTime = timeToFree - orderTime;
            totalWaitingTime += waitingTime;

            currentWaitingTime = timeToFree;    // Chef will be free at timeToFree
        }

        double averageWaitingTime = totalWaitingTime / customers.length;

        return averageWaitingTime;
    }
}
