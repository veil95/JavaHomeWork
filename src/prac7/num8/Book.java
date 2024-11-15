package prac7.num8;

public class Book implements Printable {
    private String name;
    private String author;
    private int year;
    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n",
                name, author, year);
    }
    public static void printBooks(Printable[] printables){
        for (Printable printable : printables){
            if (printable instanceof Book){
                Book book = (Book) printable;
                System.out.println(book.getName());
            }
        }
    }
}
