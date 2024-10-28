package carpetcostcalculator;

public class Programme_17_Floor {
    // Instance variables
    private double width;
    private double length;

    // Constructor
    public Programme_17_Floor(double width, double length) {
        // Set width and length, ensuring they are non-negative
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // Method to calculate the area
    public double getArea() {
        return width * length; // Area = width * length
    }
}
