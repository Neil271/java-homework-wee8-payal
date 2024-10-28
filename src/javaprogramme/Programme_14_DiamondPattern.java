package javaprogramme;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 * **
 * ****
 * ******
 * ********
 * **********
 * ************
 * **********
 * ********
 * ******
 * ****
 * **
 */
public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        diamondPattern();// method calling
    }

    public static void diamondPattern() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rows: ");
        int number = scanner.nextInt();

        int n = 7; // Height of the diamond (number of rows in the upper half)

        int i = 1;
        // Upper half of the diamond
        while (i <= n) {
            int j = 1;
            // Print spaces
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            // Print asterisks
            j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        i = n - 1; // Start for the lower half
        // Lower half of the diamond
        while (i >= 1) {
            int j = 1;
            // Print spaces
            int spaces = n - i;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }
            // Print asterisks
            j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        scanner.close();// close scanner
    }
}


