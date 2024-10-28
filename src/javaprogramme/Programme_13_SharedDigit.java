package javaprogramme;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme_13_SharedDigit {

    // Method to check if two numbers share a digit
    public static boolean hasSharedDigit(int number1, int number2) {
        // Check if both numbers are within the range of 10 to 99
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        // Extract the digits from the first number
        int digit1A = number1 % 10; // Get the unit place
        int digit1B = number1 / 10; // Get the ten place

        // Extract the digits from the second number
        int digit2A = number2 % 10; // Get the unit place
        int digit2B = number2 / 10; // Get the ten place

        // Check if any digit of the first number matches any digit of the second number
        return (digit1A == digit2A || digit1A == digit2B || digit1B == digit2A || digit1B == digit2B);
    }

    // Main method to test the hasSharedDigit method
    public static void main(String[] args) {
        // Test cases
        System.out.println(hasSharedDigit(12, 23)); // should return true
        System.out.println(hasSharedDigit(9, 99));  // should return false
        System.out.println(hasSharedDigit(15, 55)); // should return true
        System.out.println(hasSharedDigit(34, 45)); // should return false
        System.out.println(hasSharedDigit(78, 87)); // should return true
    }
}


