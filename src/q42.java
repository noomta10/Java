// 62. Write a Java program that accepts three integer values and return true if
// one of them is 20 or more and less than the substractions of others.

import java.util.Scanner;

public class q42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int number1 = input.nextInt();
        System.out.print("Input the second number: ");
        int number2 = input.nextInt();
        System.out.print("Input the third number : ");
        int number3 = input.nextInt();

        System.out.println(Math.abs(number1 - number2) >= 20 || Math.abs(number1 - number3) >= 20
                || Math.abs(number2 - number3) >= 20);
    }
}
