// 102. Write a Java program to check if a specified array of integers contains 10 or 30.

public class q81 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 30, 10};
        System.out.println(checkNumbers(numbers));
    }

    public static boolean checkNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number == 10 || number == 30)
                return true;
        }
        return false;
    }

}
