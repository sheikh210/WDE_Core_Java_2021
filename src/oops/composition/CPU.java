package oops.composition;

public class CPU {

    int ram;
    int memory;
    int processors;

    public CPU(int ram, int memory, int processors) {
        this.ram = ram;
        this.memory = memory;
        this.processors = processors;
    }

    public void startProgram() {
        System.out.println("Starting program....\n\t....\n\t........\n\t.....\n\tPROGRAM LAUNCHED");
    }

    public void shutDownProgram() {
        System.out.println("Shutting down program....\n\t....\n\t........\n\t.....\n\tPROGRAM CLOSED");
    }

}
