public class PointTester {
    public static void main(String[] args) {

        Point point = new Point(0, 4);
        Point point1 = new Point(4,7);
        System.out.println(point.distance(point1));
//        point.move(-2,1);
//        point.printStatus();
//
//        System.out.println(point.getX());
//        point.setX(13);

        Point point2 = new Point(1, 1);

        if (point2.equals(point))
            System.out.println("Points are equal");
        else
            System.out.println("Points are different");

        System.out.println(point2);
        Point newPoint = new Point(point2);
        System.out.println(newPoint);
    }
}
