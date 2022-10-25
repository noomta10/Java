// 35. Write a Java program to compute the area of a polygon.

import java.util.Scanner;

public class q16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        int number = input.nextInt();
        System.out.print("Enter side length: ");
        float side = input.nextFloat();
        System.out.println("Area: " + calculateArea(number, side));
    }
    public static double calculateArea(int number, double side){
        return (number * side * side) / (4 * Math.tan(Math.PI / number));
    }
}