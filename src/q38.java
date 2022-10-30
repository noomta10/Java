// 58. Write a Java program to capitalize the first letter of each word in a sentence.

import java.util.Scanner;

public class q38 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();
        String[] words = sentence.split("\\s+");

        for (String word : words){
            String firstLetter = word.substring(0, 1);
            System.out.print(firstLetter.toUpperCase());
            System.out.print(word.substring(1) + " ");
        }

    }
}
