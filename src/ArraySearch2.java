// 96. Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.

import java.util.Arrays;

public class ArraySearch2 {
    public static void main(String[] args) {
        int[] numbers = {20, 10, 2, 2};
        boolean has10 = false;
        boolean has20 = false;

        for (int number : numbers) {
            if (number == 10)
                has10 = true;
            if (number == 20)
                has20 = true;
        }

        int tenIndex = Arrays.binarySearch(numbers, 10);
        int twentyIndex = Arrays.binarySearch(numbers, 20);

        System.out.println((tenIndex < twentyIndex) && has20 && has10);

    }
}
