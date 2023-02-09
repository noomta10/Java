// 115. Write a Java program to check if a positive number is a palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        if (checkPalindrome(number))
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number is not a palindrome");
    }

    public static boolean checkPalindrome(int number) {
        String stringNumber = Integer.toString(number);
        int numberLength = stringNumber.length();
        for (int i = 0; i < numberLength / 2; i++) {
            if (stringNumber.charAt(i) != stringNumber.charAt(numberLength - 1 - i))
                return false;
        }
        return true;
    }
}