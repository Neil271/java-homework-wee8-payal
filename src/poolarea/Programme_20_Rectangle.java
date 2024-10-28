package poolarea;

public class Programme_20_Rectangle {
    // Instance variables
    private double width;
    private double length;

    // Constructor
    public Programme_20_Rectangle(double width, double length) {
        // Ensure width and length are non-negative
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // Method to get the width
    public double getWidth() {
        return width; // Return the width
    }

    // Method to get the length
    public double getLength() {
        return length; // Return the length
    }

    // Method to calculate the area
    public double getArea() {
        return width * length; // Area = width * length
    }
}
