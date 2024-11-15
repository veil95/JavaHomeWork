package prac2.num5;


public class Dog{
    private String name;
    private int age;

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName(){ return name; }

    public void setName(String name){
        this.name = name;
    }
    public int HumanAge(int age){
        return age*7;
    }
    @Override
    public String toString(){
        return "Dog{"+ "name=" +
                name + ", " +
                "age=" + age + ", " +
                "Human age = " + HumanAge(age) + "}";
    }
}
