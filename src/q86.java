// 107. Write a Java program to check if an array of integers contains three increasing adjacent numbers.

public class q86 {
    public static void main(String[] args) {
        int[] array = {1, 21, 22, 23, 1, 2, 3};
        System.out.println(checkArray(array));
    }

    public static boolean checkArray(int[] array) {
        int result1, result2;
        for (int i = 0; i < array.length - 2; i++) {
            result1 = array[i + 1] - array[i];
            result2 = array[i + 2] - array[i + 1];
            if (result1 == 1 && result2 == 1)
                return true;
        }
        return false;
    }

}
