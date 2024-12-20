package prac15.num_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedCalculatorApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorFrame());
    }
}

class CalculatorFrame extends JFrame {
    private JTextField displayField;
    private boolean operationSelected = false;

    public CalculatorFrame() {
        setTitle("Advanced Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setFont(new Font("Arial", Font.BOLD, 24));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false); // Отключаем ручной ввод
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        JButton clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        clearButton.addActionListener(e -> {
            displayField.setText("");
            operationSelected = false;
        });
        add(clearButton, BorderLayout.SOUTH);

        add(buttonPanel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.matches("[+\\-*/]")) {
                if (operationSelected) {
                    return;
                }
                displayField.setText(displayField.getText() + buttonText);
                operationSelected = true;
            } else if (buttonText.equals(".")) {
                String currentText = displayField.getText();
                if (currentText.isEmpty() || currentText.endsWith("+") || currentText.endsWith("-")
                        || currentText.endsWith("*") || currentText.endsWith("/")) {
                    displayField.setText(displayField.getText() + "0.");
                } else if (!getLastNumber(currentText).contains(".")) {
                    displayField.setText(displayField.getText() + ".");
                }
            } else if (buttonText.equals("=")) {
                calculateExpression();
                operationSelected = false;
            } else {
                displayField.setText(displayField.getText() + buttonText);
                operationSelected = false;
            }
        }
    }

    private String getLastNumber(String expression) {
        String[] parts = expression.split("[+\\-*/]");
        return parts[parts.length - 1]; // Возвращает последнее число
    }

    private void calculateExpression() {
        String expression = displayField.getText();

        try {
            expression = expression.replace("--", "+");

            double result = evaluate(expression);

            if (Double.isNaN(result)) {
                return;
            }

            displayField.setText(String.valueOf(result));
        } catch (Exception e) {
            displayField.setText("Error");
        }
    }

    private double evaluate(String expression) {
        expression = expression.replaceAll("\\s+", "");
        return parseExpression(expression);
    }

    private double parseExpression(String expression) {
        String[] terms = expression.split("(?=[+-])");
        double result = parseTerm(terms[0]);

        for (int i = 1; i < terms.length; i++) {
            String term = terms[i];
            if (term.startsWith("+")) {
                result += parseTerm(term.substring(1));
            } else if (term.startsWith("-")) {
                result -= parseTerm(term.substring(1));
            }
        }

        return result;
    }

    private double parseTerm(String term) {
        String[] factors = term.split("[*/]");
        double result = parseFactor(factors[0]);

        int factorIndex = factors[0].length();
        for (int i = 1; i < factors.length; i++) {
            char operator = term.charAt(factorIndex);
            double value = parseFactor(factors[i]);

            if (operator == '*') {
                result *= value;
            } else if (operator == '/') {
                if (value == 0) {
                    displayField.setText("Division by zero error!");
                    return Double.NaN;
                }
                result /= value;
            }

            factorIndex += factors[i].length() + 1;
        }

        return result;
    }

    private double parseFactor(String factor) {
        return Double.parseDouble(factor);
    }
}
