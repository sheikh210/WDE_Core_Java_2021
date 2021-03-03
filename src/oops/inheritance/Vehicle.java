package oops.inheritance;

public class Vehicle {

    String manufacturer;
    String model;
    String color;
    String typeOfVehicle;
    int currentSpeed;

    public Vehicle(String manufacturer, String model, String color, String typeOfVehicle) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.typeOfVehicle = typeOfVehicle;
        this.currentSpeed = 0;
    }

    public void accelerate(int speedToIncreaseBy) {

        for (int i = currentSpeed; i <= speedToIncreaseBy; i++) {
            System.out.println("SPEED IS NOW: " + currentSpeed);
            currentSpeed = i;
        }

        System.out.println(typeOfVehicle.toUpperCase() + " IS NOW TRAVELING AT: " + currentSpeed + " mph");
    }

    public void brake(int speedToDecreaseBy) {
        for (int i = currentSpeed; i >= speedToDecreaseBy; i--) {
            System.out.println("SPEED IS NOW: " + currentSpeed + " mph");
            currentSpeed = i;
        }

        System.out.println(typeOfVehicle.toUpperCase() + " IS NOW TRAVELING AT: " + currentSpeed);
    }

    public void turnRight() {
        System.out.println("Turning right --- Vehicle Class");
    }

    public void turnLeft() {
        System.out.println("Turning left --- Vehicle Class");
    }



}
