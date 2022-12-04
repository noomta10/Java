// 117. Write a Java program to compute the square root of a given integer.

import java.util.Scanner;

public class q97 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Square root: " + Math.sqrt(number));
    }
}
