// 106. Write a Java program to create a new array that is left shifted from a given array of integers.

import java.util.Arrays;

public class q85 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] shiftedArray = new int[array.length];
        System.arraycopy(array, 1, shiftedArray, 0, array.length-1);
        shiftedArray[array.length-1] = array[0];
        System.out.println(Arrays.toString(shiftedArray));
    }
}
