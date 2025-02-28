public class ReverseStringRecursive {
    public static void main(String[] args) {
        String input = ""; // Initialize empty input

        // Assign default value if input is empty
        if (input.isEmpty()) {
            input = "Hello World";  // Default value
        }

        String reversed = reverseUsingRecursion(input);
        System.out.println("Reversed String (Recursion): " + reversed);
    }

    public static String reverseUsingRecursion(String str) {
        // Base case: if string is empty or has one character, return the same string
        if (str.isEmpty()) {
            return str;
        }
        // Recursive step: take the last character + reverse the rest of the string
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }
}
