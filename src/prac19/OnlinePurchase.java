package prac19;
import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        String inn;
        System.out.println("добро пожаловать в онлайн магазин!");
        System.out.print("введите фио: ");
        fullName = scanner.nextLine();
        boolean validInn = false;
        while (!validInn) {
            System.out.print("Введите ваш инн: ");
            inn = scanner.nextLine();

            try {
                validateINN(inn);
                System.out.println("Заказ успешно оформлен " + fullName + "!");
                validInn = true;
            } catch (InvalidINNException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Попробуйте еще раз.");
            }
        }
    }

    private static void validateINN(String inn) throws InvalidINNException {
        if (inn.length() != 12 || !inn.matches("\\d+")) {
            throw new InvalidINNException("Invalid INN: INN должен состоять из 12 цифр.");
        }
    }
}

class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }
}
