package prac1;

public class num6 {
    public static void main(String[] args) {
        double harmonicNumber = 0.0;
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            harmonicNumber += 1.0 / i;
            System.out.printf("H(%d) = %.4f%n", i, harmonicNumber);
        }
    }
}

