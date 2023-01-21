import java.util.Arrays;

public class TRY {
    public static void main(String[] args) {
        CircleArray circleArray = new CircleArray();
        Point point1 = new Point(1,2);
        Point point2 = new Point(3,4);
        circleArray.addCircle(point1, 2.0);
        circleArray.addCircle(point2, 1.0);
        System.out.println((circleArray.getCircleArray()));
        System.out.println(circleArray.biggestCircle());
        System.out.println();
        System.out.println(circleArray.highestCircle());

    }
}
