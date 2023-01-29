public class Matrix {
    private int[][] matrix;
    final int firstElement = 0;
    final int BLACK = 250;
    final int WHITE = 0;


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

        for (int[] ints : this.matrix) {
            for (int j = 0; j < this.matrix[firstElement].length; j++)
                if (j == this.matrix[firstElement].length - 1)
                    stringBuilder.append(ints[j]).append("\n");
                else
                    stringBuilder.append(ints[j]).append("\t");
        }

        return stringBuilder.toString();
    }

    public Matrix makeNegative(){


        Matrix newMatrix = new Matrix(this.matrix);

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++)
                newMatrix.matrix[i][j] = BLACK - this.matrix[i][j];
        }

        return newMatrix;
    }

    public Matrix imageFilterAverage(){
return null;
    }

}
