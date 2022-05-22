package ru.gb.vagranovich.homework8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorModel;

import javax.swing.*;

public class Calculator extends JFrame {

    private final JLabel display;
    private Double leftOperand;
    private Double rightOperand;
    private String operation;

    public static void main(String[] args) {
        new Calculator();
    }

    public Calculator() {
        setTitle("�����������");
        setBounds(300, 300, 200, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ActionListener numberActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String text = source.getText();
                String displayText = display.getText();

                if (".".equals(text) && displayText.contains(".")) {
                    return;
                }
                if ("0".equals(displayText)) {
                    displayText = "";
                }
                displayText += text;
                display.setText(displayText);
            }
        };

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String text = source.getText();
                if ("=".equals(text)) {
                    rightOperand = Double.parseDouble(display.getText());
                    if (leftOperand != null) {
                        switch (operation) {
                            case "+":
                                display.setText(String.valueOf(leftOperand + rightOperand));
                                break;
                            case "-":
                                display.setText(String.valueOf(leftOperand - rightOperand));
                                break;
                            case "*":
                                display.setText(String.valueOf(leftOperand * rightOperand));
                                break;
                            case "/":
                                display.setText(String.valueOf(leftOperand / rightOperand));
                                break;
                        }
                        leftOperand = Double.parseDouble(display.getText());
                        rightOperand = null;
                        operation = null;
                    }
                    return;
                }
                leftOperand = Double.parseDouble(display.getText());
                display.setText("0");
                operation = text;
            }
        };

        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(4, 3, 1, 1);
        numberPanel.setLayout(numberLayout);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf((i+1)%10));
            button.addActionListener(numberActionListener);
            numberPanel.add(button);
        }
        JButton pointButton = new JButton(".");
        numberPanel.add(pointButton);
        pointButton.addActionListener(numberActionListener);
        numberPanel.add(new JButton("+/-"));

        JPanel buttonPanel = new JPanel();
        GridLayout buttonLayout = new GridLayout(2, 3, 1, 1);
        buttonPanel.setLayout(buttonLayout);

        for (char c : "C+-*/=".toCharArray()) {
            JButton button = new JButton(String.valueOf(c));
            button.addActionListener(actionListener);
            buttonPanel.add(button);

        }

        display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 32));
        add(display, BorderLayout.NORTH);
        add(numberPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);

    }
}
