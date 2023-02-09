// SonyTv class

public class SonyTV {

    private String model;
    private double price;
    private final int serialNumber;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
