package prac4;

public class Monitor {
    private String resolution;
    private double sizeInches;

    public Monitor(String resolution, double sizeInches) {
        this.resolution = resolution;
        this.sizeInches = sizeInches;
    }
    @Override
    public String toString() {
        return "Monitor: " + resolution + ", Size: " + sizeInches + " inches";
    }
}
