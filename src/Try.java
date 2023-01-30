public class Try {
    public static void main(String[] args) {
        int[] heights = {1,2,7,4,2,6,1};
        int maxIndex = 0;
        for (int index = 0; index < heights.length; index++) {
            if (heights[index] > heights[maxIndex])
                maxIndex = index;
        }
        System.out.println("<b><i>O</i>(n^3)</b>");

    }
}


