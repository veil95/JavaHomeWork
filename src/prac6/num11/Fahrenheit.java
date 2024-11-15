package prac6.num11;

public class Fahrenheit implements Convertable {
    private double temp;

    public Fahrenheit(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public double convert() {
        return temp * 1.8 + 32;
    }
}
