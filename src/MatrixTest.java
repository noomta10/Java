public class MatrixTest {
    public static void main(String[] args){
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix myMatrix = new Matrix(array);
        System.out.println(myMatrix.makeNegative());
    }
}
