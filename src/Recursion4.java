public class Recursion4 {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }

    public static long power(int base, int pow) {
        if (pow == 0)
            return 1;
        return (base * power(base,pow - 1));
    }
}
