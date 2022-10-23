import java.util.Scanner;

public class q8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();
        float average = (number1 + number2 + number3) / 3;
        System.out.println("Average: " + average);

    }
}
