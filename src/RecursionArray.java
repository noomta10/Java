public class RecursionArray {
    public static void main(String[] args){
        int[] array = {1,2,3};
        System.out.println(findMax(array, 0));
    }

    public static int findMax(int[] array, int i){
        if (i == array.length -1)
            return array[array.length-1];
        int currentMax = findMax(array, i+1);
        if (array[i] < currentMax)
            return currentMax;
        else
            return array[i];
    }
}
