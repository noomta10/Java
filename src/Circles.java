// OU Mmn 11- The basics of the language

import java.util.Scanner;

public class Circles {
    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the areas and the perimeters " +
                "of the excircle and the incircle of a given rectangle ");
        System.out.println("Please enter the two coordinates of the left-upper point of the rectangle:");
        int leftUpX = scan.nextInt();
        int leftUpY = scan.nextInt();
        System.out.println("Please enter the two coordinates of the right-down point of the rectangle:");
        int rightDownX = scan.nextInt();
        int rightDownY = scan.nextInt();

        double excircleDiameter = Math.sqrt((Math.pow((rightDownX - leftUpX), 2) + Math.pow((rightDownY - leftUpY), 2)));
        double excircleRadius = excircleDiameter / 2;
        double excircleArea = Math.pow(excircleRadius, 2) * PI;
        double excirclePerimeter = 2 * PI * excircleRadius;

        int incircleDiameter = leftUpY - rightDownY;
        double incircleRadius = incircleDiameter / 2.0;
        double incircleArea = Math.pow(incircleRadius, 2) * PI;
        double incirclePerimeter = 2 * PI * incircleRadius;

        System.out.printf("Incircle: radius = %f, area = %f, perimeter = %f\n",
                incircleRadius, incircleArea, incirclePerimeter);
        System.out.printf("Excircle: radius = %f, area = %f, perimeter = %f",
                excircleRadius, excircleArea, excirclePerimeter);

    }
}
