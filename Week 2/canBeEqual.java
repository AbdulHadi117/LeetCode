
public class canBeEqual {

    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4}, arr = {2, 4, 1, 3};
        System.out.println(helper(target, arr));
    }

    public static boolean helper(int[] target, int[] arr) {
        // Check if the arrays have the same length
        if (target.length != arr.length) {
            return false;
        }

        // Count number of occurrences of each element in the target array
        int[] count = new int[1001];
        for (int idx = 0; idx < target.length; idx++) {
            count[target[idx]]++;
            count[arr[idx]]--;
        }

        // Check if all counts are 0
        for (int idx = 0; idx < count.length; idx++) {
            if (count[idx] != 0) {
                return false;
            }
        }

        return true; // all checks passed
    }
}
