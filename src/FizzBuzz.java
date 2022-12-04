import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        boolean isDivisible_3 = (number % 3 == 0);
        boolean isDivisible_5 = (number % 5 == 0);

        if (isDivisible_3 && isDivisible_5)
            System.out.println("FizzBuzz");
        else if (isDivisible_3)
            System.out.println("Fizz");
        else if (isDivisible_5)
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}
