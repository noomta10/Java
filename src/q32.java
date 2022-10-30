// 52. Write a Java program to calculate the sum of two integers
// and return true if the sum is equal to a third integer.

import java.util.Scanner;

public class q32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
        System.out.println("Result is: " + sumoftwo(number1, number2, number3));
    }

    public static boolean sumoftwo(int number1, int number2, int number3){
        return ((number1 + number2) == number3 || (number1 + number3) == number2 || (number2 + number3) == number1);
    }
}
