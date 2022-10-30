// 57. Write a Java program to accepts an integer and count the factors of the number.

import java.util.Scanner;

public class q37 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.println("Number of factors: " + findFactors(number));
    }

    public static int findFactors(int number){
        int factors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                factors++;
        }
        return factors;
    }
}
