public class Food implements FoodInterface {
    String name;
    Food(String name){
        this.name = name;
    }

    @Override
    public void taste() {
        System.out.println("This is tasty!" + this.name);
    }
}


