// 33. Write a Java program and compute the sum of the digits of an integer.

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.print("Sum of digits: " + sumDigits(number));
    }
    public static int sumDigits(int number){
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
