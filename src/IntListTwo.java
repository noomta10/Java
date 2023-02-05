// OU Mmn 15- linked lists

import java.util.Scanner;

public class IntListTwo {
    private IntNodeTwo head, tail;

    public IntListTwo() {
        this.head = null;
        this.tail = null;
    }

    public IntListTwo(IntNodeTwo h, IntNodeTwo t) {
        this.head = h;
        this.tail = t;
    }

    public void addNumber(int number) {

        // If the list is empty, the new node will be the head and tail of the list
        if (this.head == null) {
            this.head = new IntNodeTwo(number);
            this.tail = this.head;
            return;
        }

        IntNodeTwo index = this.tail;

        // Creating a place at the end of the list for the new node:
        this.tail.setNext(new IntNodeTwo(0, null, index));
        this.tail = this.tail.getNext();

        // To clear the requested spot for the new node, we need to move all the nodes after it
        while ((index != null) && (index.getNum() >= number)) {
            index.getNext().setNum(index.getNum());
            index = index.getPrev();
        }

        // If the index is null, it is the head of the list, the new node should be the head of the list
        if (index == null)
            this.head.setNum(number);
            // Sets the new node at the requested order
        else
            index.getNext().setNum(number);
    }

    public void removeNumber(int number) {
        IntNodeTwo current = this.head;

        while (current != null && number != current.getNum())
            current = current.getNext();

        if (current != null) {

            if (current == this.head) {
                this.head = current.getNext();
            } else if (current == this.tail) {
                current.getPrev().setNext(null);
                this.tail = current.getPrev();
            } else {
                current.getNext().setPrev(current.getPrev());
                current.getPrev().setNext(current.getNext());
            }

        }
    }

    public String toString() {
        StringBuilder listString = new StringBuilder();
        IntNodeTwo current = this.head;

        if (current == null)
            listString.append("{}");

        while (current != null) {
            if (current == this.head)
                listString.append('{');
            if (current == this.tail) {
                listString.append(current.getNum()).append('}');
                return listString.toString();
            }
            listString.append(current.getNum()).append(", ");
            current = current.getNext();
        }

        return listString.toString();
    }

    public void readToList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers, and -9999 to end: ");
        int number = 0;

        while (number != -9999) {
            number = scanner.nextInt();
            if (number != -9999)
                addNumber(number);
        }
    }

    public int length() {
        int counter = 0;
        IntNodeTwo current = this.head;

        while (current != null) {
            counter += 1;
            current = current.getNext();
        }

        return counter;
    }

    public int sum() {
        int sum = 0;
        IntNodeTwo current = this.head;

        while (current != null) {
            sum += current.getNum();
            current = current.getNext();
        }

        return sum;
    }

    public int maxLength() {
        int sum = this.sum();
        if (sum % 2 == 0)
            return this.length();
        else {
            IntNodeTwo leftNode = this.head;
            IntNodeTwo rightNode = this.tail;
            int newLength = this.length() - 1;

            while (leftNode != rightNode) {
                if (leftNode.getNum() % 2 != 0)
                    return newLength;
                else if (rightNode.getNum() % 2 != 0)
                    return newLength;
                else {
                    newLength--;
                    leftNode = leftNode.getNext();
                    rightNode = rightNode.getPrev();
                }
            }
            return length() / 2;
        }
    }

    public boolean isAverage(double num) {
        int sum = this.sum();
        int count = this.length();
        double average = (double) sum / count;

        IntNodeTwo leftNode = this.head;
        IntNodeTwo rightNode = this.tail;

        while (rightNode != null && leftNode != rightNode.getNext()) {
            if (average == num)
                return true;
            else if (average > num) {
                sum -= rightNode.getNum();
                rightNode = rightNode.getPrev();
            } else {
                sum -= leftNode.getNum();
                leftNode = leftNode.getNext();
            }
            count--;
            average = (double) sum / count;
        }

        return false;

    }

}