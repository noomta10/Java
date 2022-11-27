// 109. Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.

public class q88 {
    public static void main(String[] args) {
        int coins = 14;
        System.out.println(getRowCount(coins));
    }

    public static int getRowCount(int coins) {
        if (coins < 1) return 0;
        int rows = 0;
        for (int i = coins; i > 0; ) {
            if (i - rows + 1 >= 0) {
                rows++;
                i -= rows;
            }
            else i--;
        }
        return rows;
    }

}
