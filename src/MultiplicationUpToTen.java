//  7. Write a Java program that takes a number as an input and prints its multiplication table up to 10.

import java.util.Scanner;

public class MultiplicationUpToTen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        for (int i = 0; i < 10; i++){
            int result = number * (i + 1);
            System.out.println(number + "*" + (i+1) + "=" + result);
        }
    }
}
