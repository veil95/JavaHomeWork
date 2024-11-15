package prac6.num4;

public class Book implements Priceable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public int getPrice(){
        return 349;
    }
}
