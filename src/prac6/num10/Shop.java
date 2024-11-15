package prac6.num10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop implements ShopInterface{
    private List<Computer> computers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void addComputer() {
        System.out.println("Введите марку компьютера (DELL, HP, ASUS, LENOVO, APPLE):");
        Brand brand = Brand.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Введите модель процессора:");
        String processorModel = scanner.nextLine();

        System.out.println("Введите скорость процессора (в GHz):");
        double speed = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите размер памяти (в GB):");
        int memorySize = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите разрешение монитора:");
        String resolution = scanner.nextLine();

        computers.add(new Computer(brand, new Processor(processorModel, speed),
                new Memory(memorySize), new Monitor(resolution)));

        System.out.println("Компьютер добавлен!");
    }
    @Override
    public void removeComputer(){
        System.out.println("Введите индекс компьютера который хотите удалить");
        int index = Integer.parseInt(scanner.nextLine());
        index -= 1;
        if (index >= 0 && index < computers.size()) {
            computers.remove(index);
            System.out.println("Компьютер удалён!");
        } else {
            System.out.println("Некорректный индекс!");
        }
    }

    @Override
    public void searchComputer() {
        System.out.println("Введите бренд компьютера который хотите найти");
        Brand brand =  Brand.valueOf(scanner.nextLine().toUpperCase());
        boolean fl = true;
        for (Computer computer : computers){
            if (brand == computer.getBrand()){
                System.out.println(computer);
                fl = false;
            }
        }
        if (fl){
            System.out.println("Компьютер не найдет");
        }
    }
    public void displayComputers() {
        for (int i = 0; i < computers.size(); i++) {
            System.out.println(i + 1 + ": " + computers.get(i));
            System.out.println();
        }
    }
}
