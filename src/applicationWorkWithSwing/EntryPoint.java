package applicationWorkWithSwing;

import java.awt.*;
import javax.swing.*;

class EntryPoint {
    public EntryPoint() {
        JFrame mainWindow = new JFrame("ППВИС Лаб. работа 1");
        mainWindow.getContentPane().setLayout(new FlowLayout());
        mainWindow.setSize(850, 250);
        mainWindow.setResizable(false);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FirstPage firstTask = new FirstPage();
        SecondPage secondTask = new SecondPage();
        ThirdPage thirdTask = new ThirdPage();
        ForthPage forthTask = new ForthPage();
        FifthPage fifthTask = new FifthPage();

        mainWindow.add(firstTask.getPanel());
        mainWindow.add(secondTask.getPanel());
        mainWindow.add(thirdTask.getPanelAddRadioSelected());
        mainWindow.add(forthTask.getPanelSelectCheckBox());
        mainWindow.add(fifthTask.getPanelTableChangeWithButtons());

        mainWindow.setVisible(true);
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EntryPoint();
            }
        });
    }
};

