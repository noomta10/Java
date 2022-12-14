// 124. Write a Java program to find the index of a value in a sorted array.
// If the value does not find return the index where it would be if it were inserted in order.

import java.util.Arrays;
import java.util.Scanner;

public class q103 {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int numberIndex = Arrays.binarySearch(numbers, number);
        if (numberIndex > 0)
            System.out.printf("The index of %d is %d", number, numberIndex);
        else {
            placeNumber(numbers, number);
            System.out.println("Number is not present in the array, expected index would be: " + numbers.length);
        }
    }

    public static int placeNumber(int[] numbers, int number) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int numberInArray : numbers) {
            if (number > numberInArray)
                continue;
        }
        return 2;
    }
}
