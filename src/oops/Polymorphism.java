package oops;

public class Polymorphism {

    /*
    Polymorphism is the ability to have multiple methods/functionality with the same name & same/similar functionality,
        but acting on different numbers/types of objects/variables

        2 Types of Polymorphism
            1 - Method Overloading (Compile-Time Polymorphism)
            2 - Method Overriding (Run-Time Polymorphism)
     */

    public static void main(String[] args) {
        printName();
        printName(23L, "Krimo");
        printName(25, "Saidi");
    }

    public static void printName() {
        System.out.println("Salim Sehar");
    }

    public static void printName(int age, String lastName) {
        System.out.println("Ahcene " + lastName + "\nAge is: " + age);
    }

    /*
    The only way you can differentiate overloaded methods, are:
        1 - Number of parameters
        2 - Types of parameters
        3 - Order of parameters

        RETURN TYPE DOES NOT MATTER
     */

    public static String printName(long age, String name) {
        System.out.println(name + ": Abdedou\nAge is: " + age);

        return name + " " + age;
    }




}
