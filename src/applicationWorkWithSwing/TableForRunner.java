package applicationWorkWithSwing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sinelnikov on 15.03.2017.
 */
public class TableForRunner {
    JPanel panelForTableRunnerTask;
    public TableForRunner(){
        JButton btnStartOrFinishRunner = new JButton("Start runner");
        panelForTableRunnerTask = new JPanel();
        panelForTableRunnerTask.setBorder(BorderFactory.createTitledBorder("Task special"));
        panelForTableRunnerTask.setPreferredSize(new Dimension(820, 200));
        JTable tableToBeChanged = new JTable(new DefaultTableModel(0, 2));
        JScrollPane scrollPaneWithTable = new JScrollPane(tableToBeChanged);
        scrollPaneWithTable.setPreferredSize(new Dimension(600, 160));
        panelForTableRunnerTask.add(btnStartOrFinishRunner);
        panelForTableRunnerTask.add(scrollPaneWithTable);
        TableRunner runner = new TableRunner();
        btnStartOrFinishRunner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btnStartOrFinishRunner.getText().equals("Start runner")){
                    btnStartOrFinishRunner.setText("Stop runner");
                    runner.start();

                }
                else {
                    btnStartOrFinishRunner.setText("Start runner");
                    runner.finish();
                }
            }
        });
    }
    public JPanel getPanelForTableRunnerTask(){
        return panelForTableRunnerTask;
    }

}
