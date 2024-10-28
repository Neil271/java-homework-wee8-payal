package javaprogramme;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * <p>
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme_11_EvenDigitSum {

    public static void main(String[] args) {
        // Test cases to verify the getEvenDigitSum method
        System.out.println("Sum of even digits in 123456789: " + getEvenDigitSum(123456789)); // Expected output: 20
        System.out.println("Sum of even digits in 252: " + getEvenDigitSum(252));             // Expected output: 4
        System.out.println("Sum of even digits in -22: " + getEvenDigitSum(-22));             // Expected output: -1
    }

    // Method to calculate the sum of even digits in a number
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;  // Return -1 for negative numbers to indicate an invalid value
        }

        int sum = 0;

        // Process each digit
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            if (digit % 2 == 0) {     // Check if the digit is even
                sum += digit;         // Add even digit to the sum
            }
            number /= 10;             // Remove the last digit
        }

        return sum;
    }
}
