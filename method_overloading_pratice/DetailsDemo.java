package method_overloading_pratice;

/*
 12. Overload details() method to display:
name
name and age
 */

public class DetailsDemo {

    static void details(String name) {
        System.out.println("Name: " + name);
    }

    static void details(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        details("Malvi");
        System.out.println("-------------------------");
        details("Malvi", 21);
    }
}