import java.util.Arrays;

public class try_java {
    public static void main(String[] args) {
        int sum = 0;
        int number = 155;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
    }
}
