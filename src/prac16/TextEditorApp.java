package prac16;
import javax.swing.*;
import java.awt.*;

public class TextEditorApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextEditorFrame());
    }
}

class TextEditorFrame extends JFrame {
    private JTextArea textArea;

    public TextEditorFrame() {
        setTitle("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        add(new JScrollPane(textArea), BorderLayout.CENTER);

        createMenu();

        setVisible(true);
    }

    private void createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesItem = new JMenuItem("Times New Roman");
        JMenuItem sansItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierItem = new JMenuItem("Courier New");

        timesItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14)));
        sansItem.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14)));
        courierItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 14)));

        fontMenu.add(timesItem);
        fontMenu.add(sansItem);
        fontMenu.add(courierItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        setJMenuBar(menuBar);
    }
}
