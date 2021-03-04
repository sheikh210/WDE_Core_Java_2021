package oops.composition;

public class Mouse {

    private String manufacturer;
    private boolean hasScrollWheel;

    public Mouse(String manufacturer, boolean hasScrollWheel) {
        this.manufacturer = manufacturer;
        this.hasScrollWheel = hasScrollWheel;
    }

    public void scrollUp() {
        System.out.println("Scrolling Up");
    }

    public void scrollDown() {
        System.out.println("Scrolling Down");
    }

    public void leftClick() {
        System.out.println("Left Clicked");
    }

    public void rightClick() {
        System.out.println("Right Clicked");
        openRightClickMenu();
    }

    private void openRightClickMenu() {
        String[] rightClickMenu = {"Copy", "Cut", "Paste", "Print", "Inspect"};
        System.out.println("***RIGHT CLICK MENU OPEN***");
        for (String s:rightClickMenu){
            System.out.println("\t" + s);
        }
    }
}
