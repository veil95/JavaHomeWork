package prac6.num4;

public class Laptop implements Priceable {
    private String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public int getPrice() {
        return 50000;
    }
}
