// 53. Write a Java program that accepts three integers from the user
// and return true if the second number is greater than first number and third number is greater than second number.
// If "abc" is true second number does not need to be greater than first number.

import java.util.Scanner;

public class q33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
        boolean abc = false;
        System.out.println("Return: " + checknumbers(number1, number2, number3, abc));
    }

    public static boolean checknumbers(int number1, int number2, int number3, boolean abc) {
        return (number2 > number1 && number3 > number2 || abc && number3 > number2);
    }
}
