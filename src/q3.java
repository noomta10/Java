//3. Write a Java program to divide two numbers and print on the screen.

import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        float number1 = input.nextFloat();
        System.out.print("Enter another number: ");
        float number2 = input.nextFloat();
        float quotient = number1 / number2;
        System.out.println("Quotient: " + quotient);


    }
}
