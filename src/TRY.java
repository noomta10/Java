import java.util.Arrays;

public class TRY {
    public static void main(String[] args) {
        CircleArray circleArray = new CircleArray();
        Point point1 = new Point(1,2);
        Point point2 = new Point(3,4);
        circleArray.addCircle(point1, 1.0);
        circleArray.addCircle(point2, 2.0);
        System.out.println((circleArray.getCircleArray()));
        circleArray.highestCircle();

    }
}
