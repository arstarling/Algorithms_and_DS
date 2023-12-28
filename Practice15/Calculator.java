package Practice15;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        Frame f = new Frame("Калькулятор");
        final TextField tf1 = new TextField();
        final TextField resultField = new TextField();

        tf1.setBounds(50, 50, 100, 20);
        resultField.setBounds(160, 50, 210, 20);

        // Создаем кнопки для цифр и операций
        Button[] digitButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new Button(String.valueOf(i));
            digitButtons[i].setBounds(50 + (i % 3) * 50, 100 + (i / 3) * 50, 50, 30);
            final int digit = i;
            digitButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tf1.setText(tf1.getText() + digit);
                }
            });
            f.add(digitButtons[i]);
        }

        Button dotButton = new Button(".");
        dotButton.setBounds(150, 250, 50, 30);
        dotButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + ".");
            }
        });
        f.add(dotButton);

        Button equalsButton = new Button("=");
        equalsButton.setBounds(220, 250, 50, 30);
        equalsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = evaluate(tf1.getText());
                    resultField.setText(String.valueOf(result));
                } catch (Exception ex) {
                    resultField.setText("Ошибка");
                }
            }
        });
        f.add(equalsButton);

        // Создаем кнопки операций
        String[] operationSymbols = {"+", "-", "*", "/"};
        Button[] operationButtons = new Button[4];
        for (int i = 0; i < 4; i++) {
            operationButtons[i] = new Button(operationSymbols[i]);
            operationButtons[i].setBounds(220, 100 + i * 50, 50, 30);
            final String operation = operationSymbols[i];
            operationButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tf1.setText(tf1.getText() + operation);
                }
            });
            f.add(operationButtons[i]);
        }

        // Создаем кнопку "Сброс"
        Button resetButton = new Button("Сброс");
        resetButton.setBounds(290, 250, 80, 30);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                resultField.setText("");
            }
        });
        f.add(resetButton);

        f.add(tf1);
        f.add(resultField);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    private static double evaluate(String expression) {
        try {
            // Убираем пробелы из выражения
            expression = expression.replaceAll("\\s", "");
            String[] tokens = expression.split("[\\+\\-\\*\\/]");
            double result = Double.parseDouble(tokens[0]);
            for (int i = 1; i < tokens.length; i++) {
                String operator = expression.substring(tokens[i - 1].length(), tokens[i - 1].length() + 1);
                double operand = Double.parseDouble(tokens[i]);
                switch (operator) {
                    case "+":
                        result += operand;
                        break;
                    case "-":
                        result -= operand;
                        break;
                    case "*":
                        result *= operand;
                        break;
                    case "/":
                        result /= operand;
                        break;
                }
            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}