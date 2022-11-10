// 71. Write a Java program to create the concatenation of the two strings
// except removing the first character of each string. The length of the strings must be 1 and above.

import java.util.Scanner;

public class q51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String string1 = input.nextLine();
        System.out.print("Enter string 2: ");
        String string2 = input.nextLine();
        System.out.println(string1.substring(1) + string2.substring(1));
    }
}
