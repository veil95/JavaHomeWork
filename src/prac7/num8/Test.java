package prac7.num8;

public class Test {
    public static void main(String [] args){
        Printable[] printables = {new Book("Book 1", "Author 1", 1900),
                                  new Journal("Journal 1"),
                                  new Book("Book 2", "Author 2", 2000),
                                  new Journal("Journal 2")};
        Book.printBooks(printables);
    }
}
