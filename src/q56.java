// 76. Write a Java program to test if the first or the last element of two array of integers are same.
// The length of the array must be greater than or equal to 2.

public class q56 {
    public static void main(String[] args){
        int[] numbers1 = {1};
        int[] numbers2 = {4, 5, 1};

        if (numbers1.length >=2 && numbers2.length >= 2){
            System.out.println(numbers1[0] == numbers2[numbers2.length - 1]);
        }
        else
            System.out.println("Not a valid array!");
    }
}
