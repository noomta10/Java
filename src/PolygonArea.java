// 35. Write a Java program to compute the area of a polygon.

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sidesNumber of sides: ");
        int sidesNumber = input.nextInt();
        System.out.print("Enter side length: ");
        float sideLength = input.nextFloat();
        System.out.println("Area: " + calculateArea(sidesNumber, sideLength));
    }

    public static double calculateArea(int sidesNumber, double sideLength) {
        return (sidesNumber * sideLength * sideLength) / (4 * Math.tan(Math.PI / sidesNumber));
    }
}