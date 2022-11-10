// 69. Write a Java program to extract the first half of a string of even length. Go to the editor

import java.util.Scanner;

public class q49 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();
        int middle = sentence.length() / 2;
        System.out.println(sentence.substring(0, middle));
    }
}
