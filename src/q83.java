// 104. Write a Java program to create a new array from a given array of integers,
// new array will contain the elements from the given array before the last element value 10.

import java.util.Arrays;

public class q83 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 10, 20, 10, 30};
        int tenIndex = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] == 10)
                tenIndex = i;
        }

        int newArrayLength = tenIndex;
        int[] newArray = new int[newArrayLength];
        System.arraycopy(array, 0, newArray, 0, newArrayLength);
        System.out.println(Arrays.toString(newArray));

    }
}
