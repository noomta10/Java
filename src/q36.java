// 56. Write a Java program to find the number of values in a given range divisible by a given value.

import java.util.Scanner;

public class q36 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
        System.out.printf("Number of integer in range %d-%d divisible by %d: ", number1, number2, number3);
        System.out.println(calculateNumbers(number1, number2, number3));

        }
        public static int calculateNumbers(int number1, int number2, int number3) {
            int numberOfDigits = 0;
            for (int i = number1; i <= number2; i++) {
                if (i % number3 == 0)
                    numberOfDigits += 1;
            }
            return numberOfDigits;
        }
}
