// 121. Write a Java program to reverse a given linked list.

import java.util.Collections;
import java.util.LinkedList;

public class q101 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);
        System.out.println("Original Linked List :" + list);
        Collections.reverse(list);
        System.out.println("Original Linked List :" + list);
    }
}
