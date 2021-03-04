package oops.composition;

public class Monitor {

    private int size;
    private String manufacturer;
    private boolean isLED;
    private Camera camera;

    public Monitor(int size, String manufacturer, boolean isLED, Camera camera) {
        this.size = size;
        this.manufacturer = manufacturer;
        this.isLED = isLED;
        this.camera = camera;
    }

    public int getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isLED() {
        return isLED;
    }

    public void turnOn(String nameOfComputer) {
        System.out.println("Turning monitor on for " + nameOfComputer + "...\n\tWELCOME");
    }

    public void turnOff() {
        System.out.println("Turning monitor off...\n\tGOODBYE");
    }

    public void drawPixelAt(int x, int y) {
        System.out.println("Drawing pixel at " + x + " and " + y + " position");
    }

    public Camera getCamera() {
        return camera;
    }


}
