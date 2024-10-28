package carpetcostcalculator;

public class Programme_17_Calculator {
    // Instance variables
    private Programme_17_Floor floor;
    private Programme_17_Carpet carpet;

    // Constructor
    public Programme_17_Calculator(Programme_17_Floor floor, Programme_17_Carpet carpet) {
        this.floor = floor; // Initialize floor
        this.carpet = carpet; // Initialize carpet
    }

    // Method to calculate the total cost
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost(); // Total cost = area * cost
    }
}
