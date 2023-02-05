// Generic class
public class GenericClass<Thing extends Number, Thing2 extends Number> {
    Thing x1;
    Thing2 x2;

    GenericClass(Thing x1, Thing2 x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Thing2 getSecondValue() {
        return x2;
    }
}
