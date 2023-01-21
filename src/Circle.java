public class Circle {
    private double radius;
    private Point center;
    private final int DEFAULT_RADIUS = 1;

    // Main constructor- get x, y, radius
    public Circle(int x, int y, double radius) {
        this.center = new Point(x, y);
        this.radius = (radius < DEFAULT_RADIUS) ? DEFAULT_RADIUS : radius;
    }


    // Another constructor- get point, radius
    public Circle(Point center, double radius) {
        this.center = new Point(center);
        this.radius = (radius < DEFAULT_RADIUS) ? DEFAULT_RADIUS : radius;
    }

    // Copy constructor- get circle
    public Circle(Circle otherCircle) {
        this.center = new Point(otherCircle.center);
        this.radius = otherCircle.radius;
    }

    // Return center point
    public Point getCenter() {
        return new Point(this.center);
    }

    // Return radius
    public double getRadius() {
        return this.radius;
    }

    // Set the center
    public void setCenter(Point center) {
        this.center = new Point(center);
    }

    // Set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Return perimeter
    public double perimeter() {
        return (2 * Math.PI * this.radius);
    }

    // Return area
    public double area() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    // Return area of the circle
    public void move(int deltaX, int deltaY) {
        this.center.move(deltaX, deltaY);
    }

    // Return true if circles are equal
    public boolean equals(Circle otherCircle) {
        return ((this.center.equals(otherCircle.center)) && (this.radius == otherCircle.radius));
    }

    // Return true if the circle is larger than the second circle
    public boolean isLarger(Circle otherCircle) {
        return (this.area() > otherCircle.area());
    }


    // Return true if the point is inside the circle
    public boolean isInCircle(Point point) {
        return (this.center.distance(point) <= this.radius);
    }

    // Print the center and the radius
    public String toString() {
        return "Center: " + this.center + "\nRadius: " + this.radius;
    }
}
