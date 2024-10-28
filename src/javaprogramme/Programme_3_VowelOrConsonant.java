package javaprogramme;
/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;

public class Programme_3_VowelOrConsonant {
    public static void main(String[] args) {
        vowel();// Method calling
    }

    public static void vowel() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();

        // Check if the input length is 1 and if it is a letter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char character = Character.toLowerCase(input.charAt(0));  // Convert to lowercase for uniform checking

            // Check if the character is a vowel
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Please enter a single alphabet character.");
        }

        scanner.close();  // Close the scanner
    }
}
