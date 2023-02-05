// OU Mmn 14- efficiency and recursion
public class Ex14 {
    public static void main(String[] args) {
        System.out.println(waterVolume(new int[]{1, 1, 2, 3, 1, 3}));
        System.out.println(what(new int[]{1, 2, 3}));
        System.out.println(solutions(5));
    }

    /*
      Q1
      Time complexity: O(n)
      Space complexity: O(1)
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


    /*
      Q2
      The method finds the length of the biggest sub-array which its sum of elements is even
      Time complexity: O(n^3)
      Space complexity: O(1)
      New method time complexity: O(n)
      New method space complexity: O(1)
     */
    public static int what(int[] a) {
        int sum = 0;

        for (int number : a)
            sum += number;
        if (sum % 2 == 0)
            return a.length;

        else {
            for (int lastIndex = a.length - 2; lastIndex >= 0; lastIndex--) {
                if (a[lastIndex] % 2 == 0)
                    return lastIndex + 1;
                else {
                    if (a[lastIndex - 1] % 2 != 0)
                        return lastIndex + 1;
                }

            }

            return 0;
        }
    }


    // Q3
    public static int solutions(int number) {
        if (number < 3 || number > 30)
            return 0;
        else
            return solutions(number, 1, 1, 1, 0);
    }

    public static int solutions(int number, int x1, int x2, int x3, int counter) {
        if (x1 + x2 + x3 == number) {
            System.out.println(x1 + " + " + x2 + " + " + x3 + " = " + number);
            counter++;
        }

        if (x1 == 10) {
            if (x2 == 10) {
                if (x3 == 10) {
                    return counter;
                } else {
                    x1 = 1;
                    x2 = 1;
                    return solutions(number, x1, x2, x3 + 1, counter);
                }
            } else {
                x1 = 1;
                return solutions(number, x1, x2 + 1, x3, counter);
            }
        } else return solutions(number, x1 + 1, x2, x3, counter);
    }

}
