package prac4_1;

public abstract class Device {
    protected String model;
    protected String number;
    protected double weight;
    public Device(String number, String model, double weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public abstract void receiveCall(String name);

    public abstract void receiveCall(String name, String number);

    public abstract void printInfo();
}
