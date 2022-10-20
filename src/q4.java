// 5. Write a Java program that takes two numbers as input and display the product of two numbers.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();
        int product = number1 * number2;
        System.out.println("Product: " + product);
    }
}
