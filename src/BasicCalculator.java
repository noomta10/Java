// 6. Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.


import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter operation: ");
        String operator = input.next();
        System.out.print("Enter number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();

        switch (operator) {
            case "+" -> System.out.println("Sum: " + (number1 + number2));
            case "-" -> System.out.println("remainder: " + (number1 - number2));
            case "/" -> System.out.println("Quotient: " + (number1 / number2));
            case "*" -> System.out.println("Product: " + (number1 * number2));
            default -> System.out.println("That is not a valid operator");
        }
    }
}
