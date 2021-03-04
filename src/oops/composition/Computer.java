package oops.composition;

public class Computer {

    /*
     Inheritance = IS-A
     Composition = HAS-A
     */

    CPU cpu;
    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;
    String nameOfComputer;

    public Computer(CPU cpu, Monitor monitor, Keyboard keyboard, Mouse mouse, String nameOfComputer) {
        this.cpu = cpu;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.nameOfComputer = nameOfComputer;
    }

}
