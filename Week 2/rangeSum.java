
import java.util.Arrays;

public class rangeSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int number = 4;
        int leftIndex = 1;
        int rightIndex = 5;

        int result = helper(nums, number, leftIndex, rightIndex);
        System.out.println(result);
    }

    /*
     * Given an array of integers, return the sum of all the subarray sums in the range [leftIndex, rightIndex]
     * @param array the given array of integers
     * @param number the number of elements in the array
     * @param leftIndex the left index of the range
     * @param rightIndex the right index of the range
     * @return the sum of all the subarray sums in the range [leftIndex, rightIndex]
     */
    public static int helper(int[] array, int number, int leftIndex, int rightIndex) {
        // Array to store the sum of all possible subarrays
        int[] subArraySum = new int[number * (number + 1) / 2];

        // Calculate all the subarray sums
        for (int i = 0, k = 0; i < array.length; i++) {
            int currentSum = 0;
            for (int j = i; j < array.length; j++) {
                currentSum += array[j];
                subArraySum[k++] = currentSum;
            }
        }

        // Sort the subarray sums
        Arrays.sort(subArraySum);

        // Calculate the sum of subarray sums in the specified range
        int sum = 0;
        final int MOD = (int) (1e9 + 7);    // Define the modulo value
        for (int i = leftIndex - 1; i < rightIndex; i++) {
            sum = (sum + subArraySum[i]) % MOD;
        }

        return sum;
    }
}
