public class Matrix {
    private int[][] matrix;

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
}
