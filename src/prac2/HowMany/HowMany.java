package prac2.HowMany;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();
        scanner.close();
        if (input.trim().isEmpty()) {
            System.out.println("Вы не ввели ни одного слова.");
        } else {
            String[] words = input.trim().split("\\s+");
            System.out.println("Количество слов: " + words.length);
        }
    }
}

