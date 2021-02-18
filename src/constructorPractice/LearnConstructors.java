package constructorPractice;

public class LearnConstructors {

    /*
    Constructors are implicitly defined in every class, by default (Default Constructor)
        Default constructor is the constructor that accepts NO parameters
        Constructors are used when creating instances (objects) of a class
     */


    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car");
        Vehicle truck = new Vehicle("Truck", "Tesla");

        car.vehicleManufacturer = "Honda";
        car.vehicleModel = "Accord";
        car.numOfWheels = 4;

        truck.numOfWheels = 4;
        truck.vehicleModel = "Model X";

        System.out.println("Car Object\n******************");
        System.out.println(car.getVehicleType());
        System.out.println(car.vehicleManufacturer);
        System.out.println(car.vehicleModel);
        System.out.println(car.numOfWheels);
        System.out.println("******************");

        System.out.println("Truck Object\n******************");
        System.out.println(truck.getVehicleType());
        System.out.println(truck.vehicleManufacturer);
        System.out.println(truck.vehicleModel);
        System.out.println(truck.numOfWheels);
        System.out.println("******************");
    }



}
