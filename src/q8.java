// 12. Write a Java program that takes numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class q8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (n) of numbers you want to calculate the average: ");
        int number = input.nextInt();
        int sum = 0;
        int x = 0;

        while (number > x){
            System.out.print("Enter number: ");
            sum += input.nextInt();
            x += 1;
        }

        float average = sum / number;
        System.out.println("Average: " + average);
    }
}
