package controlFlow;

public class ForLoops {

    /*
    For-Loops
        We use for-loops ONLY when we know EXACTLY how many times (iterations) we would like the program to run
     */

    public static void main(String[] args) {
        String firstName = "Kamal";
        String lastName = "Essalhi";
        String fullName = firstName + " " + lastName;

            // Start    // Run while   // Do this at the end of each loop
        for (int i = 20;     i > 16;              i--) {
            System.out.println(i + ": " + fullName);
        }

    }

}
