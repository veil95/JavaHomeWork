package prac2.boook;

public class BookTest {
    public static void main(String [] args) {
        Book book1 = new Book("title 1", "Haruki Murakami", 1992);
        Book book2 = new Book("title 2", "Pelevin", 2024);
        Book book3 = new Book("title 3", "Pushkin", 1825);

        BookShelf shelf = new BookShelf(5);
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);
        shelf.printBooks();
        System.out.println("Earliest book: " + shelf.getEarliestBook());
        System.out.println("Latest book: " + shelf.getLatestBook());
        shelf.sortBooks();
        shelf.printBooks();
    }
}
