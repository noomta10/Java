import java.util.Arrays;

public class CollectionTest {
    public static void main(String[] args) {
        Point3D point = new Point3D(0, 0, 0);
        Point3D point1 = new Point3D(10, 10, 10);



        Collection collection = new Collection();
        collection.addBox(1, 1, 1, point);
        collection.addBox(1, 1, 1, point);
        collection.addBox(1,1,1, point1);

        System.out.println(collection.longestDistance());

    }
}
