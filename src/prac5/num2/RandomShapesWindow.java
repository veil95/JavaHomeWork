package prac5.num2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesWindow {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10;
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = random.nextInt(50) + 10;
                int height = random.nextInt(50) + 10;
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }

        // Создаем окно
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new ShapePanel(shapes));
        frame.setVisible(true);
    }
}
