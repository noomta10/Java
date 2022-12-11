public class TryJava {
    public static void main(String[] arg) {
        Food food1 = new Food("pizza");
        Food food2 = new Food("chips");
        Food food3 = new Food("burger");

        Food[] refrigerator = {food1, food2, food3};
        System.out.println(refrigerator[2].name);
    }
}
