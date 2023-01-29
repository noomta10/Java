import java.util.Arrays;

public class Collection {
    private Box3D[] boxes;
    private int numberOfBoxes;
    int MAX_NUM_BOXES = 100;
    int INITIAL_VALUE = 0;

    Collection() {
        this.boxes = new Box3D[MAX_NUM_BOXES];
        this.numberOfBoxes = INITIAL_VALUE;
    }

    public boolean addBox(int length, int width, int height, Point3D base) {
        if (this.numberOfBoxes >= MAX_NUM_BOXES)
            return false;
        Box3D box = new Box3D(length, width, height, base);
        int BoxIndex = findSuitableIndex(box);
        moveBoxes(BoxIndex, box);
        this.numberOfBoxes++;
        return true;
    }

    public Box3D mostUpperBaseCorner() {
        if (this.numberOfBoxes == INITIAL_VALUE)
            return null;
        Box3D highest = boxes[INITIAL_VALUE];
        for (int i = 1; i < this.numberOfBoxes; i++) {
            if (boxes[i].getBase().isAbove(boxes[i - 1].getBase()))
                highest = boxes[i];
        }
        return new Box3D(highest);
    }

    public double totalSurfaceArea(){
        int total = INITIAL_VALUE;
        for (int i = 0; i < this.numberOfBoxes; i++)
            total += boxes[i].getSurfaceArea();
        return total;
    }


    public double longestDistance(){
        if (this.numberOfBoxes < 2)
            return INITIAL_VALUE;

        double longest = INITIAL_VALUE;
        for (int i = 0; i < this.numberOfBoxes; i++){
            for (int j = i + 1; j < this.numberOfBoxes - i; j++){
                double distance = boxes[i].distance(boxes[j]);
                if (distance > longest)
                    longest = distance;
            }
        }
        return longest;
    }


    public int howManyContains(Box3D box){
        for (int i = 0; i < numberOfBoxes; i++){

        }
    }

    private int findSuitableIndex(Box3D box) {
        for (int i = 0; i < this.numberOfBoxes; i++) {
            if (boxes[i].getVolume() >= box.getVolume())
                return i;
        }
        return this.numberOfBoxes;
    }

    private void moveBoxes(int boxIndex, Box3D box) {
        for (int i = boxIndex; i <= this.numberOfBoxes; i++)
            boxes[i + 1] = boxes[i];
        boxes[boxIndex] = box;
    }


}
