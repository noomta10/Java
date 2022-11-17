// 86. Write a Java program start with an integer n, divide n by 2 if n is even
// or multiply by 3 and add 1 if n is odd repeat the process until n = 1.

import java.util.Scanner;

public class q66 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        while (number != 1){
            if (number % 2 == 0)
                number /= 2;
            else
                number = number * 3 + 1;
        }
        System.out.print("Result: " + number);
    }
}
