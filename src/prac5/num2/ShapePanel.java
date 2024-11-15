package prac5.num2;

import javax.swing.*;
import java.awt.*;

class ShapePanel extends JPanel {
    private Shape[] shapes;

    public ShapePanel(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}