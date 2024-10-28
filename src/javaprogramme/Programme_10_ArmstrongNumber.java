package javaprogramme;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        armstrongNumber();//method calling
    }

    public static void armstrongNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;

        // Calculate the number of digits
        int numDigits = String.valueOf(number).length();

        // Check if the number is an Armstrong number
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, numDigits);  // Raise each digit to the power of numDigits
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");

        }
        scanner.close(); //scanner close

    }
}
