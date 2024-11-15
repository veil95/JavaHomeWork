package prac6.num4;

public class Phone implements Priceable {
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public int getPrice() {
        return 42000;
    }
}
