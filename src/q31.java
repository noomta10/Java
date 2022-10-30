// 51. Write a Java program to convert a string to an integer in Java.

import java.util.Scanner;

public class q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string number: ");
        String string = input.next();
        int integer = Integer.parseInt(string);
        System.out.printf("String value: %s\nInteger value: %d", string, integer);
    }
}
