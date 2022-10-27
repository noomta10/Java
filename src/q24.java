// 44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        String stringNumber = input.next();
        int number1 = Integer.parseInt(stringNumber);
        int number2 = Integer.parseInt(stringNumber + stringNumber);
        int number3 = Integer.parseInt(stringNumber + stringNumber + stringNumber);
        int sum = number1 + number2 + number3;

        System.out.printf("%s + %s%s + %s%s%s = %d", stringNumber, stringNumber, stringNumber,
                stringNumber, stringNumber, stringNumber, sum);
    }
}
