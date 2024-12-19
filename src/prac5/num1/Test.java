package prac5.num1;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String [] args){
        JFrame frame =  new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(400,300));
        GridBagConstraints gbc = new GridBagConstraints();

        JButton button_milan = new JButton("AC Milan");
        button_milan.setPreferredSize(new Dimension(150,50));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(button_milan, gbc);

        JButton button_madrid = new JButton("Real Madrid");
        button_madrid.setPreferredSize(new Dimension(150,50));
        gbc.gridx = 1;
        panel.add(button_madrid, gbc);

        final int[] scoreMilan = {0};
        final int[] scoreMadrid = {0};

        JLabel labelResult = new JLabel("Result: 0 X 0");
        JLabel labelLastScorer = new JLabel("Last Scorer: N/A");
        JLabel labelWinner = new JLabel("Winner: DRAW");

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(labelResult, gbc);

        gbc.gridy = 2;
        panel.add(labelLastScorer, gbc);

        gbc.gridy = 3;
        panel.add(labelWinner, gbc);

        button_milan.addActionListener(e -> {
            scoreMilan[0]++;
            labelResult.setText("Result: " + scoreMilan[0] + " X " + scoreMadrid[0]);
            labelLastScorer.setText("Last Scorer: AC Milan");
            updateWinner(labelWinner, scoreMilan[0], scoreMadrid[0]);
        });

        button_madrid.addActionListener(e -> {
            scoreMadrid[0]++;
            labelResult.setText("Result: " + scoreMilan[0] + " X " + scoreMadrid[0]);
            labelLastScorer.setText("Last Scorer: Real Madrid");
            updateWinner(labelWinner, scoreMilan[0], scoreMadrid[0]);
        });
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private static void updateWinner(JLabel labelWinner, int scoreMilan, int scoreMadrid) {
        if (scoreMilan > scoreMadrid) {
            labelWinner.setText("Winner: AC Milan");
        } else if (scoreMadrid > scoreMilan) {
            labelWinner.setText("Winner: Real Madrid");
        } else {
            labelWinner.setText("Winner: DRAW");
        }
    }
}
