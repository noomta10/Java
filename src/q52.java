// 72. Write a Java program to create a new string taking first three characters from a given string.
// If the length of the given string is less than 3 use "#" as substitute characters.

import java.util.Scanner;

public class q52 {
    public static void main(String[] args){
        String newSentence;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        if (sentence.length() >= 3)
             newSentence = sentence.substring(0, 3);
        else
            if (sentence.length() == 0)
                newSentence = "###";
            else if (sentence.length() == 1) {
                newSentence = sentence + "##";
            }
            else
                newSentence = sentence + "#";

        System.out.println(newSentence);
    }
}
