package oops.inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        Tesla tesla = new Tesla("Model S", "black");

//        System.out.println(tesla.typeOfVehicle);
//        System.out.println(tesla.manufacturer);
//        System.out.println(tesla.model);

        tesla.turnOn();
        tesla.accelerate(50);
//        tesla.brake(20);
        tesla.turnOff();

    }





}
