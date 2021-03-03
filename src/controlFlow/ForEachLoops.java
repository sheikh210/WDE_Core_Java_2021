package controlFlow;

public class ForEachLoops {

    // For-Each loops are meant to loop through each member of a data structure (array, list, map, etc)

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        /*
         For each member in `nums` (which is an integer array), we can expect each member to be of type int
              We must declare a placeholder variable of type int, which will then point to each member within the array
              In this case, that is 'int x'

              This loop will loop through each member of the array, and we are able to perform some operation on each
              individual member of the array, using the declared placeholder, 'x'
         */

        for (int x : nums) {
            System.out.println(x);
        }
    }

}
