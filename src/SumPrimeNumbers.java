// 66. Write a Java program to compute the sum of the first 100 prime numbers.

public class SumPrimeNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int number = 2; counter < 100; number++)
            if (checkPrime(number)) {
                counter += 1;
                sum += number;
            }
        System.out.println("Sum of first 100 primary numbers: " + sum);
    }

    public static boolean checkPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
