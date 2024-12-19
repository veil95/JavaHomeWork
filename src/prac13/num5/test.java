package prac13.num5;

public class test {
    public static void main(String[] args) {
        String[] phoneNumbers = {
                "+79175655655",
                "+104289652211",
                "89175655655"
        };
        for (String rawNumber : phoneNumbers) {
            try {
                PhoneNumber phoneNumber = new PhoneNumber(rawNumber);
                System.out.println(phoneNumber);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
