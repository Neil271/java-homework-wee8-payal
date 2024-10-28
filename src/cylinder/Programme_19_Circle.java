package cylinder;

public class Programme_19_Circle {
    // Instance variable
    private double radius;

    // Constructor
    public Programme_19_Circle(double radius) {
        // Set radius, ensuring it's non-negative
        this.radius = (radius < 0) ? 0 : radius;
    }

    // Method to get the radius
    public double getRadius() {
        return radius; // Return the radius
    }

    // Method to calculate the area
    public double getArea() {
        return radius * radius * Math.PI; // Area = π * r^2
    }
}
