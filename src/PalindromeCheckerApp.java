import java.util.Scanner;
import java.util.Stack;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Stack-based strategy implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        // Push characters onto stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare by popping
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Context class
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.checkPalindrome(input);
    }
}

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Use stack strategy
        PalindromeStrategy strategy = new StackStrategy();
        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.check(input);

        System.out.println("Is Palindrome? " + result);

        scanner.close();
    }
}