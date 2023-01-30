public class MatrixTest {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        Matrix myMatrix = new Matrix(array);
        System.out.println(myMatrix);
        System.out.println("\n");
        System.out.println(myMatrix.rotateClockwise());
        System.out.println("\n");
        System.out.println(myMatrix.rotateCounterClockwise());
    }
}
