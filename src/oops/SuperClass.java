package oops;

public class SuperClass {

    String manufacturer;
    String model;
    String color;
    private static final int NUM_OF_WHEELS = 4;       // Enum
    int numOfDoors;

    public void startEngine() {
        System.out.println("Starting engine...");
    }

    public void turnOffEngine() {
        System.out.println("Turning engine off...");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void brake() {
        System.out.println("Applying brakes...");
    }

    public void turnRight() {
        System.out.println("Turning right...");
    }

    public void turnLeft() {
        System.out.println("Turning left");
    }
}
