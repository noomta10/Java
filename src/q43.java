// 63. Write a Java program that accepts two integer values from the user and return the larger values.
// However, if the two values are the same, return 0
// and return the smaller value if the two values have the same remainder when divided by 6.

import java.util.Scanner;

public class q43 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();
        System.out.print("Result: " + calculateResult(number1, number2));
    }
    public static int calculateResult(int number1, int number2) {
        if (number1 == number2)
            return 0;
        if (number1 % 6 == number2 % 6)
            return (Math.min(number1, number2));
        return (Math.max(number1, number2));
    }
}

