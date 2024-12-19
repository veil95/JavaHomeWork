package prac13.num2;


public class Person {
    private String LastName;
    private String Name;
    private String Patronymic;

    public Person(String lastName, String name, String patronymic) {
        this.LastName = lastName;
        this.Name = name;
        this.Patronymic = patronymic;
    }

    public String getFullName(){
        StringBuilder FullName = new StringBuilder();
        if (LastName != null && !LastName.isEmpty()){
            FullName.append(LastName);
        }
        else{
            System.out.println("The person doesn't have lastname");
        }
        if (Name != null && !Name.isEmpty()){
            FullName.append(" ").append(Name.toUpperCase().charAt(0));
        }
        if (Patronymic != null && !Patronymic.isEmpty()){
            FullName.append(".").append(Patronymic.toUpperCase().charAt(0));
        }
        return FullName.toString();
    }
}
