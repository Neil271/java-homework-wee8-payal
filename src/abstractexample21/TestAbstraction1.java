package abstractexample21;

/**
 * 21. Understanding the real scenario of Abstract class (Create package name
 * ‘abstractexample23’ and create all below classes in this package)
 */
//In real scenario, method is called by programmer or user
class TestAbstraction1 {
    public static void main(String args[]) {

        Shape s = new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}

