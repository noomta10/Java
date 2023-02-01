public class IntNodeTwoTester {
    public static void main(String[] args){
        IntNodeTwo myNode = new IntNodeTwo(3);
        IntNodeTwo myNode2 = new IntNodeTwo(4);


        System.out.println(myNode.getNum());
        System.out.println(myNode.getPrev());
        myNode.setNext(myNode2);
        System.out.println(myNode.getNext().getNum());

    }
}
