public class countSeniors {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int result = helper(details);
        System.out.println(result);

    }
    public static int helper(String[] details) {
        int count = 0;
        for (String detail : details) {
            // Esxtract age from the string
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) { // Check if the age is greater than 60
                count++;
            }
        }
        return count;
    }
}
