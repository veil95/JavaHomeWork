package prac3.formatString;

import java.util.Scanner;
public class Convertor {
    private static final double USD_TO_EUR = 0.94;
    private static final double USD_TO_RUB = 96.50;
    private static final double USD_TO_GBP = 0.81;
    public static double convertUSDtoEUR(double amount){
        return USD_TO_EUR * amount;
    }
    public static double convertUSDtoGBP(double amount){
        return USD_TO_GBP * amount;
    }
    public static double convertUSDtoRUB(double amount){
        return USD_TO_RUB * amount;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // Ввод суммы и исходной валюты
        System.out.println("Введите сумму в долларах США:");
        double amountInUSD = scanner.nextDouble();

        // Выводим варианты и запрашиваем выбор пользователя
        System.out.println("Выберите валюту для конвертации:");
        System.out.println("1. Евро (EUR)");
        System.out.println("2. Российский рубль (RUB)");
        System.out.println("3. Фунт стерлингов (GBP)");

        int choice = scanner.nextInt();

        // Переменная для результата
        double convertedAmount = 0;
        String currencySymbol = "";

        // Обрабатываем выбор и производим конвертацию
        switch (choice) {
            case 1:
                convertedAmount = convertUSDtoEUR(amountInUSD);
                currencySymbol = "EUR";
                break;
            case 2:
                convertedAmount = convertUSDtoRUB(amountInUSD);
                currencySymbol = "RUB";
                break;
            case 3:
                convertedAmount = convertUSDtoGBP(amountInUSD);
                currencySymbol = "GBP";
                break;
            default:
                System.out.println("Неправильный выбор!");
                return;
        }

        // Форматируем вывод суммы
        System.out.printf("Сумма %.2f USD конвертирована в %.2f %s%n", amountInUSD, convertedAmount, currencySymbol);
    }
}

