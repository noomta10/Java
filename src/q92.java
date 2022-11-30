// 113.a. Write a Java program to merge two given sorted array of integers and create a new sorted array list.

import java.util.ArrayList;
import java.util.Collections;

public class q92 {
    public static void main(String[] args) {
        int[] array1 = {0, 2, 4, 6, 8};
        int[] array2 = {1, 3, 5, 7, 9};
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int number : array1)
            newArray.add(number);

        for (int number : array2)
            newArray.add(number);

        Collections.sort(newArray);
        System.out.println(newArray);
    }
}
