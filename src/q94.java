// 114. Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right).

import java.util.Scanner;

public class q94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String myString = input.next();
        System.out.print("Enter offset: ");
        int offset = input.nextInt();

        if (offset > myString.length())
            throw new IllegalArgumentException("word has fewer than 3 characters!");

        System.out.println(offsetString(myString, offset));
    }

    public static String offsetString(String myString, int offset){
        String firstPart = myString.substring(myString.length() - offset);
        String lastPart = myString.substring(0, myString.length() - offset);
        return ("New string with offset: " + firstPart + lastPart);
    }
}