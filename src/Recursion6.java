public class Recursion6 {
    public static int sum(int n) {
        if (n < 1)
            return 0;
        else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }

}
