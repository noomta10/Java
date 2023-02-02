// 11. Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter: " + perimeter + "\nArea: " + area);
    }
}

