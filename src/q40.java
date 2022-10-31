// 60. Write a Java program to find the penultimate (next to last) word of a sentence.

import java.util.Scanner;

public class q40 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();
        String[] words = sentence.split("\s+");
        String penultimate = words[words.length - 2];
        System.out.println(penultimate);
    }
}
