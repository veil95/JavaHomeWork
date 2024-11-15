package prac2.boook;

public class Book {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public int getYear(){ return year; }
    public String toString(){
        return "Book - " + author +
                ", title: " + title +
                ", year =" + year;
    }
}
