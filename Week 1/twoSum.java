public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = helper(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] helper(int[] nums, int target) {
        int[] result = new int[2]; // initialize result array

        for (int i = 0, j = i + 1; i < nums.length && j < nums.length; i++ , j++) {
            if (nums[i] + nums[j] == target) {
            result[0] = i; // store the index of the first number
            result[1] = j; // store the index of the second number
            return result;
            }
        }
        return result;
    }
}
