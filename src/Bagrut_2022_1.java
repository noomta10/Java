// Multiply two arrays

import java.util.Arrays;

public class Bagrut_2022_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(multiply(arr1, arr2)));
    }

    public static int[] multiply(int[] arr1, int[] arr2) {
        int m, k;
        int[] longer;

        if (arr1.length > arr2.length) {
            m = arr1.length;
            k = arr2.length;
            longer = arr1;
        } else {
            m = arr2.length;
            k = arr1.length;
            longer = arr2;
        }

        int[] arr3 = new int[m];

        for (int i = 0; i < k; i++)
            arr3[i] = arr1[i] * arr2[i];

        System.arraycopy(longer, k, arr3, k, m - k);

        return arr3;
    }
}
