package prac4;

public class ComputerTest {
    public static void main(String [] args){
        Processor processor = new Processor("Intel Core i-5 8400", 8,3.5);
        Memory memory = new Memory("DDR5", 32);
        Monitor monitor = new Monitor("1920x1080", 32.4);
        Computer computer = new Computer(Brand.ASUS, processor, memory, monitor);
        System.out.println(computer);
    }
}
