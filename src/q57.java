// 77. Write a Java program to create a new array of length 2 from two arrays of integers with three elements
// and the new array will contain the first and last elements from the two arrays.

import java.util.Arrays;

public class q57 {
    public static void main(String[] args){
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] newArray = {array1[0], array2[array2.length -1]};
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
