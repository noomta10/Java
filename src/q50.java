// 70. Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
// The strings must not have the same length

import java.util.Scanner;

public class q50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String string1 = input.nextLine();
        System.out.print("Enter string 2: ");
        String string2 = input.nextLine();

        if (string1.length() == string2.length())
            System.out.println("The strings must not have the same length!");
        else if (string1.length() < string2.length())
            System.out.println(string1 + string2 + string1);
        else
            System.out.println(string2 + string1 + string2);
    }
}
