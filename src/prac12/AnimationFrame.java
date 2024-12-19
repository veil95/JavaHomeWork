package prac12;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class AnimationFrame extends JPanel {

    private List<BufferedImage> frames;
    private int currentFrame = 0;

    public AnimationFrame() {
        frames = new ArrayList<>();
        frames.add(loadImage("frame1.jpg"));
        frames.add(loadImage("frame2.png"));

        Timer timer = new Timer(1000, e -> {
            currentFrame = (currentFrame + 1) % frames.size();
            repaint();
        });
        timer.start();
    }
    private BufferedImage loadImage(String path) {
        try {
            return javax.imageio.ImageIO.read(getClass().getResource(path));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frames != null && !frames.isEmpty()) {
            g.drawImage(frames.get(currentFrame), 0, 0, this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation Example");
        AnimationFrame animationPanel = new AnimationFrame();
        frame.add(animationPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
