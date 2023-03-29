package com.knox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class App_1 {
    private JPanel framePanel;
    private JLabel conterLabel;
    private JTextField ResultsField;
    private JButton countsButton;

    private int number = 0;

    public App_1() {
        countsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++ number;
                ResultsField.setText(String.valueOf(number));

            }
        });
        //constructor ends here!!
    }
    //Crete a method to generate MenuBar

    private static JMenuBar createMenubar(){
        JMenuBar menubBar = new JMenuBar();


        //create menus to add to the  menuBar

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        //create menu Items to be added to the file menu

        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        //create menu Items to be Added to Edit Menu

        JMenuItem undoMenuItem = new JMenuItem("Undo Count");
        JMenuItem updateMenuItem = new JMenuItem("Check for Updates...");

        //create menu Items to be Added to Help Menu
        JMenuItem aboutMenuItem = new JMenuItem("About");

        //Add Menu items to file menu

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(exitMenuItem);

        //Add Menu items to edit menu

        editMenu.add(undoMenuItem);
        editMenu.add(updateMenuItem);

        //Add Menu items to help menu
        helpMenu.add(aboutMenuItem);

        //Add Menu to the Menu Bar

        menubBar.add(fileMenu);
        menubBar.add(editMenu);
        menubBar.add(helpMenu);

        //set Mnemonics
        fileMenu.setMnemonic(KeyEvent.VK_F);

        //set Accelerator to exit the program

        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

         //Add an action to exit the program
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        return menubBar;

        //MenuBar Method Ends Here!!
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App_1");
        frame.setContentPane(new App_1().framePanel );

        //Position Frame at the middle of the screen

        frame.setLocationRelativeTo(null);

        //Display menu Bar

        frame.setJMenuBar(createMenubar());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    } //Main Method Ends here

} //App_1 Class ends Here
