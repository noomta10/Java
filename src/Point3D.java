public class Point3D {
    private final double INITIAL_POINT_VALUE = 0;
    final double TOLERANCE = 0.0000001;

    private double x, y, z;

    Point3D() {
        this.x = INITIAL_POINT_VALUE;
        this.y = INITIAL_POINT_VALUE;
        this.z = INITIAL_POINT_VALUE;
    }

    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D(Point3D otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
        this.z = otherPoint.z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    public boolean equals(Point3D otherPoint) {
        return (Math.abs(this.x - otherPoint.x) < TOLERANCE && Math.abs(this.y - otherPoint.y) < TOLERANCE &&
                Math.abs(this.z - otherPoint.z) < TOLERANCE);
    }

    public boolean isAbove(Point3D otherPoint) {
        return (this.z > otherPoint.z);
    }

    public boolean isUnder(Point3D otherPoint) {
        return otherPoint.isAbove(this);
    }

    public boolean isLeft(Point3D otherPoint) {
        return (this.y < otherPoint.y);
    }

    public boolean isRight(Point3D otherPoint) {
        return otherPoint.isLeft(this);
    }

    public boolean isBehind(Point3D otherPoint) {
        return (this.x < otherPoint.x);
    }

    public boolean isInFrontOf(Point3D otherPoint) {
        return otherPoint.isBehind(this);
    }

    public void move(double dx, double dy, double dz) {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }

    public double distance(Point3D otherPoint) {
        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2)
                + Math.pow(this.z - otherPoint.z, 2));
    }
}
