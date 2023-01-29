public class Collection {
    private Box3D[] boxes;
    private int numberOfBoxes;
    final int MAX_NUM_BOXES = 100;
    final int INITIAL_VALUE = 0;

    public Collection() {
        this.boxes = new Box3D[MAX_NUM_BOXES];
        this.numberOfBoxes = INITIAL_VALUE;
    }

    public boolean addBox(int length, int width, int height, Point3D base) {
        if (this.numberOfBoxes >= MAX_NUM_BOXES)
            return false;

        Box3D newBox = new Box3D(length, width, height, base);
        int BoxIndex = findSuitableIndex(newBox);
        moveBoxes(BoxIndex, newBox);
        this.numberOfBoxes++;

        return true;
    }

    public Box3D mostUpperBaseCorner() {
        if (this.numberOfBoxes == INITIAL_VALUE)
            return null;

        Box3D highest = boxes[INITIAL_VALUE];
        for (int i = 1; i < this.numberOfBoxes; i++) {
            if (boxes[i].getBase().isAbove(boxes[i - 1].getBase()))
                highest = this.boxes[i];
        }

        return new Box3D(highest);
    }

    public double totalSurfaceArea() {
        double total = INITIAL_VALUE;

        for (int i = 0; i < this.numberOfBoxes; i++)
            total += this.boxes[i].getSurfaceArea();

        return total;
    }

    public double longestDistance() {
        if (this.numberOfBoxes < 2)
            return INITIAL_VALUE;

        double longest = INITIAL_VALUE;

        for (int i = 0; i < this.numberOfBoxes; i++) {
            for (int j = i + 1; j < this.numberOfBoxes - i; j++) {
                double distance = this.boxes[i].distance(this.boxes[j]);
                if (distance > longest)
                    longest = distance;
            }
        }

        return longest;
    }


    public int howManyContains(Box3D box) {
        int count = 0;

        for (int i = 0; i < this.numberOfBoxes; i++) {
            if (this.boxes[i].contains(box))
                count++;
        }

        return count;
    }

    public int volumeOfSmallestBox(int i, int j) {
        if (j > MAX_NUM_BOXES || i > MAX_NUM_BOXES || i < 0 || j < 0 || j >= this.numberOfBoxes || i >= this.numberOfBoxes)
            return 0;

        int min = Math.min(i, j);
        int max = Math.max(i, j);

        int maxLength = INITIAL_VALUE;
        int maxWidth = INITIAL_VALUE;
        int maxHeight = INITIAL_VALUE;
        for (; min <= max; min++) {
            maxLength = Math.max(this.boxes[i].getLength(), maxLength);
            maxWidth = Math.max(this.boxes[i].getWidth(), maxWidth);
            maxHeight = Math.max(this.boxes[i].getHeight(), maxHeight);
        }

        return (maxLength + 1) * (maxWidth + 1) * (maxHeight + 1);
    }

    public Box3D[] getBoxes() {
        Box3D[] currentBoxes = new Box3D[this.numberOfBoxes];

        for (int i = 0; i < numberOfBoxes; i++)
            currentBoxes[i] = new Box3D(this.boxes[i]);

        return currentBoxes;
    }

    public int getNumberOfBoxes() {
        return this.numberOfBoxes;
    }

    public String toString() {
        String finalString = "";
        for (int i = 0; i < numberOfBoxes; i++)
            finalString += "Box no. " + (i + 1) + ": " + this.boxes[i] + "\n";

        return finalString;
    }

    private int findSuitableIndex(Box3D box) {
        for (int i = 0; i < this.numberOfBoxes; i++) {
            if (this.boxes[i].getVolume() >= box.getVolume())
                return i;
        }

        return this.numberOfBoxes;
    }

    private void moveBoxes(int boxIndex, Box3D newBox) {
        for (int i = this.numberOfBoxes; i > boxIndex; i--)
            this.boxes[i] = this.boxes[i - 1];
        this.boxes[boxIndex] = newBox;
    }

}
