package prac1;

public class num5{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Не переданы аргументы");
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}

