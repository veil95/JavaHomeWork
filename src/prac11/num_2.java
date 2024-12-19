package prac11;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Введите год в формате yyyy: ");
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
        String d = Integer.toString(day);
        String m = Integer.toString(month);
        String y = Integer.toString(year);

        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();

        System.out.print("Введите секунды: ");
        int sec = scanner.nextInt();
        while (0 > hours || hours > 23 ||
                0 > minutes || minutes > 59 ||
                0 > sec || sec > 59) {
            System.out.println("Несуществующее время");
            System.out.print("Введите часы: ");
            hours = scanner.nextInt();

            System.out.print("Введите минуты: ");
            minutes = scanner.nextInt();

            System.out.print("Введите секунды: ");
            sec = scanner.nextInt();
        }
        String h = Integer.toString(hours);
        String mi = Integer.toString(minutes);
        String s = Integer.toString(sec);
        String UserInput = y + "-" + m + "-" + d + " " + h + ":" + mi + ":" + s;
        System.out.println(UserInput);
        try {
            Date UserDate = sdf.parse(UserInput);
            Date nowDate = new Date();
            if (UserDate.before(nowDate)){
                System.out.println("Раньше текущей даты");
            }
            else if (UserDate.after(nowDate)){
                System.out.println("Позже текущей даты");
            }
            else {
                System.out.println("Даты равны");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты.");
        }
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
