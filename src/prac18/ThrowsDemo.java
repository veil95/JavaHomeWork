package prac18;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a key: ");
        try {
            String key = myScanner.nextLine();
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Exception caught in getKey(): " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
