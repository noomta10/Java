// 13. Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class q9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        float width = input.nextFloat();
        System.out.print("Enter height: ");
        float height = input.nextFloat();
        float area = height * width;
        float perimeter = height * 2 + width * 2;
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
    }
}
