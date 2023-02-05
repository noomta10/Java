public class GenericMain {
    public static void main(String[] args) {
        GenericClass<Integer, Integer> myInt = new GenericClass<>(2, 3);
        System.out.println(myInt.getSecondValue());
        GenericClass<Double, Integer> myDoubleInt = new GenericClass<>(1.5, 1);
        System.out.println(myDoubleInt.getSecondValue());
    }
}
