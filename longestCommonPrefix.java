public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = helper(strs);
        System.out.println(result);
    }

    public static String helper(String[] strs) {
        // edge case: if input array is empty, return empty string
        if (strs.length == 0) return "";
        
        String prefix = strs[0];    // initialize prefix to the first element in the array
        
        // loop through the rest of array elements
        for (int i = 1; i < strs.length; i++) {
            // while the current element does not contain the current prefix
            while (strs[i].indexOf(prefix) != 0) {
                // shorten the prefix by one character
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        // return the longest common prefix
        return prefix;
    }
}
