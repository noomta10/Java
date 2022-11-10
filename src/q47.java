// 67. Write a Java program to insert a word in the middle of the another string.

import java.util.Arrays;
import java.util.Scanner;

public class q47 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String sentence = input.nextLine();
        System.out.print("Enter word: ");
        String word = input.nextLine();

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int length = words.length;
        int middle = length / 2;
    }
}
