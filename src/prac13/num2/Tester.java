package prac13.num2;

import java.util.ArrayList;

public class Tester {
    public static void main(String [] args){
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Savenko", "pavel", "afss"));
        persons.add(new Person("Ivanov","Ivan", ""));
        persons.add(new Person("pog", "", ""));
        for (Person person : persons){
            System.out.println(person.getFullName());
        }
    }
}
