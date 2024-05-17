import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.*;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class Heap {
    Node head;

    public Heap() {
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

    public void addOrdered(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        newNode.next = current.next;
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

    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty\n");
            return;
        }
        
        head = head.next;
    }

    public void heapSort() {
        if (head == null || head.next == null)
            return;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Node current = head;
        while (current != null) {
            minHeap.offer(current.data);
            current = current.next;
        }

        current = head;
        while (!minHeap.isEmpty()) {
            current.data = minHeap.poll();
            current = current.next;
        }
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
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("Error: can not read file\n");
            e.printStackTrace();
        }
            return null;
    }


    public static Heap createHeap(int[] array) {
        Heap heap = new Heap();
        
        for (int i = 0; i < array.length; i++) {
            heap.add(array[i]);
        }

        return heap;
    }


    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static Heap makeHeap(Heap heap, String listType) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name for array input: ");
        String fileName = scanner.nextLine();
        int[] numbersArray = getInputFromFile(fileName);

        if (listType.equals("sorted")){
            bubbleSort(numbersArray);
        }

        heap = createHeap(numbersArray);
        
        System.out.println("Heap created:");
        heap.display();

        return heap;
    }


    public static void insert(Heap heap, String listType) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to insert: ");
        int numberToInsert = scanner.nextInt();

        if (listType.equals("sorted")){
           heap.addOrdered(numberToInsert);
        } else {
            heap.add(numberToInsert);
        }

        System.out.println("Heap after insertion:");
        heap.display();
    }


    public static void extractMin(Heap heap, String listType) {
        Node current = heap.head; 
        if (current == null){
            System.out.println("Heap empty, no minumum found\n");
            return;
        }

        if (listType.equals("sorted")){
            heap.deleteHead();
        } else {
            int min = current.data;
            while (current != null) {
                if (current.data < min) {
                    min = current.data;
                }
                current = current.next;
            }
            heap.delete(min);
        }

        System.out.println("Heap after deletion:");
        heap.display();
    }


    public static void minimum(Heap heap, String listType) {
        Node current = heap.head; 
        if (current == null){
            System.out.println("Heap empty, no minumum found\n");
            return;
        }

        int min = current.data;
        if (listType.equals("not sorted")){
            while (current != null) {
                if (current.data < min) {
                    min = current.data;
                }
                current = current.next;
            }
        }

        System.out.printf("Heap minimum: %d\n", min);
    }

    
    public static void union(Heap heapA, Heap heapB, String listType) {
        Node current = heapB.head; 
        
        System.out.println("Before UNION:\nHeap A: ");
        heapA.display();
        System.out.println("Heap B: ");
        heapB.display();
        
        while (current != null) {
            if (listType.equals("sorted")){
                heapA.addOrdered(current.data);
            } else {
                heapA.add(current.data);
            }
            heapB.delete(current.data);
            current = current.next;
        }

        System.out.println("After UNION:\nHeap A: ");
        heapA.display();
        System.out.println("Heap B: ");
        heapB.display();
    }


    public static void displayMenu(String listType, Heap heapA, Heap heapB) {
        Scanner scanner = new Scanner(System.in);
        int operationNumber;

        do {
            System.out.print("\nEnter desired operation:\n1. MAKE-HEAP A\n2. MAKE-HEAP B\n3. INSERT A\n4. INSERT B\n" +
                             "5. MINIMUM A\n6. MINIMUM B\n7. EXTRACT MIN A\n8. EXTRACT MIN B\n9. UNION\n10. SORT A\n11. SORT B\n12. EXIT\n");
            operationNumber = scanner.nextInt();

            switch (operationNumber) {
                case 1:
                    heapA = makeHeap(heapA, listType);
                    break;
                case 2:
                    heapB = makeHeap(heapB, listType);
                    break;
                case 3:
                    insert(heapA, listType);
                    break;
                case 4:
                    insert(heapB, listType);
                    break;
                case 5:
                    minimum(heapA, listType);
                    break;
                case 6:
                    minimum(heapB, listType);
                    break;
                case 7:
                    extractMin(heapA, listType);
                    break;
                case 8:
                    extractMin(heapB, listType);
                    break;
                case 9:
                    union(heapA, heapB, listType);
                    break;
                case 10:
                    heapA.heapSort();
                    heapA.display();
                    break;
                case 11:
                    heapB.heapSort();
                    heapB.display();
                case 12:
                    break;
                default:
                    System.out.println("Error: operation number must be a number between 1 and 10\n");
                    break;
            }
        } while (operationNumber != 12);
    }


    public static String getListType() {
        Scanner scanner = new Scanner(System.in);
        String listType;

        do {
            System.out.print("Enter array type (sorted or not sorted): ");
            listType = scanner.nextLine();
            switch (listType) {
                case "sorted":
                    break;
                case "not sorted":
                    break;
                default:
                    System.out.println("Error: list type should be 'sorted' or 'not sorted'\n");
                    break;
            };
        } while (!listType.equals("sorted") && !listType.equals("not sorted"));

        return listType;
    }

    public static void main(String[] args) {
        int[] emptyArray = new int[0];
        Heap heapA = createHeap(emptyArray);
        Heap heapB = createHeap(emptyArray);
        String listType = getListType();
        displayMenu(listType, heapA, heapB);
    }
}
