// OU Mmn 13- loops and arrays

public class Matrix {
    private final int[][] matrix;
    final int BLACK = 255;

    public Matrix(int[][] array) {
        this.matrix = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                this.matrix[i][j] = array[i][j];
        }
    }

    public Matrix(int size1, int size2) {
        this.matrix = new int[size1][size2];
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int[] row : this.matrix) {
            for (int col = 0; col < this.matrix[0].length; col++)
                if (col == this.matrix[0].length - 1)
                    stringBuilder.append(row[col]).append("\n");
                else
                    stringBuilder.append(row[col]).append("\t");
        }

        return stringBuilder.toString();
    }

    public Matrix makeNegative() {

        Matrix newMatrix = new Matrix(this.matrix);

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++)
                newMatrix.matrix[i][j] = BLACK - this.matrix[i][j];
        }

        return newMatrix;
    }

    public Matrix imageFilterAverage() {
        int neighborsNumber;
        Matrix newMatrix = new Matrix(this.matrix.length, this.matrix[0].length);

        for (int row = 0; row < newMatrix.matrix.length; row++) {
            for (int col = 0; col < newMatrix.matrix[row].length; col++) {
                neighborsNumber = findNeighbors(row, col, newMatrix);
                newMatrix.matrix[row][col] /= neighborsNumber;
            }
        }

        return newMatrix;
    }

    public Matrix rotateClockwise() {
        Matrix newMatrix = new Matrix(this.matrix[0].length, this.matrix.length);
        int counter = 0;

        int[] cells = createArray();

        for (int col = newMatrix.matrix[0].length - 1; col >= 0; col--) {
            for (int row = 0; row < newMatrix.matrix.length; row++) {
                newMatrix.matrix[row][col] = cells[counter];
                counter++;
            }
        }

        return newMatrix;
    }

    public Matrix rotateCounterClockwise() {
        return rotateClockwise().rotateClockwise().rotateClockwise();
    }

    private int findNeighbors(int row, int col, Matrix newMatrix) {
        int neighborsNumber = 0;

        for (int i = row - 1; i < row + 2; i++) {
            for (int j = col - 1; (j < col + 2) && (i >= 0 && i < newMatrix.matrix.length); j++) {
                if (j >= 0 && j < newMatrix.matrix[0].length) {
                    newMatrix.matrix[row][col] += this.matrix[i][j];
                    neighborsNumber++;
                }
            }
        }

        return neighborsNumber;
    }

    private int[] createArray() {
        int counter = 0;
        int[] cells = new int[this.matrix[0].length * this.matrix.length];

        for (int[] row : this.matrix) {
            for (int col = 0; col < this.matrix[0].length; col++) {
                cells[counter] = row[col];
                counter++;
            }
        }

        return cells;
    }

}


