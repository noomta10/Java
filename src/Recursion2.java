public class Recursion2 {
    public static void main(String[] args) {
        printUp(2);
    }

    public static void printUp(int number) {
        if (number > 0) {
            printUp(number - 1);
            System.out.println(number);
        }
    }
}
