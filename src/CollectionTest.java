import java.util.Arrays;

public class CollectionTest {
    public static void main(String[] args) {
        Point3D point = new Point3D(0, 0, 0);
        Point3D point1 = new Point3D(10, 10, 10);
//
//
//
//        Collection collection = new Collection();
//        collection.addBox(1, 2, 1, point);
//        collection.addBox(1, 1, 1, point);
//        collection.addBox(2,2,3, point1);
//
//        Box3D myBox = new Box3D(1,1,2, point);
//
//        System.out.println(collection.howManyContains(myBox));
//        System.out.println(collection.volumeOfSmallestBox(0,2));
//        System.out.println(Arrays.toString(collection.getBoxes()));
//        System.out.println(collection);
//

        Collection c = new Collection();
        c.addBox(1,1,1,point);
        c.addBox(1,2,1,point);
        System.out.println(c);


        Box3D box3D = c.mostUpperBaseCorner();
        box3D.setHeight(8);

        System.out.println(c);
    }
}
