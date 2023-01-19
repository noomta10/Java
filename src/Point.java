public class Point {
    private final int DEFAULT_VALUE = 0;
    private int x;
    private int y;

    // Main constructor, check that the point is in the first quarter
    public Point(int x, int y) {
        this.x = (x < DEFAULT_VALUE) ? DEFAULT_VALUE : x;
        this.y = (y < DEFAULT_VALUE) ? DEFAULT_VALUE : y;
    }

    // Copy constructor
    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    // Return x value
    public int getX() {
        return this.x;
    }

    // Return y value
    public int getY() {
        return this.y;
    }

    // Set new x, check that x is in the first quarter
    public void setX(int x) {
        if (x >= DEFAULT_VALUE)
            this.x = x;
    }

    // Set new y, check that y is in the first quarter
    public void setY(int y) {
        if (y >= DEFAULT_VALUE)
            this.y = y;
    }

    // Print the point
    public String toString() {
        return ("(" + this.x + ", " + this.y + ")");
    }

    // Return true if the points are equal
    public boolean equals(Point otherPoint) {
        return (this.x == otherPoint.x) && (this.y == otherPoint.y);
    }

    // Return true if the point is above the other point
    public boolean isAbove(Point otherPoint) {
        return (this.y > otherPoint.y);
    }

    // Return true if the point is right to the other point
    public boolean isRight(Point otherPoint) {
        return (this.x > otherPoint.x);
    }

    // Move the point, check that the new point is in the first quarter
    public void move(int deltaX, int deltaY) {
        if (this.x + deltaX >= DEFAULT_VALUE)
            this.x += deltaX;
        if (this.y + deltaY >= DEFAULT_VALUE)
            this.y += deltaY;
    }

    // Calculate the distance between 2 points
    public double distance(Point otherPoint) {
        return Math.sqrt(Math.pow((this.x - otherPoint.x), 2) + Math.pow((this.y - otherPoint.y), 2));
    }
}
