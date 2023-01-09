public class GenericMain {
    public static void main(String[] args){
        GenericClass<Integer> myInt = new GenericClass(3);
        System.out.println(myInt.getValue());
    }
}
