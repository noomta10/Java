public class GenericMain {
    public static void main(String[] args){
        GenericClass<Integer, Integer> myInt = new GenericClass<>(2, 3);
        System.out.println(myInt.getValue());
    }
}
