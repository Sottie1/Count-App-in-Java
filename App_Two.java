package com.knox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App_Two {
    private JPanel framePanel;
    private JTextField resultsField;
    private JButton countUpButton;
    private JButton countDownButton;
    private JButton resetButton;
    private JLabel counterLabel;

    public App_Two() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Retrieve number entered by the user
                int number = Integer.parseInt(resultsField.getText());

                //check each button and updated number
                if (e.getSource()==countUpButton){
                    ++number;
                    resultsField.setText(String.valueOf(number));
                }else {
                    if (e.getSource()==countDownButton){
                        --number;
                        resultsField.setText(String.valueOf(number));
                    }else {
                        number = 0;
                        resultsField.setText(String.valueOf(number));
                    }
                }
            }
        };
        countUpButton.addActionListener(listener);
        countDownButton.addActionListener(listener);
        resetButton.addActionListener(listener);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App_Two");
        frame.setContentPane(new App_Two().framePanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 80);
        frame.setVisible(true);
    }
}
