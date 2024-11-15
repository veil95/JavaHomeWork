package prac6.num3;

public class Test {
    public static void main(String [] arsg){
        Nameable Earth = new Planet("Earth");
        Nameable audi = new Car("audi");
        Nameable dog = new Animal("Dog");
        System.out.println("Planet Name: " + Earth.getName());
        System.out.println("Car Name: " + audi.getName());
        System.out.println("Animal Name: " + dog.getName());
    }
}
