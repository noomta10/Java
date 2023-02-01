public class IntListTwoTester {
    public static void main(String[] args) {
        IntNodeTwo myNode1 = new IntNodeTwo(1);
        IntNodeTwo myNode2 = new IntNodeTwo(2);
        IntNodeTwo myNode3 = new IntNodeTwo(3);

        myNode1.setNext(myNode2);
        myNode2.setNext(myNode3);
        myNode2.setPrev(myNode1);
        myNode3.setPrev(myNode2);

        IntListTwo myList = new IntListTwo(myNode1, myNode3);

        System.out.println(myList);
        myList.readToList();
        System.out.println(myList);
    }
}
