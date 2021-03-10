package oops.composition.challenge;

public class TestBedroom {

    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Bed bed = new Bed("California King");
        Window window = new Window("Rectangle");
        Lightbulb lightbulb = new Lightbulb("75W", true);
        Lightbulb lightbulb2 = new Lightbulb("75W", true);
        Lightbulb lightbulb3 = new Lightbulb("120W", false);
        Lamp lamp = new Lamp(lightbulb, lightbulb2, lightbulb3);


        Bedroom bedroom = new Bedroom(wall1, wall2, wall3, wall4, bed, window, lamp);

//        System.out.println("CHECKING IF BED IS MADE #1: " + bedroom.bed.isBedMade());
//        bedroom.bed.makeBed();
//        System.out.println("CHECKING IF BED IS MADE #2: " + bedroom.bed.isBedMade());

        System.out.println(bedroom.lamp.isLampOn());
        bedroom.lamp.turnOnLamp();

        System.out.println(bedroom.lamp.isLampOn());
        bedroom.lamp.turnOffLamp();

        System.out.println(bedroom.lamp.isLampOn());

    }
}
