// Multidimensional arrays- calculates the total time athletes ran in each track
// and the total time each athlete ran

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] athleteTimes = {{1, 2, 3}, {1, 2, 3}};

        int tracks = athleteTimes.length;
        int athletes = athleteTimes[0].length;

        int[] trackSum = new int[tracks];
        int[] athletesSum = new int[athletes];

        for (int i = 0; i < tracks; i++) {
            for (int j = 0; j < athletes; j++) {
                trackSum[i] += athleteTimes[i][j];
                athletesSum[j] += athleteTimes[i][j];
            }
        }

        System.out.println(Arrays.toString(trackSum));
        System.out.println(Arrays.toString(athletesSum));
    }
}
