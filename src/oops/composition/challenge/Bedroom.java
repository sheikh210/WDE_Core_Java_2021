package oops.composition.challenge;

public class Bedroom {

    /*
    HAS-A Relationship (Composition)
    IS-A Relationship (Inheritance)
     */

    Wall wall1;
    Wall wall2;
    Wall wall3;
    Wall wall4;
    Bed bed;
    Window window;
    Lamp lamp;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Window window, Lamp lamp){
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.window = window;
        this.lamp = lamp;
    }

}
