package constructorPractice;

public class Vehicle {

    private String vehicleType;

    String vehicleManufacturer;
    String vehicleModel;
    int numOfWheels;

    // Use 'this' keyword when you assign a global variable a value, via constructor or setter

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
        System.out.println("This is a " + vehicleType);
    }

    public Vehicle(String vehicleType, String vehicleManufacturer) {
        this.vehicleType = vehicleType;
        this.vehicleManufacturer = vehicleManufacturer;

        System.out.println("This " + vehicleType + " is made by " + vehicleManufacturer);
    }

    public String getVehicleType() {
        return vehicleType;
    }

}
