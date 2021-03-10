package oops.composition.challenge;

public class Lightbulb {

    private String wattage;
    private boolean isLED;

    public Lightbulb(String wattage, boolean isLED) {
        this.wattage = wattage;
        this.isLED = isLED;
    }

    public String getWattage() {
        return wattage;
    }

    public boolean isLED() {
        return isLED;
    }
}
