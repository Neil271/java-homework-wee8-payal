package javaprogramme;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme_6_Number_Triangle {
    public static void main(String[] args) {
        numberTriangle();// method calling
    }

    public static void numberTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {                 // Outer loop for each row
            for (int j = 1; j <= i; j++) {                  // Inner loop for numbers in each row
                System.out.print(j);
            }
            System.out.println();                 // Move to the next line after each row
        }
        scanner.close();  //scanner close
    }
}
