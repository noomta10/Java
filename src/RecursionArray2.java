public class RecursionArray2 {
    public static void main(String[] args){
        int[] array = {1,2,4};
        System.out.println(recursionFind(array, 0, 3));
    }

    public static boolean recursionFind(int[] array, int i, int numberToFind){
        if (i == array.length)
            return false;
        if (array[i] == numberToFind)
            return true;
        return recursionFind(array, i+1, numberToFind);
    }
}
