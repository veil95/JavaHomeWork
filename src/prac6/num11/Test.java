package prac6.num11;

public class Test {
    public static void main(String [] args) {
        Fahrenheit fahrenheit = new Fahrenheit(18.6);
        Kelvin kelvin = new Kelvin(18.6);
        System.out.println(fahrenheit.getTemp() + " in C" + " and in F - " + fahrenheit.convert());
        System.out.println(kelvin.getTemp() + " in C" + " and in K - " + kelvin.convert());
    }
}
