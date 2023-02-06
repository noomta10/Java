// Multidimensional arrays- calculates the total time athletes ran in each track
// and the total time each athlete ran

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] athleteTimes = {{1, 2, 3}, {1, 2, 4}};

        int tracks = athleteTimes.length;
        int athletes = athleteTimes[0].length;

        int[] trackSum = new int[tracks];
        int[] athletesSum = new int[athletes];

        for (int track = 0; track < tracks; track++) {
            for (int athlete = 0; athlete < athletes; athlete++) {
                trackSum[track] += athleteTimes[track][athlete];
                athletesSum[athlete] += athleteTimes[track][athlete];
            }
        }

        System.out.println(Arrays.toString(trackSum));
        System.out.println(Arrays.toString(athletesSum));
    }
}
