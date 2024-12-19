package prac14.num_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в приложение для манипуляции строками!");

        // Ввод строки пользователем
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        // Ввод регулярного выражения пользователем
        System.out.print("Введите регулярное выражение для разделения строки: ");
        String regex = scanner.nextLine();

        // Разделение строки
        String[] elements = inputString.split(regex);
        System.out.println("Строка была разбита на " + elements.length + " элемент(ов).");

        // Основное меню приложения
        boolean running = true;
        while (running) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1 - Показать все элементы");
            System.out.println("2 - Найти элемент по подстроке/шаблону");
            System.out.println("3 - Собрать новую строку из элементов");
            System.out.println("4 - Ввести новое регулярное выражение");
            System.out.println("5 - Выйти из программы");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера после ввода числа

            switch (choice) {
                case 1:
                    printElements(elements);
                    break;

                case 2:
                    findElementsByPattern(elements, scanner);
                    break;

                case 3:
                    assembleNewString(elements, scanner);
                    break;

                case 4:
                    System.out.print("Введите новое регулярное выражение: ");
                    regex = scanner.nextLine();
                    elements = inputString.split(regex);
                    System.out.println("Строка была заново разбита на " + elements.length + " элемент(ов).");
                    break;

                case 5:
                    System.out.println("Выход из программы. До свидания!");
                    running = false;
                    break;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
        scanner.close();
    }

    // Показ всех элементов
    private static void printElements(String[] elements) {
        System.out.println("Элементы строки:");
        for (int i = 0; i < elements.length; i++) {
            System.out.println(i + ": " + elements[i]);
        }
    }

    // Поиск элементов по шаблону или подстроке
    private static void findElementsByPattern(String[] elements, Scanner scanner) {
        System.out.print("Введите подстроку или регулярное выражение для поиска: ");
        String pattern = scanner.nextLine();
        Pattern regexPattern = Pattern.compile(pattern);

        System.out.println("Элементы, соответствующие шаблону:");
        boolean found = false;
        for (String element : elements) {
            if (regexPattern.matcher(element).find()) {
                System.out.println(element);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет элементов, соответствующих заданному шаблону.");
        }
    }

    // Сбор новой строки из элементов
    private static void assembleNewString(String[] elements, Scanner scanner) {
        System.out.println("Введите разделитель для сборки новой строки:");
        String delimiter = scanner.nextLine();

        String newString = String.join(delimiter, elements);
        System.out.println("Собранная строка: " + newString);
    }
}

