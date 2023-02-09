// 122. Write a Java program to find a contiguous subArray with the smallest sum from a given array of integers.

public class SubArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = {-2, -3, 4, -3, -3, 100, 1, -1, -100};
        int min_sum = 0;
        int max_sum = 0;
        int sum = 0;
        System.out.println("Min sum of sub array is " + FindMinSum(numbers, min_sum, sum));
        System.out.println("Max sum of sub array is " + FindMaxSum(numbers, max_sum, sum));
    }

    public static int FindMinSum(int[] numbers, int min_sum, int sum) {
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                sum += numbers[end];
                if (sum < min_sum)
                    min_sum = sum;
            }
            sum = 0;
        }
        return min_sum;
    }

    public static int FindMaxSum(int[] numbers, int max_sum, int sum) {
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                sum += numbers[end];
                if (sum > max_sum)
                    max_sum = sum;
            }
            sum = 0;
        }
        return max_sum;
    }
}
