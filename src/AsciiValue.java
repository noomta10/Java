// 41. Write a Java program to print the ascii value of a given character.

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character: ");
        char character = input.next().charAt(0);
        System.out.printf("The ASCII value of " + character + " is " + (int) character);
    }
}
