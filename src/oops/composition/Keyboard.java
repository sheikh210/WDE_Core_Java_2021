package oops.composition;

public class Keyboard {

    String manufacturer;
    boolean isMechanical;
    boolean hasNumberPad;

    public Keyboard(String manufacturer, boolean isMechanical, boolean hasNumberPad) {
        this.manufacturer = manufacturer;
        this.isMechanical = isMechanical;
        this.hasNumberPad = hasNumberPad;
    }

    public void sendKeys(String text) {
        System.out.println("TYPING " + text);
    }

    public void pressEnter() {
        System.out.println("`ENTER` key pressed");
    }

    public void pressEsc() {
        System.out.println("`ESCAPE` key pressed");
    }

}
