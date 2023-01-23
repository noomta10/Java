public class BinarySearch {
    public static void main(String[] args) {
        int x = -1;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(array, x));
    }

    public static int binarySearch(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        int middle;

        while (low <= high) {
            middle = (low + high) / 2;
            if (array[middle] == x)
                return middle;
            if (array[middle] < x)
                low = middle + 1;
            else
                high = middle - 1;
        }
        return -1;
    }
}
