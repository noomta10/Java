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

    public void addNumber(int num) {
        if (this.head == null) {
            this.head = new IntNodeTwo(num);
            this.tail = this.head;
            return;
        }

        IntNodeTwo index = this.tail;

        // Creating a place at the end of the list for the new node:
        this.tail.setNext(new IntNodeTwo(0, null, this.tail));
        this.tail = this.tail.getNext();

        while (index != null && index.getNum() >= num){
            index.getNext().setNum(index.getNum());
            index = index.getPrev();
        }

        if (index == null)
            this.head.setNum(num);
        else
            index.getNext().setNum(num);
    }

}
