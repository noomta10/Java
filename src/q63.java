// 83. Write a Java program to multiply corresponding elements of two arrays of integers.

public class q63 {
    public static void main(String[] args){
        int[] array1 = {1, 3, -5, 4};
        int[] array2 ={1, 4, -5, -2};
        System.out.print("Result: ");

        for (int i = 0; i < array1.length; i++){
            int multiply = array1[i] * array2[i];
            System.out.print(multiply + " ");
        }
    }
}
