package poolarea;

public class Programme_20_Cuboid extends Programme_20_Rectangle {
    // Instance variable
    private double height;

    // Constructor
    public Programme_20_Cuboid(double width, double length, double height) {
        super(width, length); // Call the parent constructor
        // Ensure height is non-negative
        this.height = (height < 0) ? 0 : height;
    }

    // Method to get the height
    public double getHeight() {
        return height; // Return the height
    }

    // Method to calculate the volume
    public double getVolume() {
        return getArea() * height; // Volume = base area * height
    }
}
