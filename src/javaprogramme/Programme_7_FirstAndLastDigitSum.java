package javaprogramme;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * <p>
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * <p>
 * gives us 0+0 and the sum is 0.
 * <p>
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Programme_7_FirstAndLastDigitSum {
    public static void main(String[] args) {
        // Test cases to verify the sumFirstAndLastDigit method
        System.out.println("Sum of first and last digit of 252: " + sumFirstAndLastDigit(252));    // Expected output: 4
        System.out.println("Sum of first and last digit of 257: " + sumFirstAndLastDigit(257));    // Expected output: 9
        System.out.println("Sum of first and last digit of 0: " + sumFirstAndLastDigit(0));        // Expected output: 0
        System.out.println("Sum of first and last digit of 5: " + sumFirstAndLastDigit(5));        // Expected output: 10
        System.out.println("Sum of first and last digit of -10: " + sumFirstAndLastDigit(-10));    // Expected output: -1
    }

    // Method to calculate the sum of the first and last digits of a number
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;  // Return -1 for negative numbers as invalid input
        }

        int lastDigit = number % 10;  // Get the last digit

        // Find the first digit by continuously dividing by 10
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Return the sum of the first and last digits
        return firstDigit + lastDigit;
    }

}
