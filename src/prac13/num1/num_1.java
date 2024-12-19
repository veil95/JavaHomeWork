package prac13.num1;

public class num_1 {
    public static void printStr(String str){
        System.out.println(str);
    }
    public static void main(String [] args){
        String s = "I like Java!!!";
        printStr(s);

        System.out.println(s.charAt(s.length() - 1));

        System.out.println(s.endsWith("!!!"));

        System.out.println(s.startsWith("I like"));

        System.out.println(s.contains("Java"));

        System.out.println(s.indexOf("Java"));

        System.out.println(s.replace("a", "o"));

        System.out.println(s.toUpperCase());

        System.out.println(s.toLowerCase());

        System.out.println(s.substring(s.indexOf("Java"),  s.indexOf("Java") + 4));
    }
}
