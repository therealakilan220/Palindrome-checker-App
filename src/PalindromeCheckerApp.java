import java.util.Scanner;

public class PalindromeCheckerApp {

    // User-defined Stack class
    static class StackCharacter {
        private char[] arr;
        private int top;

        public StackCharacter(int size) {
            arr = new char[size];
            top = -1;
        }

        public void push(char c) {
            arr[++top] = c;
        }

        public char pop() {
            return arr[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input from user
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create stack
        StackCharacter stack = new StackCharacter(input.length());

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}