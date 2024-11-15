package prac6.num4;

public class Test {
    public static void main(String [] args){
        Book book = new Book("Норвежский лес");
        Laptop laptop = new Laptop("MacBook");
        Phone phone =  new Phone("Samsung");
        System.out.println("Price of " + book.getTitle() + " is " + book.getPrice());
        System.out.println("Price of " + laptop.getBrand() + " is " + laptop.getPrice());
        System.out.println("Price of " + phone.getBrand() + " is " + phone.getPrice());
    }
}
