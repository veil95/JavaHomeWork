package prac12.RandomShapes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesDrawing extends JPanel {
    private static final int NUM_SHAPES = 20;
    private Shape[] shapes;

    public RandomShapesDrawing() {
        shapes = new Shape[NUM_SHAPES];
        Random rand = new Random();

        // Генерация случайных фигур
        for (int i = 0; i < NUM_SHAPES; i++) {
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(400) + 50;
            int y = rand.nextInt(400) + 50;
            int shapeType = rand.nextInt(3);

            switch (shapeType) {
                case 0:
                    int radius = rand.nextInt(50) + 20;
                    shapes[i] = new Circle(color, x, y, radius);
                    break;
                case 1:
                    int width = rand.nextInt(60) + 20;
                    int height = rand.nextInt(60) + 20;
                    shapes[i] = new Rectangle(color, x, y, width, height);
                    break;
                case 2:
                    int size = rand.nextInt(60) + 20;
                    shapes[i] = new Triangle(color, x, y, size);
                    break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Рисуем все фигуры
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        // Создание окна
        JFrame frame = new JFrame("Random Shapes");
        RandomShapesDrawing panel = new RandomShapesDrawing();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(panel);
        frame.setVisible(true);
    }
}
