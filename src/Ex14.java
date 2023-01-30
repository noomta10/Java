public class Ex14 {
    public static void main(String[] args){
        System.out.println(waterVolume(new int[]{1,2,3,1,2,4}));
    }

    // Q1
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int waterVolume(int[] heights) {
        int maxIndex = 0;
        int otherMax = 0;
        int countWater = 0;

        // Find the max height in the array
        for (int index =0; index < heights.length; index++) {
            if (heights[index] > maxIndex)
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
}
