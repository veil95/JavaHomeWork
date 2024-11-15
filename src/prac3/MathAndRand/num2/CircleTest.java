package prac3.MathAndRand.num2;

public class CircleTest {
    public static void main(String args[]){
        Tester tester = new Tester(5);
        tester.printCircles();
        tester.printSmallestAndBiggest();
        tester.sortCircles();
        System.out.println("Sorted Circles by Radius:");
        tester.printCircles();
    }
}
