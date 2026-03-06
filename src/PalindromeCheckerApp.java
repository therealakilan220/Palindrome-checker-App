public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean result = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }

    // Recursive method
    private static boolean checkPalindrome(String str, int start, int end) {

        // Base case
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindrome(str, start + 1, end - 1);
    }
}