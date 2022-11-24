// 103. Write a Java program to create a new array from a given array of integers,
// new array will contain the elements from the given array after the last element value 10.

import java.util.Arrays;

public class q82 {
    public static void main(String[] args) {
        int[] array = {5, 10, 20, 30, 10, 40, 50, 60, 10};
        int tenIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10)
                tenIndex = i;
        }

        int newArrayLength = array.length - tenIndex - 1;
        int[] newArray = new int[newArrayLength];
        System.arraycopy(array, tenIndex + 1, newArray, 0, newArrayLength);
        System.out.println(Arrays.toString(newArray));
    }
}
