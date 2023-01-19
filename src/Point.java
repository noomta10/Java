// Point in the first quarter

public class Point {
    final int DEFAULT_VALUE = 0;
    private int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;

        if (this.x < DEFAULT_VALUE)
            this.x = 0;

        if (this.y < DEFAULT_VALUE)
            this.y = 0;
    }
    public void move(int deltaX, int deltaY) {
        if (this.x + deltaX >= DEFAULT_VALUE)
            this.x += deltaX;
        if(this.y + deltaY >= DEFAULT_VALUE)
            this.y += deltaY;
    }

    public void move(double deltaX, double deltaY) {
        if (this.x + deltaX >= DEFAULT_VALUE)
            this.x += deltaX;
        if(this.y + deltaY >= DEFAULT_VALUE)
            this.y += deltaY;
    }

    public void printStatus() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        if (x >= DEFAULT_VALUE)
            this.x = x;
    }
}
