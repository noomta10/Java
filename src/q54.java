// 74. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
// The length of the array must be greater than or equal to 2.

public class q54 {
    public static void main(String[] args) {
        int[] numbers = {1, 10};
        if (numbers.length < 2)
            System.out.println("Not a valid array!");
        else
            System.out.println(findTen(numbers));

    }

    public static boolean findTen(int[] numbers){
        return numbers[0] == 10 || numbers[numbers.length - 1] == 10;
    }
}
