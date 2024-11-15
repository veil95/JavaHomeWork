package prac4;

public class Memory {
    private String type;
    private int sizeGB;

    public Memory(String type, int sizeGB) {
        this.type = type;
        this.sizeGB = sizeGB;
    }
    @Override
    public String toString() {
        return "Memory: " + type + ", Size: " + sizeGB + " GB";
    }
}
