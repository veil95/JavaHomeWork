package prac2.boook;

public class BookShelf {
    private Book[] books;
    private int count;
    public BookShelf(int capacity){
        books = new Book[capacity];
        count = 0;
    }
    public void addBook(Book book){
        if (count < books.length){
            books[count] = book;
            count++;
        }
        else{
            System.out.println("No more space in bookshelf");
        }
    }
    public Book getEarliestBook(){
        if (count == 0){
            System.out.println("No books in bookshelf");
            return null;
        }
        Book earlist = books[0];
        for (int i = 1; i < count; i++){
            if (books[i].getYear() < earlist.getYear()){
                earlist = books[i];
            }
        }
        return earlist;
    }
    public Book getLatestBook(){
        if (count == 0){
            System.out.println("No books in bookshelf");
            return null;
        }
        Book latest = books[0];
        for (int i = 1; i < count; i++){
            if(books[i].getYear() > latest.getYear()){
                latest = books[i];
            }
        }
        return latest;
    }
    public void printBooks(){
        for (int i = 0; i < count; i++){
            System.out.println(books[i]);
        }
    }
    public void sortBooks(){
        for (int i = 0; i < count - 1; i++){
            for (int j = 0; j < count - 1 - i; j++){
                if (books[j].getYear() > books[j+1].getYear()){
                    Book tmp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = tmp;
                }
            }
        }
    }
}
