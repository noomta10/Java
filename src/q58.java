// 78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.

public class q58 {
    public static void main(String[] args) {
        int[] numbers = {4, 0};
        System.out.println(checkNumbers(numbers));
    }

    public static boolean checkNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number == 4 | number == 7)
                return true;
        }
        return false;
    }
}
