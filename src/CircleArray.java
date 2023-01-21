import java.util.Arrays;

public class CircleArray {

    // Attributes and constants
    private Circle[] circleArray;
    private int numberOfCircles;
    public final int MAX_CIRCLES = 10;

    // Main constructor
    public CircleArray() {
        this.circleArray = new Circle[MAX_CIRCLES];
        this.numberOfCircles = 0;
    }


    // Add circle to array
    public boolean addCircle(Point point, Double radius) {
        if (this.numberOfCircles >= MAX_CIRCLES)
            return false;
        this.circleArray[this.numberOfCircles++] = new Circle(point, radius);
        return true;
    }

    // Return highest circle in the array
    public Circle highestCircle() {
        if (this.numberOfCircles == 0)
            return null;
        Circle highestCircle = this.circleArray[0];
        for (int i = 1; i < this.numberOfCircles; i++) {
            if (this.circleArray[i].getCenter().isAbove(highestCircle().getCenter()))
                highestCircle = this.circleArray[i];
        }
        return new Circle(highestCircle);
    }

    // Return biggest circle in the array
    public Circle biggestCircle() {
        if (this.numberOfCircles == 0)
            return null;
        Circle biggestCircle = this.circleArray[0];
        for (int i = 1; i < this.numberOfCircles; i++)
            if (this.circleArray[i].area() > biggestCircle.area())
                biggestCircle = this.circleArray[i];
        return new Circle(biggestCircle);
    }


    // Remove specified circle from the array
    public boolean removeCircle(Circle circleToRemove) {
        for (int i = 0; i < this.numberOfCircles; i++) {
            if (this.circleArray[i].equals(circleToRemove)) {
                for (int j = i; j < this.numberOfCircles - 1; j++)
                    this.circleArray[j] = this.circleArray[j + 1];
                this.circleArray[numberOfCircles - 1] = null;
                this.numberOfCircles--;
                return true;
            }
        }
        return false;
    }

    public String getCircleArray(){
        return Arrays.toString(this.circleArray);
    }
}

