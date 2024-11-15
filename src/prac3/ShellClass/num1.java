package prac3.ShellClass;

public class num1 {
    public static void main(String [] args){
        //1
        System.out.println("num 1");

        Double num1 = Double.valueOf(2.71);
        Double num2 = Double.valueOf("52.5252");
        System.out.println("num1 = " + num1);
        System.out.println("num2  = " + num2);

        //2
        System.out.println("num 2");

        String str = "52";
        double ParsedValue = Double.parseDouble(str);
        System.out.println("parsed value = " + ParsedValue);

        //3
        System.out.println("num 3");

        byte byteValue = num1.byteValue();
        short shortValue = num1.shortValue();
        int intValue = num1.intValue();
        long longValue = num1.longValue();
        float floatValue = num1.floatValue();
        double doubleValue = num1.doubleValue();

        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        //4
        System.out.println("num 4");
        Double num = Double.valueOf(3.3333);
        System.out.println("Double value =" + num);

        //5
        System.out.println("num 5");
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
