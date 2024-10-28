package javaprogramme;

/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_Left_Triangle {
    public static void main(String[] args) {
        // Number of rows for the triangle
        int rows = 5;

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print '*' for each column in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}


