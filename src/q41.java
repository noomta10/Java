// 61. Write a Java program to reverse a word.

import java.util.Scanner;

public class q41 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = input.next();
        String[] letters = word.split("");
        for (int i = letters.length - 1; i >= 0; i--){
            System.out.print(letters[i]);
        }
    }
}
