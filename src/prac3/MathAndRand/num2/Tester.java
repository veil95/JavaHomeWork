package prac3.MathAndRand.num2;
import java.util.Random;
public class Tester {
    private Circle[] circles;
    private int size;

    public Tester(int size) {
        this.size = size;
        circles = new Circle[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            circles[i] = new Circle(rand);
        }
    }
    public Circle FindSmallestCircle(){
        Circle smallest = circles[0];
        for (int i = 0; i < size; i++){
            if (smallest.getRadius() < circles[i].getRadius()){
                smallest = circles[i];
            }
        }
        return smallest;
    }
    public Circle FindBiggestCircle(){
        Circle bigger = circles[0];
        for (int i = 0; i < size; i++){
            if (bigger.getRadius() > circles[i].getRadius()){
                bigger = circles[i];
            }
        }
        return bigger;
    }
    public void sortCircles(){
        for (int i = 0; i < size - 1 ; i++){
            for (int j = 0; j < size - i - 1; j++){
                if (circles[j].getRadius() > circles[j+1].getRadius()){
                    Circle tmp = circles[j];
                    circles[j] = circles[j+1];
                    circles[j+1] = tmp;
                }
            }
        }
    }
    public void printCircles(){
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
    public void printSmallestAndBiggest(){
        Circle smalllest = FindSmallestCircle();
        Circle biggest = FindBiggestCircle();
        System.out.println("Biggest - " + biggest);
        System.out.println("smallest - " + smalllest);
    }
}
