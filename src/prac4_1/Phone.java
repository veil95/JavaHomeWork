package prac4_1;

public class Phone extends Device {
    public Phone(String number, String model, double weight){
        super(model, number, weight);
    }
    public Phone (String number, String model){
        this(number, model,0.0);
    }
    public Phone() {
        this("Unknown", "Unknown", 0.0);
    }
    @Override
    public void receiveCall(String name){
        System.out.println("Звонит - " + name);
    }
    @Override
    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " c номера " + number);
    }
    public void sendMessage(String... numbers){
        System.out.println("Сообщение будет отправлено:");
        for (String num : numbers){
            System.out.println(num);
        }
    }
    @Override
    public void printInfo() {
        System.out.println("Модель: " + model + ", Номер: " + number + ", Вес: " + weight);
    }
}
