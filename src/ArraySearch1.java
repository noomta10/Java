// 93. Write a Java program to test if an array of integers contains
// an element 10 next to 10 or an element 20 next to 20, but not both.

public class ArraySearch1 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 20, 2, 1, 10, 10};
        boolean has1010 = checkTens(numbers);
        boolean has2020 = checkTwenties(numbers);
        System.out.println(has1010 && !has2020 || has2020 && !has1010);
    }

    public static boolean checkTens(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 10 && numbers[i + 1] == 10)
                return true;
        }
        return false;
    }

    public static boolean checkTwenties(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 20 && numbers[i + 1] == 20)
                return true;
        }
        return false;
    }

}
