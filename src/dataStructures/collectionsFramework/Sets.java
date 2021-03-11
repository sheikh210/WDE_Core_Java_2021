package dataStructures.collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    /*
    1 - Sets are unordered collection of values
    2 - Sets contain unique values - duplicate values cannot be stored in a set
            This interface contains the methods inherited from the Collection interface and adds a feature,
            which restricts the insertion of the duplicate elements.
    3 - There are two interfaces which extend the set implementation namely SortedSet
            and NavigableSet
     */

    public static void main(String[] args) {

        // Set demonstration using HashSet
        Set<String> hashSet = new HashSet<>();

        hashSet.add("We");
        hashSet.add("Are");
        hashSet.add("Learning");
        hashSet.add("Collections");
        hashSet.add("Framework");

        System.out.println(hashSet);

        hashSet.add("Unordered");
        System.out.println(hashSet);


        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(2);
        set1.add(4);
        set1.add(8);
        set1.add(9);
        set1.add(0);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(7);
        set2.add(5);
        set2.add(4);
        set2.add(0);
        set2.add(7);
        set2.add(5);

        System.out.println(set1);
        System.out.println(set2);

        // Finding Intersection between 2 sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("INTERSECTION: " + intersection);

        // Union between 2 sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("UNION: " + union);

        // Asymmetric Difference
        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("DIFFERENCE: " + diff);

        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);
        System.out.println("DIFFERENCE 2: " + diff2);
    }

}
