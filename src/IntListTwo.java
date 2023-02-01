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
        while (index.getNum() >= number && index != null) {
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
                current.getNext().setPrev(null);
                this.head = current.getNext();
            } else if (current == this.tail) {
                current.getPrev().setNext(null);
                this.tail = current.getPrev();
            } else {
                //current.getNext().setPrev(current.getPrev());
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
                listString.append('{').append(current.getNum()).append(", ");
            else if (current == this.tail)
                listString.append(current.getNum()).append('}');
            else
                listString.append(current.getNum()).append(", ");
            current = current.getNext();
        }

        return listString.toString();
    }

}