// 100. Write a Java program to count the two elements of two given arrays
// of integers with same length, differ by 1 or less.

public class ArraySearch6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 17, 6};
        int[] array2 = {1, 2, 4, 18, 10};
        int result;
        int count = 0;
        int index = 0;

        while (index < array1.length) {
            result = Math.abs(array1[index] - array2[index]);
            if (result == 1 || result == 0)
                count +=1;
            index += 1;
        }

        System.out.println("Number of elements differ by 1 or less: " + count);

    }
}
