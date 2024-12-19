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

    public CalculatorFrame() {
        setTitle("Advanced Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout());

        // Поле для ввода выражения
        displayField = new JTextField();
        displayField.setFont(new Font("Arial", Font.BOLD, 24));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        add(displayField, BorderLayout.NORTH);

        // Панель для кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Добавление кнопок цифр, операций и символов
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

        // Кнопка очистки
        JButton clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        clearButton.addActionListener(e -> displayField.setText(""));
        add(clearButton, BorderLayout.SOUTH);

        add(buttonPanel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Обработчик для нажатий кнопок
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {
                calculateExpression();
            } else {
                displayField.setText(displayField.getText() + buttonText);
            }
        }
    }

    // Метод вычисления выражения
    private void calculateExpression() {
        String expression = displayField.getText();

        try {
            // Обработка случаев с двойными минусами
            expression = expression.replace("--", "+");

            // Вычисление результата
            double result = evaluate(expression);

            // Проверка на ошибку (NaN)
            if (Double.isNaN(result)) {
                // Если произошла ошибка, выводим сообщение и завершаем
                return;
            }

            displayField.setText(String.valueOf(result));
        } catch (Exception e) {
            displayField.setText("Error");
        }
    }


    // Метод для вычисления выражения
    private double evaluate(String expression) {
        // Удаляем пробелы для удобства
        expression = expression.replaceAll("\\s+", "");

        // Парсер для обработки операций +, -, *, /
        return parseExpression(expression);
    }

    // Парсер для обработки арифметических операций
    private double parseExpression(String expression) {
        String[] terms = expression.split("(?=[+-])"); // Разделяем по "+" и "-"
        double result = parseTerm(terms[0]); // Вычисляем первый термин

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

    // Обработка умножения и деления
    private double parseTerm(String term) {
        // Разделяем на части, учитывая "*" и "/"
        String[] factors = term.split("[*/]");
        double result = parseFactor(factors[0]); // Вычисляем первый фактор

        int factorIndex = factors[0].length(); // Начальный индекс для поиска операторов
        for (int i = 1; i < factors.length; i++) {
            char operator = term.charAt(factorIndex); // Определяем оператор (* или /)
            double value = parseFactor(factors[i]);

            if (operator == '*') {
                result *= value;
            } else if (operator == '/') {
                if (value == 0) {
                    displayField.setText("Hello World!");
                    return Double.NaN; // Возвращаем NaN, чтобы остановить вычисления
                }
                result /= value;
            }

            // Обновляем индекс для следующего оператора
            factorIndex += factors[i].length() + 1; // Длина текущего фактора + 1 (для оператора)
        }

        return result;
    }
    // Парсер для числа
    private double parseFactor(String factor) {
        return Double.parseDouble(factor);
    }
}
