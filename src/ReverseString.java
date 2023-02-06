// 37. Write a Java program to reverse a string.

import java.util.Scanner;
import java.lang.*;

class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();
        StringBuilder mutableSentence = new StringBuilder();
        mutableSentence.append(sentence);
        System.out.print("Reversed: " + mutableSentence.reverse());

    }
}
