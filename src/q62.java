// 82. Write a Java program to find the largest element between first, last, and middle values
// from an array of integers (even length).

public class q62 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 13, 4, 5};
        int largest = Math.max(numbers[0], Math.max(numbers[numbers.length-1], numbers[numbers.length / 2]));
        System.out.println("Largest element between first, last, and middle values: " + largest);
    }
}
