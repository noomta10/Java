// 75. Write a Java program to test if the first and the last element of an array of integers are same.
// The length of the array must be greater than or equal to 2.

public class q55 {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 10};
        if (numbers.length < 2)
            System.out.println("Not a valid array!");
        else
            System.out.println(checkEqual(numbers));
    }

    public static boolean checkEqual(int[] numbers) {
        return (numbers[0] == numbers[numbers.length - 1]);
    }
}
