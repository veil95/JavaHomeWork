package prac12.RandomShapes;

import java.awt.*;

class Rectangle extends Shape {
    int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x - width / 2, y - height / 2, width, height);
    }
}