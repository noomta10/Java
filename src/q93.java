//  113.b. Write a Java program to merge two given sorted array of integers and create a new sorted array.

import java.util.Arrays;

public class q93 {
    public static void main(String[] args) {
        int[] array1 = {0, 2, 4, 6, 8};
        int[] array2 = {1, 3, 5, 7, 9};
        int lengthArray1 = array1.length;
        int lengthArray2 = array2.length;
        int newArrayLength = lengthArray1 + lengthArray2;
        int[] newArray = new int[newArrayLength];

        System.arraycopy(array1, 0, newArray, 0, lengthArray1);
        System.arraycopy(array2, 0, newArray, lengthArray1, lengthArray2);
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
    }
}
