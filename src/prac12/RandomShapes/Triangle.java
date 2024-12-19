package prac12.RandomShapes;

import java.awt.*;

class Triangle extends Shape {
    int size;

    public Triangle(Color color, int x, int y, int size) {
        super(color, x, y);
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        int halfSize = size / 2;
        int[] xPoints = {x, x - halfSize, x + halfSize};
        int[] yPoints = {y - size, y + halfSize, y + halfSize};
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
