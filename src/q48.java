// 68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
// The length of the original string must be 3 and above.

import java.util.Scanner;

public class q48 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();
        String last3Characters = sentence.substring(sentence.length() - 3);
        System.out.println(last3Characters + last3Characters + last3Characters + last3Characters);
    }
}
