package carpetcostcalculator;

public class Programme_17_Carpet {
    // Instance variable
    private double cost;

    // Constructor
    public Programme_17_Carpet(double cost) {
        // Set cost, ensuring it's non-negative
        this.cost = (cost < 0) ? 0 : cost;
    }

    // Method to get the cost
    public double getCost() {
        return cost; // Return the cost of the carpet
    }
}
