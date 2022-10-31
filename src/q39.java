// 59. Write a Java program to convert a given string into lowercase.

import java.util.Scanner;
public class q39 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();
        System.out.print(sentence.toLowerCase());
    }
}
