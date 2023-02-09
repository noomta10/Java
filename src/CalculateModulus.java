// 65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.

import java.util.Scanner;

public class CalculateModulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();
        int divided = number1 / number2;
        int modulus = number1 - (number2 * divided);
        System.out.print("Module: " + modulus);
    }
}
