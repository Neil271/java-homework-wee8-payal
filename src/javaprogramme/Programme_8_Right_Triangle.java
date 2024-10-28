package javaprogramme;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_Right_Triangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

        for (int i = 1; i <= rows; i++) {       // Outer loop for each row
            for (int j = 1; j <= i; j++) {       // Inner loop for columns in each row
                System.out.print("@");
            }
            System.out.println();                // Move to the next line after each row
        }
    }
}
