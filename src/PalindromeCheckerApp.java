public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        boolean result = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }

    // Method to check palindrome
    public static boolean isPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}