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

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty\n");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        System.out.println("Data not found in the list");
    }
}


public class Main {
    public static int[] getInputFromFile(String fileName) {
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
                System.out.println("Error: file empty\n");
                bufferReader.close();
                fileReader.close();
                System.exit(-1);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found\n");
        } catch (IOException e) {
            System.out.println("Error: can not read file\n");
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


    public static LinkedList makeHeap(LinkedList heap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name for array input: ");
        String fileName = scanner.nextLine();
        int[] numbers_array = getInputFromFile(fileName);
        heap = createLinkedList(numbers_array);
        heap.display();

        return heap;
    }


    public static LinkedList insert(LinkedList heap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to insert: ");
        int number_to_insert = scanner.nextInt();
        heap.add(number_to_insert);
        heap.display();

        return heap;
    }


    // public static void extractMin(LinkedList heap) {
    //     return;  
    // }


    public static void displayMenu(String listType, LinkedList heapA, LinkedList heapB) {
        Scanner scanner = new Scanner(System.in);
        int operationNumber;

        do {
            System.out.print("Enter desired operation:\n1. MAKE-HEAP A\n2. MAKE-HEAP B\n3. INSERT A\n4. INSERT B\n" +
                             "5. MINIMUM A\n6. MINIMUM B\n7. EXTRACT MIN A\n8. EXTRACT MIN B\n9. UNION\n10. EXIT\n");
            operationNumber = scanner.nextInt();

            switch (operationNumber) {
                case 1:
                    heapA = makeHeap(heapA);
                    break;
                case 2:
                    heapB = makeHeap(heapB);
                    break;
                case 3:
                    heapA = insert(heapA);
                    break;
                case 4:
                    heapB = insert(heapB);
                    break;
                case 5:
                    // handle MINIMUM A
                    break;
                case 6:
                    // handle MINIMUM B
                    break;
                case 7:
                    // handle EXTRACT MIN A
                    break;
                case 8:
                    // handle EXTRACT MIN B
                    break;
                case 9:
                    // handle UNION
                    break;
                case 10:
                    // Exit the loop when 10 is entered
                    break;
                default:
                    System.out.println("Error: operation number must be a number between 1 and 10\n");
                    break;
            }
        } while (operationNumber != 10);
    }



    public static String getListType() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array type (sorted or not sorted): ");
        String listType = scanner.nextLine();
        
        if (!listType.equals("sorted") && !listType.equals("not sorted")) {
            System.out.println(listType);
            System.out.println("Error: list type shold be 'sorted' or 'not sorted'\n");
            System.exit(-1);
        }

        return listType;
    }

    public static void main(String[] args) {
        int[] emptyArray = new int[0];
        LinkedList heapA = createLinkedList(emptyArray);
        LinkedList heapB = createLinkedList(emptyArray);
        String listType = getListType();
        displayMenu(listType, heapA, heapB);
    }
}
