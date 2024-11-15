package prac7.num8;

public class Journal implements Printable {
    private String name;
    Journal(String name){
        this.name = name;
    }
    String getName(){ return name; }
    @Override
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }
}

