import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Define the input string to validate
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare characters
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}