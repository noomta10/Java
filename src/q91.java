// 112. Write a Java program to compute the number of trailing zeros in a factorial.

import java.util.Scanner;

public class q91 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        long factorial = findFactorial(number);
        int zeros = findZeros(factorial);
        System.out.printf("Number of zeros in the factorial %d: %d", factorial, zeros);
    }

    public static long findFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        return factorial;
    }

    public static int findZeros(long factorial) {
        int trail = 0;
        int zeros = 0;
        while (trail == 0) {
            trail = (int) (factorial % 10);
            factorial /= 10;
            if (trail == 0)
                zeros += 1;
        }
        return zeros;
    }
}
