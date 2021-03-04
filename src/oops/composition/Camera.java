package oops.composition;

public class Camera {

    private String manufacturer;
    private int megapixels;
    private int resolutionX;
    private int resolutionY;
    private boolean hasWideView;

    public Camera(String manufacturer, int megapixels, int resolutionX, int resolutionY, boolean hasWideView) {
        this.manufacturer = manufacturer;
        this.megapixels = megapixels;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.hasWideView = hasWideView;
    }

    public void turnCameraOn() {
        System.out.println("Turned camera on");
    }

    public void turnCameraOff() {
        System.out.println("Turned camera off");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public String getResolution() {
        return resolutionX + " x " + resolutionY;
    }

    public boolean isHasWideView() {
        return hasWideView;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
}
