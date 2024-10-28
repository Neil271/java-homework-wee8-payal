package javaprogramme;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        fibonacciNumber();// method calling
    }

    public static void fibonacciNumber() {
        int terms = 8; //Number of terms to print in the Fibonacci sequence
        int firstTerm = 1;
        int secondTerm = 1;

        System.out.print("Fibonacci Sequence: " + firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= terms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
