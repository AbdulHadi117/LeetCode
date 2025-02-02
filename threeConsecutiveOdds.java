public class threeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};

        boolean result = helper(arr);
        System.out.println(result);
    }

    public static boolean helper(int[] arr) {
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 1) {
                // If the current number is odd, increment the oddCount
                oddCount++;
                if (oddCount == 3) {
                    // If three consecutive odd numbers are encountered, return true
                    return true;
                }
            } else {
                // If the current number is even, reset the oddCount
                oddCount = 0;
            }
        }

        return false;
    }
}
