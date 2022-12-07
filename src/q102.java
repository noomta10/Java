// 122. Write a Java program to find a contiguous subArray with the smallest sum from a given array of integers.

public class q102 {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -3, -2, 1, 5, 3};

        int sum = 0;
        int min_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum < min_sum)
                min_sum = sum;
        }

        System.out.println("Min sum is " + min_sum);
    }
}
