// 119. Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.

import java.util.Arrays;
import java.util.Scanner;

public class q99 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an element: ");
        int element = input.nextInt();
        int elementIndex = Arrays.binarySearch(array, element);

        if (elementIndex >= 0)
            System.out.printf("Element index is: %d", elementIndex);
        else
            System.out.println("Element is not present in the array");
    }
}
