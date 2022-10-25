// 38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.

import java.util.Scanner;
import java.util.regex.Pattern;

public class q19 {
    public static void main(String[] args){
        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int others = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        char[] characters = sentence.toCharArray();

        for (char character : characters){
            String stringCharacter = Character.toString(character);
            if (Pattern.matches("[a-zA-z]", stringCharacter))
                letters ++;
            else if (Pattern.matches("[0-9]", stringCharacter))
                numbers ++;
            else if (Pattern.matches(" ", stringCharacter))
                spaces ++;
            else
                others ++;
        }
        System.out.printf("Letters: %d\nNumbers: %d\nSpaces: %d\nOthers: %d", letters, numbers, spaces, others);
    }
}
