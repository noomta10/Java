// OU Mmn 15- linked lists
public class IntNodeTwo {
    private int num;
    private IntNodeTwo next, prev;

    public IntNodeTwo(int n) {
        this.num = n;
        this.next = null;
        this.prev = null;
    }

    public IntNodeTwo(int num, IntNodeTwo n, IntNodeTwo p) {
        this.num = num;
        this.next = n;
        this.prev = p;
    }

    public int getNum() {
        return this.num;
    }

    public IntNodeTwo getNext() {
        return this.next;
    }

    public IntNodeTwo getPrev() {
        return this.prev;
    }

    public void setNum(int n) {
        this.num = n;
    }

    public void setNext(IntNodeTwo node) {
        this.next = node;
    }

    public void setPrev(IntNodeTwo node) {
        this.prev = node;
    }
}
