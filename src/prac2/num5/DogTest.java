package prac2.num5;

import java.util.Scanner;
import java.util.ArrayList;

public class DogTest {
    private ArrayList<Dog> dogs;

    public DogTest() {
        dogs = new ArrayList<>();
    }
    public void addDogs(Dog dog){
        dogs.add(dog);
    }
    public void DisplayDogs(){
        if (dogs.isEmpty()){
            System.out.println("В питомнике нет собак");
        }
        else {
            for (Dog dog : dogs) {
                System.out.println(dog);
            }
        }
    }
    public static void main(String[] args){
        DogTest shelter = new DogTest();
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько собак вы хотите добавить?");
        int count;
        while (!sc.hasNextInt()){
            System.out.println("Введите целое число:");
            sc.next();
        }
        count = sc.nextInt();
        do {
            for (int i = 0; i < count; i++) {
                System.out.println("Введите кличку собаки:");
                String name = sc.next();
                System.out.println("Введите возраст собаки");
                int age = sc.nextInt();
                Dog dog = new Dog(age, name);
                shelter.addDogs(dog);
            }
            System.out.println("Информация о всех собаках в питомнике");
            shelter.DisplayDogs();
            System.out.println("Сколько собак вы хотите добавить еще?");
            while (!sc.hasNextInt()){
                System.out.println("Введите целое число:");
                sc.next();
            }
            count = sc.nextInt();
        }while (count != 0 );
    }
    }
