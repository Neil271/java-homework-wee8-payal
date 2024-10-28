package javaprogramme;

/**
 * 25. Example of Constructor Overloading
 * Java program to overload constructors
 */
public class Programme_25_Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Programme_25_Student5(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Programme_25_Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Programme_25_Student5 s1 = new Programme_25_Student5(111, "Karan");
        Programme_25_Student5 s2 = new Programme_25_Student5(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
