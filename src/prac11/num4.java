package prac11;

import java.util.Calendar;
import java.util.Scanner;

public class num4 {
    public static void main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        while (!check(day,month,year)){
            System.out.println("Такой даты не существует, попробуйте еще раз");
            System.out.print("Введите год: ");
            year = scanner.nextInt();
            System.out.print("Введите месяц (1-12): ");
            month = scanner.nextInt();
            System.out.print("Введите день: ");
            day = scanner.nextInt();
        }
        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();
        while (0 > hours || hours > 23 ||
                0 > minutes || minutes > 59) {
            System.out.println("Несуществующее время");
            System.out.print("Введите часы: ");
            hours = scanner.nextInt();

            System.out.print("Введите минуты: ");
            minutes = scanner.nextInt();
        }
        Calendar cal = Calendar.getInstance();
        cal.set(year,month,day,hours,minutes);
        System.out.println("Custom date");
        System.out.println(cal.getTime());
    }
    static boolean check(int day, int month, int year){
        if (day <= 0 || month <= 0 || year <= 0 || month > 12) {
            return false;
        }
        if (month == 2){
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                if(day > 29) return false;
            }else{
                if (day > 28) return false;
            }
        }
        if ((month % 2 == 0 && month < 8) || (month % 2 != 0 && month > 8)) {
            if (day > 30) return false;
        }
        else if ((month % 2 != 0 || month == 8) || (month % 2 == 0 && month > 8)) {
            if (day > 31) return false;
        }

        return true;
    }
}
