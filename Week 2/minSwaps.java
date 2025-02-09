public class minSwaps {

    public static void main(int[] arr) {
        int[] nums = {0, 1, 0, 1, 1, 0, 0};
        System.out.println(helper(nums));
    }

    /*
     * Given an array of binary numbers, this function returns the minimum number of swaps
     * required to group all the 1's together. The function first counts the total number of
     * 1's in the array. Then it iterates through the array and calculates the maximum number
     * of 1's that can be grouped together in a window of size equal to the total count of
     * 1's. Finally, it returns the difference between the size of the array and the maximum
     * window size as the minimum number of swaps required.
     */
    public static int helper(int[] nums) {
        int countOfOnes = 0;
        // Count the total number of 1's in the array
        for (int num : nums) {
            if (num == 1) {
                countOfOnes++;
            }
        }

        // If all elements are 1 or all elements are 0, no swaps needed
        if (countOfOnes == nums.length || countOfOnes == 0) {
            return 0;
        }

        // Calculate the number of 1's in the initial window of size `countOfOnes`
        int initialWindow = 0;
        for (int idx = 0; idx < countOfOnes; idx++) {
            initialWindow += nums[idx];
        }

        int maxWindow = initialWindow;

        // Slide the window across the array to find the maximum group of 1's
        for (int idx = 0; idx < nums.length; idx++) {
            // Slide the window: remove the element going out and add the element coming in
            initialWindow -= nums[idx];
            initialWindow += nums[(idx + countOfOnes) % nums.length];

            // Update the maximum number of 1's found in any window
            maxWindow = Math.max(maxWindow, initialWindow);
        }

        // Return the minimum swaps required to group all 1's together
        return nums.length - maxWindow;
    }
}
