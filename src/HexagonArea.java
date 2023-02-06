// 34. Write a Java program to compute the area of a hexagon.

import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double side = input.nextDouble();
        System.out.println("Area: " + calculateArea(side));
    }

    public static double calculateArea(double side) {
        return (6 * side * side) / (4 * Math.tan(Math.PI / 6));
    }
}
