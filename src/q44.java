// 64. Write a Java program that accepts two integer values between 25 and 75
// and return true if there is a common digit in both numbers.

import java.util.Scanner;

public class q44 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number between 25 and 75: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number between 25 and 75: ");
        int number2 = input.nextInt();
        System.out.print("Result: " + checkCommonDigit(number1, number2));
    }
    public static boolean checkCommonDigit(int number1, int number2){
        if (number1 < 25 || number1 > 75 || number2 < 25 || number2 > 75)
            return false;
        int lastDigitNumber1 = number1 % 10;
        int lastDigitNumber2 = number2 % 10;
        int firstDigitNumber1 = number1 / 10;
        int firstDigitNumber2 = number2 / 10;
        return (firstDigitNumber1 == firstDigitNumber2 || firstDigitNumber1 == lastDigitNumber2 ||
                lastDigitNumber1 == firstDigitNumber2 || lastDigitNumber1 == lastDigitNumber2);
    }
}
