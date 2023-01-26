import java.util.Scanner;

public class Mmn11b_2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program solves a system of 2 linear equations");
        System.out.println("Enter the coefficients a11 a12 a21 a22 b1 b2 ");
        int a11 = scanner.nextInt();
        int a12 = scanner.nextInt();
        int a21 = scanner.nextInt();
        int a22 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();

        System.out.println("Eq1: " + a11 + "*x1 + " + a12 + "*x2 = " + b1);
        System.out.println("Eq2: " + a21 + "*x1 + " + a22 + "*x2 = " + b2);

        if ((a11 * a22 - a12 * a21) != 0) {
            double firstSolution = (double) (b1 * a22 - b2 * a12) / (a11 * a22 - a12 * a21);
            double secondSolution = (double) (b2 * a11 - b1 * a21) / (a11 * a22 - a12 * a21);
            System.out.printf("Single solution: (%.1f, %.1f)", firstSolution, secondSolution);
        }
        else if (
                (b2 * a11 - b1 * a21 != 0) &&
                (b1 * a22 - b2 * a12 == 0) && !
                ((a11 == 0) && (a12 == 0) && (b1 != 0)) && !
                ((a21 == 0) && (a22 == 0) && (b2 != 0))
        ) {
            System.out.println("Many solutions");
        }
        else
            System.out.println("No solutions");
    }
}
