// 79. Write a Java program to rotate an array of integers in left direction.

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        int arrayIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[arrayIndex];
            arrayIndex -= 1;
        }
        return newArray;
    }
}
