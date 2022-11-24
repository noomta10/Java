// 101. Write a Java program to check if the number of 10 is greater than number to 20 in a given array of integers.

public class q80 {
    public static void main(String[] args) {
        int[] numbers = {10, 10, 10, 20, 20, 20, 20};
        int tenCount = 0;
        int twentyCount = 0;
        for (int number : numbers) {
            if (number == 10)
                tenCount++;
            if (number == 20)
                twentyCount++;
        }

        System.out.println(tenCount > twentyCount);


    }
}
