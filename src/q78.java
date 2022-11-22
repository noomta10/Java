//99. Write a Java program to check if a specified number appears in every pair
// of adjacent element of a given array of integers.

import java.util.Scanner;

public class q78 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 5, 2, 6, 2, 5, 2, 3};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.println(checkNumbers(numbers, number));
    }

    public static boolean checkNumbers(int[] numbers, int number) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (number != numbers[i] && number != numbers[i + 1]) {
                return false;
            }
        }
    return true;
    }

}
