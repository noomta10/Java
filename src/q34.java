// 54. Write a Java program that accepts three integers from the user
// and return true if two or more of them have the same rightmost digit. The integers are non-negative.

import java.util.Scanner;

public class q34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
        System.out.println("Result: " + checknumbers(number1, number2, number3));
    }

    public static boolean checknumbers(int number1, int number2, int number3){
        return (number1 % 10 == number2 % 10 || number1 % 10 == number3 % 10 || number2 % 10 == number3 % 10);
    }
}
