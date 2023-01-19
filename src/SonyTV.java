public class SonyTV {
    private String model;
    private double price;
    private int serialNumber = 0;
    private static int counter = 0;

    SonyTV(String model, double price) {
        this.model = model;
        this.price = price;
        counter++;
        this.serialNumber = counter;
    }

    public static int getCounter() {
        return counter;
    }
}
