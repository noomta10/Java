import java.util.Scanner;

public class CalculateHypotenuse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter leg 1: ");
        double leg1 = input.nextDouble();
        System.out.print("Enter leg 2: ");
        double leg2 = input.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
        System.out.println("Hypotenuse is: " + hypotenuse);
        input.close();
    }
}
