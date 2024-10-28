package javaprogramme;

/**
 * Sum Calculator
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 * TEST EXAMPLE
 * TEST CODE: Write the bellow code into main method
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0);
 * calculator.setSecondNumber(4);
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25);
 * calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * <p>
 * OUTPUT
 * add= 9.0
 * subtract= 1.0
 * multiply= 0.0
 * divide= 0.0
 * TIPS:
 * ● add= 9.0 is printed because 5.0 + 4 is 9.0
 * ● subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * ● multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * ● divide= 0.0 is printed because secondNumber is set to 0
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 */
public class Programme_18_SimpleCalculator {

    // Instance variables for firstNumber and secondNumber
    private double firstNumber;
    private double secondNumber;

    // Getter for firstNumber
    public double getFirstNumber() {
        return firstNumber;
    }

    // Getter for secondNumber
    public double getSecondNumber() {
        return secondNumber;
    }

    // Setter for firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Setter for secondNumber
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Method to get the result of addition
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // Method to get the result of subtraction
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // Method to get the result of multiplication
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // Method to get the result of division
    public double getDivisionResult() {
        // Check if secondNumber is 0 to avoid division by zero
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    // Main method to test SimpleCalculator class
    public static void main(String[] args) {
        Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());           // Expected output: 9.0
        System.out.println("subtract= " + calculator.getSubtractionResult());   // Expected output: 1.0

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult()); // Expected output: 0.0
        System.out.println("divide= " + calculator.getDivisionResult());         // Expected output: 0.0
    }
}
