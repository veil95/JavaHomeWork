package prac11;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    private String name;
    private String LastName;
    private Calendar BirthDate;

    public Student(String name, String lastName, Calendar birthDate) {
        this.name = name;
        this.LastName = lastName;
        this.BirthDate = birthDate;
    }
    public String getBirthDate(String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(BirthDate.getTime());
    }
    @Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return name + " " + LastName + " " + sdf.format(BirthDate.getTime());
    }
}
