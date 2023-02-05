public class Box3DTest {
    public static void main(String[] args){
        Point3D point = new Point3D(5,5,5);
        Box3D box1 = new Box3D(1,2,3, point);
        Box3D box2 = new Box3D(1,2,4, point);
        Point3D newPoint = new Point3D(0,0,0);
        Box3D box3 = new Box3D();
        box3.setWidth(2);
        System.out.println(box3);
        System.out.println(box3.equals(box1));
        System.out.println(box3.move(1.2,1.2,1.2));


        System.out.println(box1.getLength());
        System.out.println(box1.getWidth());
        System.out.println(box1.getHeight());
        box1.setBase(newPoint);
        System.out.println(box1);
        System.out.println(box1.getCenter());
        System.out.println(box2.getCenter());
        System.out.println(box1.distance(box2));
        System.out.println(box1.getVolume());
        System.out.println(box1.getSurfaceArea());
        System.out.println(box2.isLargerCapacity(box1));
        System.out.println(box1.contains(box2));
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box2.isAbove(box1));
    }
}
