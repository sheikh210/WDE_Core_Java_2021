package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    /*
    1 - Data is stored in key-value pairs
        Keys must be unique - Keys CANNOT be duplicates
     */

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        // Adding key-value pairs to the hashmap
        students.put(0, "Alexandra");
        students.put(1, "Pritam");
        students.put(2, "Anaam");
        students.put(3, "Ouarda");
        System.out.println(students.get(1));

        // Updated key-value pairs within the hashmap
        students.put(1, "Taniya");
        System.out.println(students.get(1));

        // Removing key-value pairs from hashmap
        students.remove(2);
        System.out.println(students);
        System.out.println(students.get(2));

        System.out.println();

        // KeySet
        System.out.println(students.keySet());

        // EntrySet
        System.out.println(students.entrySet());

        // Iterating through EntrySet
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("KEY: " + entry.getKey());
            System.out.println("VALUE: " + entry.getValue());
            System.out.println();
        }


    }



}
