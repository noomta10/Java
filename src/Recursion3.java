public class Recursion3 {
    public static void main(String[] args) {
        System.out.println(countDigits(123456789));
    }

    public static int countDigits(int number) {
        if ((number < 10) && (number >= 0))
            return 1;
        return (1 + countDigits(number / 10));
    }
}
