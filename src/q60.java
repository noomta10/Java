// 80. Write a Java program to get the larger value between first and last element of an array (length 3) of integers.

public class q60 {
    public static void main(String[] args){
        int[] numbers = {9, 2, 3, 4, 15};
        int largerValue = Math.max(numbers[0], numbers[numbers.length - 1]);
        System.out.println("Larger value between first and last element: " + largerValue);
    }
}
