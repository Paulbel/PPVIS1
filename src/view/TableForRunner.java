package view;

import model.TableRunner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TableForRunner {
    JPanel panelForTableRunnerTask;
    TableRunner runner;
    JTable tableForRunner;

    public TableForRunner() {
        JButton btnStartOrFinishRunner = new JButton("Start runner");
        btnStartOrFinishRunner.setEnabled(false);
        JButton btnAddToTable = new JButton("Add to table");
        JButton btnCreateTable = new JButton("Create table");
        btnAddToTable.setEnabled(false);
        JLabel labelInputText = new JLabel("Input info here:");
        JTextField rowCount = new JTextField("5", 10);
        JTextField columnCount = new JTextField("10", 10);
        JTextField textForAdd = new JTextField(10);
        panelForTableRunnerTask = new JPanel();
        panelForTableRunnerTask.setBorder(BorderFactory.createTitledBorder("Task special"));
        panelForTableRunnerTask.setPreferredSize(new Dimension(820, 200));
        panelForTableRunnerTask.add(btnStartOrFinishRunner);
        panelForTableRunnerTask.add(rowCount);
        panelForTableRunnerTask.add(columnCount);
        panelForTableRunnerTask.add(btnCreateTable);
        panelForTableRunnerTask.add(labelInputText);
        panelForTableRunnerTask.add(textForAdd);
        panelForTableRunnerTask.add(btnAddToTable);
        btnStartOrFinishRunner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnStartOrFinishRunner.getText().equals("Start runner")) {
                    btnStartOrFinishRunner.setText("Stop runner");
                    runner = new TableRunner(tableForRunner);
                    runner.start();

                } else {
                    btnStartOrFinishRunner.setText("Start runner");
                    runner.interrupt();
                }
            }
        });
        btnAddToTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableForRunner.setValueAt(textForAdd.getText(), tableForRunner.getSelectedRow(), tableForRunner.getSelectedColumn());
            }
        });
        btnCreateTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!rowCount.getText().equals("") && !columnCount.getText().equals("")) {
                    tableForRunner = new JTable(Integer.parseInt(rowCount.getText()), Integer.parseInt(columnCount.getText()));
                    JScrollPane scrollPaneWithTable = new JScrollPane(tableForRunner);
                    scrollPaneWithTable.setPreferredSize(new Dimension(800, 140));
                    panelForTableRunnerTask.add(scrollPaneWithTable);
                    panelForTableRunnerTask.revalidate();
                    btnStartOrFinishRunner.setEnabled(true);
                    btnCreateTable.setEnabled(false);
                    columnCount.setVisible(false);
                    rowCount.setVisible(false);
                    btnAddToTable.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(panelForTableRunnerTask, "Incorrect numbers");
                }
            }
        });
    }

    public JPanel getPanelForTableRunnerTask() {
        return panelForTableRunnerTask;
    }

}
