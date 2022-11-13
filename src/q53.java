// 73. Write a Java program to create a new string taking first and last characters from two given strings.
// If the length of either string is 0 use "#" for missing character.


import java.util.Scanner;

public class q53 {
    public static void main(String[] args) {
        String firstCharacter, lastCharacter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String string1 = input.nextLine();
        System.out.print("Enter another sentence: ");
        String string2 = input.nextLine();

        firstCharacter = string1.length() == 0 ? "#" : string1.substring(0, 1);
        lastCharacter = string2.length() == 0 ? "#" : string2.substring(string2.length() - 1);

        System.out.println(firstCharacter + lastCharacter);
    }
}
