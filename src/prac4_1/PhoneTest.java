package prac4_1;

public class PhoneTest {
    public static void main(String [] args){
        Phone phone1 = new Phone("+796667771488", "POCO X4 PRO", 654.3);
        Phone phone2 = new Phone("+797777777777", "POCOLECO");
        Phone phone3 = new Phone();

        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        phone1.receiveCall("Алексей");
        phone2.receiveCall("Мария", "222-333-4444");
        phone3.receiveCall("Петр");

        phone1.sendMessage("111-222-3333", "444-555-6666", "777-888-9999");
    }
}
