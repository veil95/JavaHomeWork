package prac11;

import java.util.Date;

public class num_1 {
    public static void main(String [] args){
        String DeveloperName = "Savenko Pavel";
        Date taskReceivedDate = new Date();
        Date taskSubmittedDate = new Date(System.currentTimeMillis() + 3600000);
        System.out.println("Developer name:" + DeveloperName);
        System.out.println("task received date" + taskReceivedDate);
        System.out.println("task submitted date" + taskSubmittedDate);
    }
}
