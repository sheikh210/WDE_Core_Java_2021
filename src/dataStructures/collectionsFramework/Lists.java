package dataStructures.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    /*
    LISTS - Allow read/write access (they are mutable)
          - Preserve insertion order
     */

    public static void main(String[] args) {

        // Creating a list
        List<Integer> list1 = new ArrayList<>();

        // Adds 1 at 0 index
        list1.add(0, 1);

        // Adds 2 at 1 index
        list1.add(1, 2);
        System.out.println(list1);

        // Creating another list
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(257);
        list2.add(981);

        System.out.println(list1.size());

        // Will add list l2 from 1 index
        list1.addAll(1, list2);
        System.out.println(list1.size());

        System.out.println(list1);

        // Removes element from index 1
        list1.remove(1);
        System.out.println(list1);

        // Prints element at index 3
        System.out.println(list1.get(3));

        // Replace 0th element with 5
        list1.set(0, 5);
        System.out.println(list1);


    }



}
