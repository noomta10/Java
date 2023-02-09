// 97. Write a Java program to check if an array of integers contains a specified number next to each other
// or there are two same specified numbers separated by one element.

import java.util.Scanner;

public class ArraySearch3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        System.out.println(checkNumbers(numbers, number1, number2));
    }

    public static boolean checkNumbers(int[] numbers, int number1, int number2) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i] == number1 && numbers[i + 1] == number2) ||
                    (numbers[i] == number2 && numbers[i + 1] == number1))
                return true;
            if (i > numbers.length - 3) {
                break;
            }
            if ((numbers[i] == number1 && numbers[i + 2] == number2) ||
                    (numbers[i] == number2 && numbers[i + 2] == number1))
                return true;
        }
        return false;
    }
}
