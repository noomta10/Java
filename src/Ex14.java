public class Ex14 {
    public static void main(String[] args) {
        System.out.println(waterVolume(new int[]{1, 1, 2, 3, 1, 3}));
    }

    /**
     * Q1
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int waterVolume(int[] heights) {
        int maxIndex = 0;
        int otherMax = 0;
        int countWater = 0;

        // Find the max height in the array
        for (int index = 0; index < heights.length; index++) {
            if (heights[index] > heights[maxIndex])
                maxIndex = index;
        }

        // For the indexes to the left of the max height, the max height is their highest to the right
        for (int index = 0; index < maxIndex; index++) {
            if (heights[index] > otherMax)
                otherMax = heights[index];
            else
                countWater += otherMax - heights[index];
        }

        otherMax = 0;

        // For the indexes to the right of the max height, the max height is their highest to the left
        for (int index = heights.length - 1; index >= maxIndex; index--) {
            if (heights[index] > otherMax)
                otherMax = heights[index];
            else
                countWater += otherMax - heights[index];
        }

        return countWater;
    }


    /**
     * Q2
     * The method finds the length of the biggest sub-array which its sum of elements is even
     * Time complexity: O(n^3)
     * Space complexity: O(1)
     */

    public static int what(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
    }
}
