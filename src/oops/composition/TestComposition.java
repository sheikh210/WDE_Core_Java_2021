package oops.composition;

public class TestComposition {

    public static void main(String[] args) {
        Camera camera = new Camera("Logitech", 28, 512, 1028, true);
        CPU cpu = new CPU(12, 512, 7);
        Monitor monitor = new Monitor(27, "LG", true, camera);
        Keyboard keyboard = new Keyboard("Logitech", false, true);
        Mouse mouse = new Mouse("Logitech", true);

        Computer lenovoIdeaStation = new Computer(cpu, monitor, keyboard, mouse, "Lenovo Idea Station");

//        System.out.println(lenovoIdeaStation.monitor.getCamera().getResolution());
        lenovoIdeaStation.mouse.rightClick();

    }
}
