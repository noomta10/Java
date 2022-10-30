// 55. Write a Java program to convert seconds to hour, minute and seconds.

import java.util.Scanner;

public class q35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        seconds = seconds % 60;
        int hours = minutes / 60;
        minutes = minutes % 60;
        System.out.printf("%d:%d:%d", hours, minutes, seconds);
    }
}
