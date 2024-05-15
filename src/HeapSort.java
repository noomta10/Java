import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


public class Main {
    public static int[] get_input_from_file(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
            String line = bufferReader.readLine(); 

            if (line != null) {
                String[] numbersString = line.trim().split("\\s+");
                int[] numbers = new int[numbersString.length];
                
                for (int i = 0; i < numbersString.length; i++) {
                    numbers[i] = Integer.parseInt(numbersString[i]); 
                }

            bufferReader.close();
            fileReader.close();
            return numbers;
                
            } else {
                System.out.println("Error: file empty");
                bufferReader.close();
                fileReader.close();
                System.exit(-1);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found.");
        } catch (IOException e) {
            System.out.println("Error: can not read file.");
            e.printStackTrace();
        }
            return null;
    }


    public static LinkedList createLinkedList(int[] array) {
        LinkedList linkedList = new LinkedList();
        
        for (int i = 0; i < array.length; i++) {
            linkedList.add(array[i]);
        }

        return linkedList;
    }


    public static String[] get_user_parameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter array type (sorted or not sorted): ");
        String listType = scanner.nextLine();
        scanner.close();

        return new String[]{fileName, listType};
    }

    public static void main(String[] args) {
        String[] parameters = get_user_parameters();
        String fileName = parameters[0];
        String listType = parameters[1];
        int[] numbers_array = get_input_from_file(fileName);
        LinkedList linkedList = createLinkedList(numbers_array);
        linkedList.display();

    }
}
