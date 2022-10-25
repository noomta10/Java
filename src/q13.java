// 32. Write a Java program to compare two numbers.

import java.util.Scanner;

public class q13 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();

        if (number1 > number2)
            System.out.printf("%d > %d", number1, number2);
        else if (number1 < number2)
            System.out.printf("%d < %d", number1, number2);
        else
            System.out.printf("%d = %d", number1, number2);
    }
}
