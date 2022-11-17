// 87. Write a Java program than read an integer and calculate the sum of its digits
// and write the number of each digit of the sum in English.

import java.util.Scanner;

public class q67 {
    public static void main(String[] args) {
        try {
            int sum = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = input.nextInt();

            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            System.out.println("\nSum of digits: " + sum);
            System.out.print("In English: ");
            while (sum > 0)
                sum = printDigits(sum);
        }

        catch (Exception e){
            System.out.println("Invalid input");
        }
    }

    public static int printDigits(int sum) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int digit = sum % 10;
        sum /= 10;
        System.out.print(numbers[digit] + " ");
        return sum;
    }
}
