package prac2.num6;

import java.util.Scanner;

public class CicrleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circles data = new Circles();
        int option;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить окружность");
            System.out.println("2. Показать все окружности");
            System.out.println("3. Сравнить две окружности");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            while (!sc.hasNextInt()) {
                System.out.println("Введите корректный номер действия.");
                sc.next();
            }
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Введите радиус окружности");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(radius);
                    data.addCircle(circle);
                    break;
                case 2:
                    data.DisplayCircles();
                    break;
                case 3:
                    data.DisplayCircles();
                    if (data.getCircle(0) != null && data.getCircle(1) != null){
                        System.out.println("Введите номер первой окружности для сравнения ");
                        int index_1 = sc.nextInt() - 1;
                        System.out.println("Введите номер второй окружности для сравнения ");
                        int index_2 = sc.nextInt() - 1;

                        Circle circle_1 = data.getCircle(index_1);
                        Circle circle_2 = data.getCircle(index_2);

                        if (circle_1 != null && circle_2 != null){
                            if (circle_1.IsEqual(circle_2)){
                                System.out.println("Окружности равны");
                            }
                            else{
                                System.out.println("Окружности разные");
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Некоректный выбор, попробуйте еще раз");
                    break;
            }
        } while (option != 0);
    }
}
