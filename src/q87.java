// 108. Write a Java program to add all the digits of a given positive integer until the result has a single digit.

import java.util.Scanner;

public class q87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        while (number > 9) {
            number = sumDigits(number);
        }
        System.out.println(number);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}
