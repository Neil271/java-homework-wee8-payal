package cylinder;


public class Programme_19_Cylinder extends Programme_19_Circle {
    // Instance variable
    private double height;

    // Constructor
    public Programme_19_Cylinder(double radius, double height) {
        super(radius); // Call the parent constructor
        // Set height, ensuring it's non-negative
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
