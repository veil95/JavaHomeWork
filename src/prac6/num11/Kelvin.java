package prac6.num11;

public class Kelvin implements Convertable {
    private double temp;

    public Kelvin(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public double convert() {
        return temp + 273;
    }
}
