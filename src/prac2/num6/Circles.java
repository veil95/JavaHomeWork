package prac2.num6;

import java.util.ArrayList;

public class Circles {
    private ArrayList<Circle> circles;

    public Circles(){
        circles = new ArrayList<>();
    }

    public void addCircle(Circle circle){
        circles.add(circle);
    }

    public void DisplayCircles(){
        if (circles.isEmpty()){
            System.out.println("Вы еще не добавляли окружностей");
        }
        else{
            for (int i = 0; i < circles.size(); i++){
                System.out.println("Окружность " + (i+1) + ":" + circles.get(i));
            }
        }
    }

    public Circle getCircle(int index){
        if (index >= 0 && index < circles.size()){
            return circles.get(index);
        }
        else if(!circles.isEmpty()){
            System.out.println("Введен некоректный индекс");
            return null;
        }
        return null;
    }
}
