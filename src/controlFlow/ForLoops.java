package controlFlow;

public class ForLoops {

    /*
    For-Loops
        We use for-loops when we know exactly how many times (iterations) we would like the program to run
     */

    public static void main(String[] args) {
        String firstName = "Kamal";
        String lastName = "Essalhi";
        String fullName = firstName + " " + lastName;

            // Start    // Run while   // Do this at the end of each loop
        for (int i = 1;     i > 0;              i++) {
            System.out.println(i + ": " + fullName);
        }

    }

}
