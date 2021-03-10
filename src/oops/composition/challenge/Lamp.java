package oops.composition.challenge;

public class Lamp {

    private Lightbulb lightbulb;
    private Lightbulb lightbulb2;
    private Lightbulb lightbulb3;
    private Lightbulb lightbulb4;
    private boolean isLampOn;

    public Lamp(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
        this.isLampOn = false;
    }

    public Lamp(Lightbulb lightbulb, Lightbulb lightbulb2) {
        this.lightbulb = lightbulb;
        this.lightbulb2 = lightbulb2;
        this.isLampOn = false;
    }

    public Lamp(Lightbulb lightbulb, Lightbulb lightbulb2, Lightbulb lightbulb3) {
        this.lightbulb = lightbulb;
        this.lightbulb2 = lightbulb2;
        this.lightbulb3 = lightbulb3;
        this.isLampOn = false;
    }

    public Lamp(Lightbulb lightbulb, Lightbulb lightbulb2, Lightbulb lightbulb3, Lightbulb lightbulb4) {
        this.lightbulb = lightbulb;
        this.lightbulb2 = lightbulb2;
        this.lightbulb3 = lightbulb3;
        this.lightbulb4 = lightbulb4;
        this.isLampOn = false;
    }

    public void turnOnLamp() {
        if (isLampOn) {
            System.out.println("Lamp is already on!");
        } else {
            System.out.println("Turning on lamp...\n\t Lamp is turned on!");
            this.isLampOn = true;
        }
    }

    public void turnOffLamp() {
        if (!isLampOn) {
            System.out.println("Lamp is already off!");
        } else {
            System.out.println("Turning off lamp...\n\t Lamp is turned off!");
            this.isLampOn = false;
        }
    }

    public boolean isLampOn() {
        return isLampOn;
    }
}
