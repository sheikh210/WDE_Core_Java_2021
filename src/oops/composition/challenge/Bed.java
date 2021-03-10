package oops.composition.challenge;

public class Bed {

    private String size;
    private boolean isBedMade;

    public Bed(String size) {
        this.size = size;
        this.isBedMade = false;
    }

    public void makeBed() {
        if (isBedMade) {
            System.out.println("Bed is already made!");
        } else {
            System.out.println("Making bed...\n\t Bed made!");
            this.isBedMade = true;
        }
    }

    public String getSize() {
        return size;
    }

    public boolean isBedMade() {
        return isBedMade;
    }
}
