package applicationWorkWithSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created by Sinelnikov on 25.02.2017.
 */
class MainWindow {
    private int taskNumber;
    FirstPage page1;
    SecondPage page2;
    ThirdPage page3;
    ForthPage page4;
    public  MainWindow()
    {
        taskNumber = 0;
        /*JRadioButton openFirstTask;
        JRadioButton openSecondTask;
        JRadioButton openThirdTask;
        JRadioButton openForthTask;*/
        JFrame mainWindow = new JFrame("ППВИС Лаб. работа 1");
        mainWindow.getContentPane().setLayout(new FlowLayout());
        mainWindow.setSize(1000,600);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*openFirstTask = new JRadioButton("First task");
        openSecondTask = new JRadioButton("Second task");
        openThirdTask = new JRadioButton("Third task");
        openForthTask = new JRadioButton("Forth task");*/
       // ButtonGroup groupOfTasks = new ButtonGroup();
        /*groupOfTasks.add(openFirstTask);
        groupOfTasks.add(openSecondTask);
        groupOfTasks.add(openThirdTask);
        groupOfTasks.add(openForthTask);
        mainWindow.add(openThirdTask);
        mainWindow.add(openSecondTask);
        mainWindow.add(openFirstTask);
        mainWindow.add(openForthTask);
*/
        JPanel panel1 = new JPanel();
        panel1.setSize(300,400);
        setUsersBorder(panel1);
        page2 = new SecondPage(panel1);
        mainWindow.add(page2.getPanel());

        JPanel panel2 = new JPanel();
        panel2.setSize(300,400);
        setUsersBorder(panel2);
        page3 = new ThirdPage(panel2);
        mainWindow.add(panel2);

        JPanel panel3 = new JPanel();
        panel2.setSize(300,400);
        setUsersBorder(panel3);
        page3 = new ThirdPage(panel3);
        mainWindow.add(panel3);

        mainWindow.setVisible(true);
  /*      openFirstTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page1 = new FirstPage();
            }
        });
        openSecondTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page2 = new SecondPage();
            }
        });
        openThirdTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page3 = new ThirdPage();
            }
        });
        openForthTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page4 = new ForthPage();
            }
        });
  */  }

    public int addTask(){//adds 1 to number of task
        return taskNumber = taskNumber+1;
    }
    public void setUsersBorder(JPanel panel){//creates border to Jpanel with task number
        panel.setBorder(BorderFactory.createTitledBorder("Task"+String.valueOf(addTask())));
    }
    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });
    }
};

