package prac11;

import java.util.Calendar;
import java.util.Date;

public class num_3_Test {
    public static void main(String [] args){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 5);
        Student student = new Student("димас", "афонькин", cal);
        System.out.println(student);
        System.out.println(student.getBirthDate("dd/MM/yyyy"));
        System.out.println(student.getBirthDate("dd MMMM, yyyy"));
        System.out.println(student.getBirthDate("EEEE, MMMM dd, yyyy"));
    }
}
