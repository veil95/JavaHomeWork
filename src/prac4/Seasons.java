package prac4;

public enum Seasons {
    winter(-8),
    spring(10),
    summer(17),
    autumn(7);

    private final int averageTemp;

    private Seasons(int averageTemp){
        this.averageTemp = averageTemp;
    }
    public int getAverageTemp(){
        return this.averageTemp;
    }
    public String getDescription(){
        switch (this){
            case summer:
                return "Теплое время года";
            default:
                return "Холодное время года";
        }
    }

}
