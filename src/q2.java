// 2. Write a Java program to print the sum of two numbers.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        float number1 = input.nextFloat();
        System.out.print("Enter another number: ");
        float number2 = input.nextFloat();
        float sum = number1 + number2;
        System.out.println("Sum: " + sum);
    }
}
