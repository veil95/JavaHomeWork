package prac13.num3;

public class Test {
    public static void main(String [] args){
        String address1 = "Россия, Московская область, Москва, Красная площадь, 1, 2, 10";
        Adress addressParsedWithSplit = new Adress(address1);
        System.out.println("Parsed with split():\n" + addressParsedWithSplit + "\n");

        String address2 = "USA. California; Los Angeles, Sunset Boulevard, 100, 5, 23";
        Adress addressParsedWithTokenizer = new Adress(address2, ",.;");
        System.out.println("Parsed with StringTokenizer:\n" + addressParsedWithTokenizer + "\n");

        String address3 = "Германия, Берлин, Unter den Linden";
        Adress incorrectAddress = new Adress(address3);
        System.out.println("Incorrect input test:\n" + incorrectAddress + "\n");

        String address4 = "Франция; Иль-де-Франс. Париж; Елисейские поля, 25, 3, 45";
        Adress complexAddress = new Adress(address4, ",.;");
        System.out.println("Parsed complex address with multiple delimiters:\n" + complexAddress);
    }
}
