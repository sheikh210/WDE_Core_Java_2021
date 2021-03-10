package oops.composition.challenge;

public class Window {

    private boolean isWindowOpen;
    private String windowShape;

    public Window(String windowShape) {
        this.windowShape = windowShape;
        this.isWindowOpen = false;
    }

    private void openWindow() {
        if (isWindowOpen) {
            System.out.println("Window is already open!");
        } else {
            System.out.println("Opening window...\n\t Window opened!");
        }
    }

    private void closeWindow() {
        if (!isWindowOpen) {
            System.out.println("Window is already closed!");
        } else {
            System.out.println("Closing window...\n\t Window closed!");
        }

    }

    public boolean isWindowOpen() {
        return isWindowOpen;
    }

    public String getWindowShape() {
        return windowShape;
    }
}
