import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args){
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Yarden");
        myLinkedList.add("Noam");
        myLinkedList.add("Ariel");
        myLinkedList.add(2, "Mom");
        System.out.println(myLinkedList);


        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Yarden");
        myArrayList.add("Noam");
        myArrayList.add("Ariel");
        myArrayList.add(2, "Mom");
        System.out.println(myArrayList);


    }
}
