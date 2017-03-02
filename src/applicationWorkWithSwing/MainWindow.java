package applicationWorkWithSwing;
import java.awt.*;
import javax.swing.*;
/**
 * Created by Sinelnikov on 25.02.2017.
 */
class MainWindow {
    private int taskNumber;

    public  MainWindow()
    {
        taskNumber = 0;
        JFrame mainWindow = new JFrame("ППВИС Лаб. работа 1");
        mainWindow.getContentPane().setLayout(new FlowLayout());
        mainWindow.setSize(1000,600);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        setTemplateUI(panel1);
        FirstPage page1 = new FirstPage(panel1);
        mainWindow.add(page1.getPanel());

        JPanel panel2 = new JPanel();
        setTemplateUI(panel2);
        SecondPage page2 = new SecondPage(panel2);
        mainWindow.add(page2.getPanel());

        JPanel panel3 = new JPanel();
        setTemplateUI(panel3);
        ThirdPage page3 = new ThirdPage(panel3);
        mainWindow.add(page3.getPanelAddRadioSelected());

        JPanel panel4 = new JPanel();
        setTemplateUI(panel4);
        ForthPage page4 = new ForthPage(panel4);
        mainWindow.add(page4.getPanelSelectCheckBox());

//        JPanel panel2 = new JPanel();
//        panel2.setSize(300,400);
//        setTemplateUI(panel2);
//        ThirdPage page3 = new ThirdPage(panel2);
//        mainWindow.add(panel2);

        JPanel panel5 = new JPanel();
    //    panel5.setSize(300,400);
        setTemplateUI(panel5);
        FifthPage page5 = new FifthPage( panel5);
        mainWindow.add(page5.getPanelTableChangeWithButtons());

        mainWindow.setVisible(true);
    }

    public int addTask(){//adds 1 to number of task
        return taskNumber = taskNumber+1;
    }
    public void setTemplateUI(JPanel panel){//creates border to Jpanel with task number
        panel.setBorder(BorderFactory.createTitledBorder("Task"+String.valueOf(addTask())));
        panel.setSize(300,400);
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

