public class PointTester {
    public static void main(String[] args){

        Point point = new Point(0,0);
        point.printStatus();

        point.move(-2,1);
        point.printStatus();

        System.out.println(point.getX());
        point.setX(13);

    }
}
