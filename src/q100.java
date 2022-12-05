// 120. Write a Java program that searches a value in an m x n matrix.


import java.util.Scanner;

public class q100 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an element: ");
        int element = input.nextInt();

        if (searchMatrix(matrix, element))
            System.out.println("Element is present in the matrix");
        else
            System.out.println("Element is not present in the matrix");
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] array : matrix) {
            for (int number : array) {
                if (number == target)
                    return true;
            }
        }
        return false;
    }

}
