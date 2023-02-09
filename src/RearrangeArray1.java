// 94. Write a Java program to rearrange all the elements of a given array of integers
// so that all the odd numbers come before all the even numbers.

import java.util.Arrays;

public class RearrangeArray1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] newArray = new int[numbers.length];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                newArray[index] = number;
                index++;
            }
        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                newArray[index] = number;
                index++;
            }
        }

        System.out.println(Arrays.toString(newArray));

    }
}
