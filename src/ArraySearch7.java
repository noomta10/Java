// 105. Write a Java program to check if a group of numbers at the start and end of a given array are same.

import java.util.Scanner;

public class ArraySearch7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2, 1};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of numbers in a group: ");
        int groupOf = input.nextInt();
        int lastIndex = array.length - 1;
        System.out.println(checkNumbers(array, groupOf, lastIndex));
    }

    public static boolean checkNumbers(int[] array, int groupOf, int lastIndex) {
        for (int i = 0; i < groupOf; i++) {
            if (array[i] != array[lastIndex])
                return false;
            lastIndex--;
        }
        return true;
    }
}
