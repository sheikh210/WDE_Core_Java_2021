package oops.inheritance;

public class Car extends Vehicle {

    public Car(String manufacturer, String model, String color) {
        super(manufacturer, model, color, "Car");
    }

    public void turnOn() {
        System.out.println("Turning car on...");
    }

    public void turnOff() {
        if (super.currentSpeed != 0) {
            System.out.println("CANNOT TURN CAR OFF -- BRAKING FIRST");
            super.brake(super.currentSpeed);
            System.out.println("TURNING CAR OFF");
        } else {
            System.out.println("TURNING CAR OFF");
        }
    }

    @Override
    public void accelerate(int speedToIncreaseBy) {
        super.accelerate(speedToIncreaseBy);
    }

    @Override
    public void brake(int speedToDecreaseBy) {

        super.accelerate(speedToDecreaseBy);
    }

}
