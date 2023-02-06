// 36. Write a Java program to compute the distance between two points on the surface of earth.

import java.util.Scanner;

public class TwoPointsDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double latitude1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double longitude1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double latitude2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double longitude2 = input.nextDouble();
        System.out.print("Distance: " + calculateDistance(latitude1, longitude1, latitude2, longitude2) + " km");
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        final float EARTH_RADIUS = 6371.01F;
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        return (EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
    }
}