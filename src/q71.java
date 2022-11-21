// 92. Write a Java program to count the number of even and odd elements in a given array of integers.

public class q71 {
    public static void main(String[] args) {
        int oddCount = 0;
        int evenCount = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int digit : numbers) {
            if (digit % 2 == 0) {
                evenCount++;
            } else
                oddCount++;
        }
        System.out.printf("Even count: %d\nOdd count: %d", evenCount, oddCount);
    }
}
