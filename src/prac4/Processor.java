package prac4;

public class Processor {
    private String model;
    private int cores;
    private double speedGHz;

    public Processor(String model, int cores, double speedGHz){
        this.model = model;
        this.cores = cores;
        this.speedGHz = speedGHz;
    }
    @Override
    public String toString(){
        return "Processor: " + model + ", Cores: " +
                cores + ", Speed: " + speedGHz + " GHz";
    }
}
