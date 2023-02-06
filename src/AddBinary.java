// 17. Write a Java program to add two binary numbers.

import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        int remainder = 0;
        int i = 0;
        int[] sum = new int[20];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary1 = input.nextInt();
        System.out.print("Enter another binary number: ");
        int binary2 = input.nextInt();

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (remainder != 0)
            sum[i++] = remainder;

        while (i > 0)
            System.out.print(sum[--i]);
    }
}