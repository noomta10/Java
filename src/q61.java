// 81. Write a Java program to swap the first and last elements of an array
// (length must be at least 1) and create a new array.

import java.util.Arrays;

public class q61 {
    public static void main(String[] args){
        int[] myArray = {1, 2, 3, 4, 5};
        if (myArray.length < 1)
            System.out.println("Array not valid!");
        else{
            int[] newArray = new int[myArray.length];
            newArray[0] = myArray[myArray.length - 1];
            newArray[newArray.length -1] = myArray[0];
            System.arraycopy(myArray, 1, newArray, 1, myArray.length - 2);
            System.out.println(Arrays.toString(newArray));
        }
    }
}
