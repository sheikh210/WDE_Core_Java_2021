package controlFlow;

import java.util.Collections;

public class SortArray {

    // Big O Notation - Efficiency of sorting algorithms

    public static void main(String[] args) {
        int[] nums = {54, 93, -32, 106, 17, 3, 42, 81, 167, 10};

        int[] sortedArray = sortArray(nums);

        for (int x : sortedArray) {
            System.out.print(x + "\t");
        }
    }

    // Bubble Sort
    public static int[] sortArray(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
