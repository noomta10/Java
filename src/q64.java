// 84. Write a Java program to take the last three characters from a given string
// and add the three characters at both the front and back of the string.
// String length must be greater than three and more.

import java.util.Scanner;

public class q64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        if (sentence.length() <= 3)
            System.out.println("sentence length must be greater than 3!");
        else {
            String last3Characters = sentence.substring(sentence.length() -3);
            System.out.println(last3Characters + sentence + last3Characters);
        }
    }
}
