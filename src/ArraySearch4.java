// 98. Write a Java program to check if the value 20 appears three times
// and no 20's are next to each other in a given array of integers.

public class ArraySearch4 {
    public static void main(String[] args) {
        int[] numbers = {20, 1, 20, 20};
        int twentyCount = 0;
        System.out.println(checkTwenty(numbers, twentyCount));
    }

    public static boolean checkTwenty(int[] numbers, int twentyCount) {
        for (int number : numbers) {
            if (number == 20)
                twentyCount += 1;
        }

        boolean closeTwenties = false;
        for (int i = 0; i < numbers.length -1 ; i++) {
            if (numbers[i] == 20 && numbers[i + 1] == 20) {
                closeTwenties = true;
                break;
            }
        }
        return (twentyCount == 3 && !closeTwenties);
    }

}
