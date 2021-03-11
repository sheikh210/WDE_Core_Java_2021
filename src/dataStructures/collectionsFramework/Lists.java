package dataStructures.collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    /*
    LISTS - Allow read/write access
          - Preserve insertion order
          - Have dynamic size - Can grow or shrink, depending on how many members it contains
     */

    public static void main(String[] args) {

        // Creating a list
        List<Integer> list1 = new ArrayList<>();

        List<Integer> linked = new LinkedList<>();
        linked.add(500, 10);

        list1.add(10);
        System.out.println(list1);

        list1.add(0, 5);
        System.out.println(list1);

        // Adds 25 at 1 index
        list1.add(1, 25);
        System.out.println(list1);

        // Creating another list
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(257);
        list2.add(981);

//        System.out.println("LIST 1 Size: " + list1.size());
//        System.out.println("LIST 2 Size: " + list2.size());
//
//        list1.remove(1);
//
//        System.out.println();
//        System.out.println(list1);
//        System.out.println("LIST 1 Size: " + list1.size());
//        System.out.println("LIST 2 Size: " + list2.size());

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
        list1.set(0, 1000);
        System.out.println(list1);


         /*
        Array lists are dynamic, in nature. They can expand and contract in size, as needed
         */
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 1001; i++) {
//            list.add(i);
//        }
//
//        System.out.println(list);
//
//        for (int i = 1000; i>500; i--) {
//            list.remove(i);
//        }
//
//        System.out.println(list);

    }



}
