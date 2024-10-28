package javaprogramme;
/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        minAndMax(); // Method calling
    }

    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;  // Initialize min to the highest possible integer value
        int max = Integer.MIN_VALUE;  // Initialize max to the lowest possible integer value
        boolean firstInput = true;    // Track if this is the first valid input

        while (true) {
            System.out.print("Enter number: ");

            if (scanner.hasNextInt()) {  // Check if input is a valid integer
                int number = scanner.nextInt();

                // Update min and max based on the current number
                if (firstInput) {
                    min = number;
                    max = number;
                    firstInput = false;
                } else {
                    if (number < min) min = number;
                    if (number > max) max = number;

                }
            } else {
                // Break out of the loop if an invalid number is entered
                System.out.println("Invalid number entered.");
                break;
            }

            scanner.nextLine();  // Clear the buffer
        }

        // Output the minimum and maximum numbers
        if (!firstInput) {  // Check if there was at least one valid input
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();  // Close the scanner
    }
}
