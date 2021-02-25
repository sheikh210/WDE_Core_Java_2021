package oops;

// AKA Child Class
public class DerivedClass extends SuperClass {

    // IS-A relationship

    public static void main(String[] args) {
        DerivedClass honda = new DerivedClass();

        honda.color = "Black";
        honda.manufacturer = "Honda";
        honda.model = "Accord";
        honda.numOfDoors = 4;

        honda.startEngine();
        honda.accelerate();
        honda.brake();
        honda.turnOffEngine();

    }


}
