// 85. Write a Java program to check if a string starts with a specified word.

import java.util.Scanner;

public class q65 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word to check if a string starts with it: ");
        String word = input.nextLine();
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.println(sentence.startsWith(word + "\s"));
    }
}
