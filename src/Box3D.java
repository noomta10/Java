public class Box3D {
    private Point3D base;
    private int length, width, height;
    final int INITIAL_RIB_VALUE = 1;

    Box3D() {
        this.length = INITIAL_RIB_VALUE;
        this.width = INITIAL_RIB_VALUE;
        this.height = INITIAL_RIB_VALUE;
        this.base = new Point3D();
    }

    Box3D(int length, int width, int height, Point3D base) {
        this.length = length < INITIAL_RIB_VALUE ? INITIAL_RIB_VALUE : length;
        this.width = width < INITIAL_RIB_VALUE ? INITIAL_RIB_VALUE : width;
        this.height = height < INITIAL_RIB_VALUE ? INITIAL_RIB_VALUE : height;
        this.base = new Point3D(base);
    }

    Box3D(Box3D otherBox) {
        this(otherBox.length, otherBox.width, otherBox.height, otherBox.base);
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public Point3D getBase() {
        return new Point3D(this.base);
    }

    public void setLength(int number) {
        if (this.length >= INITIAL_RIB_VALUE)
            this.length = number;
    }

    public void setWidth(int number) {
        if (this.width >= INITIAL_RIB_VALUE)
            this.width = number;
    }

    public void setHeight(int number) {
        if (this.height >= INITIAL_RIB_VALUE)
            this.height = number;
    }

    public void setBase(Point3D point3D) {
        this.base = new Point3D(point3D);
    }

    public String toString() {
        return "The base point is " + base.toString() + ", length: " + length +
                ", width: " + width + ", height: " + height;
    }

    public boolean equals(Box3D otherBox) {
        return (this.length == otherBox.length) && (this.width == otherBox.width) &&
                (this.height == otherBox.width) && (this.base.equals(otherBox.base));
    }

    public Box3D move(double dx, double dy, double dz) {
        Box3D newBox = new Box3D(this);
        newBox.base.move(dx, dy, dz);
        return newBox;
    }

    public Point3D getUpRightBackPoint() {
        Point3D upRightBackPoint = new Point3D();
        upRightBackPoint.move(-this.length, this.width, this.height);
        return upRightBackPoint;
    }

    public Point3D getCenter() {
        Point3D centerPoint = new Point3D();
        centerPoint.move(-this.length / 2.0, this.width / 2.0, this.height / 2.0);
        return centerPoint;
    }

    public double distance(Box3D otherBox) {
        return this.getCenter().distance(otherBox.getCenter());
    }

    public int getVolume() {
        return this.length * this.width * this.height;
    }

    public int getSurfaceArea() {
        return 2 * (this.length * this.width + this.length * this.height + this.height * this.width);
    }

    public boolean isLargerCapacity(Box3D otherBox) {
        return this.getVolume() > otherBox.getVolume();
    }

    public boolean contains(Box3D otherBox) {
        return (this.length > otherBox.length) && (this.width > otherBox.width) && (this.height > otherBox.height);
    }

    public boolean isAbove(Box3D otherBox) {
        return this.base.isAbove(otherBox.getUpRightBackPoint());
    }

}
