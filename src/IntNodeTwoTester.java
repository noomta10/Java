public class IntNodeTwoTester {
    public static void main(String[] args) {
        IntNodeTwo myNode = new IntNodeTwo(2);
        IntNodeTwo myNode2 = new IntNodeTwo(2, null, myNode);
        System.out.println(myNode2.getPrev().getNum());
    }
}

