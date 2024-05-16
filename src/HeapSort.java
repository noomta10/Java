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
        int[] numbers_array = getInputFromFile(fileName);

        if (listType.equals("sorted")){
            bubbleSort(numbers_array);
        }

        heap = createHeap(numbers_array);
        
        System.out.println("Heap created:");
        heap.display();

        return heap;
    }


    public static void insert(Heap heap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to insert: ");
        int number_to_insert = scanner.nextInt();
        heap.add(number_to_insert);

        System.out.println("Heap after insertion:");
        heap.display();
    }


    public static void extractMin(Heap heap) {
        Node current = heap.head; 
        if (current == null){
            System.out.println("Heap empty, no minumum found\n");
            return;
        }

        int min = current.data;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }

        heap.delete(min);

        System.out.println("Heap after deletion:");
        heap.display();
    }


    public static void minimum(Heap heap) {
        Node current = heap.head; 
        if (current == null){
            System.out.println("Heap empty, no minumum found\n");
            return;
        }

        int min = current.data;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }

        System.out.printf("Heap minimum: %d\n", min);
    }

    
    public static void union(Heap heapA, Heap heapB) {
        Node current = heapB.head; 
        
        System.out.println("Before UNION:\nHeap A: ");
        heapA.display();
        System.out.println("Heap B: ");
        heapB.display();
        
        while (current != null) {
            heapA.add(current.data);
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
                             "5. MINIMUM A\n6. MINIMUM B\n7. EXTRACT MIN A\n8. EXTRACT MIN B\n9. UNION\n10. EXIT\n");
            operationNumber = scanner.nextInt();

            switch (operationNumber) {
                case 1:
                    heapA = makeHeap(heapA, listType);
                    break;
                case 2:
                    heapB = makeHeap(heapB, listType);
                    break;
                case 3:
                    insert(heapA);
                    break;
                case 4:
                    insert(heapB);
                    break;
                case 5:
                    minimum(heapA);
                    break;
                case 6:
                    minimum(heapB);
                    break;
                case 7:
                    extractMin(heapA);
                    break;
                case 8:
                    extractMin(heapB);
                    break;
                case 9:
                    union(heapA, heapB);
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Error: operation number must be a number between 1 and 10\n");
                    break;
            }
        } while (operationNumber != 10);
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
