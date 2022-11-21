// 95. Write a Java program to create an array (length # 0) of string values.
// The elements will contain "0", "1", "2" … through ... n-1.

import java.util.Arrays;
import java.util.Scanner;

public class q74 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        String[] numbers = new String[number];

        for (int i = 0; i < number; i++){
            numbers[i] = String.valueOf(i);
        }
        System.out.println(Arrays.toString(numbers));

    }
}
