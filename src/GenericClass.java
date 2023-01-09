public class GenericClass<Thing extends Number, Thing2 extends Number> {

    Thing x;
    Thing2 x2;

    GenericClass(Thing x, Thing2 x2) {
        this.x = x;
        this.x2 = x2;
    }

    public Thing2 getValue() {
        return x2;
    }
}
