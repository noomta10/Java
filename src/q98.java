// 118. Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.

import java.util.Scanner;

public class q98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.print("Enter a substring: ");
        String substring = input.nextLine();

        int index = string.indexOf(substring);
        if (index == -1)
            System.out.println("There is no occurrence of the substring in the given string.");
        else
            System.out.println("First occurrence index: " + index);
    }
}
