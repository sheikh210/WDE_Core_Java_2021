package oops.inheritance;

public class Tesla extends Car {

    public Tesla(String model, String color) {
        super("Tesla", model, color);
    }

    // Polymorphism - Method Overriding (Run-Time Polymorphism)
    @Override
    public void turnOn() {
        System.out.println("Turning battery on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning battery off...");
    }
}
