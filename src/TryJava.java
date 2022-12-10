import java.util.ArrayList;
import java.util.Arrays;

public class TryJava {
    public static void main(String[] arg) {
        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Chips");

        System.out.println(food.get(0));

        String[] food2 = {"Pizza","Chips"};
        String x = food2[0];
        System.out.println(x);
    }
}
