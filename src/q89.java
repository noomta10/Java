// 110. Write a Java program to check whether a given integer is a power of 4 or not.

import java.util.Scanner;

public class q89 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        if (checkPower(number)){
            System.out.println("Number is a power of 4");
        }
        else
            System.out.println("Number is not a power of 4");
    }

    public static boolean checkPower(int number){
        for (int i = 0; i < number; i++){
            if (Math.pow(4, i) == number)
                return true;
        }
        return false;
    }

}
