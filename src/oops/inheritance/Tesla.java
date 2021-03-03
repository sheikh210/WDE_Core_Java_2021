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

    @Override
    public void turnRight() {
        System.out.println("Turning Right --- Tesla Class");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turning Left --- Tesla Class");
    }

}
