package prac12.RandomShapes;

import java.awt.*;

abstract class Shape {
    Color color;
    int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Абстрактный метод для рисования фигуры
    public abstract void draw(Graphics g);
}
