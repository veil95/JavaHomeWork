package prac6.num10;

public class Processor {
    private String model;
    private double speed;

    public Processor(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return model + " (" + speed + " GHz)";
    }
}

