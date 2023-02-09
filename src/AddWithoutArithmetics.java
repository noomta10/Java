// 111. Write a Java program to add two numbers without using any arithmetic operators.

import java.util.ArrayList;
import java.util.Scanner;

public class AddWithoutArithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        ArrayList<Object> sum = new ArrayList<>();

        for (int i = 1; i <= number1; i++)
            sum.add(i);

        for (int j = 1; j <= number2; j++)
            sum.add(j);

        System.out.println(sum);
        System.out.println("Sum is: " + sum.size());
    }
}
