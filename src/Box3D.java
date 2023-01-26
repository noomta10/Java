public class Box3D {
    Point3D base;
    int length, width, height;
    int INITIAL_RIB_VALUE = 1;

    Box3D(){
        this.length = INITIAL_RIB_VALUE;
        this.width = INITIAL_RIB_VALUE;
        this.height = INITIAL_RIB_VALUE;
        this.base = new Point3D();
    }

    Box3D(int length, int width, int height, Point3D base){
        this.length = length < INITIAL_RIB_VALUE ? INITIAL_RIB_VALUE : length;
        this.width = width < INITIAL_RIB_VALUE ? INITIAL_RIB_VALUE : width;
        this.height = height < INITIAL_RIB_VALUE ? INITIAL_RIB_VALUE : height;
    }

    Box3D(Box3D otherBox){
        this.length = otherBox.length;
        this.width = otherBox.width;
        this.height = otherBox.height;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
