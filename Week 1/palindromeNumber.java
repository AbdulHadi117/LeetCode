public class palindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        boolean result = helper(number);
        System.out.println(result);
    }

    public static boolean helper(int number) {
        if (number < 0) {
            return false;
        }
        int reverse = 0, original = number;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return reverse == original;
    }
}
