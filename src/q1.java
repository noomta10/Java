// 1. Write a Java program to print 'Hello' on screen and then print your name.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Hello " + name);
    }
}
