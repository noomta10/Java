// 49. Write a Java program to accept a number and check the number is even or not.
// Prints 1 if the number is even or 0 if the number is odd.

import java.util.Scanner;

public class q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println(1);
        else
            System.out.println(0);

    }
}
