package javaprogramme;

import java.awt.*;

/**
 * 16. Point
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 * Write the following methods (instance methods):
 * * Method named getX without any parameters, it needs to return the value of x field.
 * * Method named getY without any parameters, it needs to return the value of y field.
 * * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * * Method named distance without any parameters, it needs to return the distance between this
 * Point and Point 0,0 as double.
 * * Method named distance with two parameters x, y both of type int, it needs to return the distance
 * between this Point and Point x,y as double.
 * * Method named distance with parameter another of type Point, it needs to return the distance
 * between this Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 * TEST EXAMPLE
 * → TEST CODE: Write the below code into the main method.
 * Point first = new Point(6, 5);
 * Point second = new Point(3, 1);
 * System.out.println("distance(0,0)= " + first.distance());
 * <p>
 * System.out.println("distance(second)= " + first.distance(second));
 * System.out.println("distance(2,2)= " + first.distance(2, 2));
 * Point point = new Point();
 * System.out.println("distance()= " + point.distance());
 * OUTPUT
 * distance(0,0)= 7.810249675906654
 * distance(second)= 5.0
 * distance(2,2)= 5.0
 * distance()= 0.0
 * NOTE: Use Math.sqrt to calculate the square root √.
 * NOTE: Try to avoid duplicated code.
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 7 methods.
 */
public class Programme_16_Point {
    // Instance variables
    private int x;
    private int y;

    // No-arg constructor
    public Programme_16_Point() {
        this.x = 0; // Default value for x
        this.y = 0; // Default value for y
    }

    // Constructor with parameters
    public Programme_16_Point(int x, int y) {
        this.x = x; // Initialize x with the given value
        this.y = y; // Initialize y with the given value
    }

    // Method to get the value of x
    public int getX() {
        return x;
    }

    // Method to get the value of y
    public int getY() {
        return y;
    }

    // Method to set the value of x
    public void setX(int x) {
        this.x = x;
    }

    // Method to set the value of y
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate the distance from this point to (0,0)
    public double distance() {
        return distance(0, 0); // Calls the overloaded method
    }

    // Method to calculate the distance from this point to (x, y)
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    // Method to calculate the distance from this point to another point
    public double distance(Programme_16_Point another) {
        return distance(another.getX(), another.getY()); // Calls the overloaded method
    }

    // Main method to test the Point class
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance(0, 0));              // Expected output: 7.810249675906654
        System.out.println("distance(second)= " + first.distance(second));     // Expected output: 5.0
        System.out.println("distance(2,2)= " + first.distance(2, 2));         // Expected output: 5.0

        Point point = new Point(); // Using the no-arg constructor
        System.out.println("distance()= " + point.distance(0, 0));                 // Expected output: 0.0
    }
}
