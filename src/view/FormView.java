package view;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;



public class FormView extends JFrame {
    JLabel l1, l2, l3, l4, cl, dobl;
    JTextField t1, t2, t3;
    JPanel p1, p2;
    JRadioButton M,F;
    JComboBox<String> cls;
    JButton bcancel, bsubmit;
    JTable j;
    JScrollPane sp;
    DefaultTableModel tableModel;

    public FormView(){
        this.setTitle("Registration Form");
        this.setLayout(null);
        this.setBounds(800, 600, 800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("Fill the form to register a student");
        l1.setBounds(125, 25, 200, 15);
        this.getContentPane().add(l1);

        p1 = new JPanel(null);
        p1.setBounds(10, 65, 200,300 );
        p1.setBackground(Color.blue);
        this.getContentPane().add(p1);

        l2 = new JLabel("Name");
        l2.setBounds(12, 15, 60, 15);
        p1.add(l2);
        t1 = new JTextField();
        t1.setBounds(80, 15, 80, 20);
        p1.add(t1);


        l3 = new JLabel("LastName");
        l3.setBounds(12, 60, 70, 15);
        p1.add(l3);
        t2 = new JTextField();
        t2.setBounds(80, 60, 80, 20);
        p1.add(t2);

        l4 = new JLabel("Sex");
        l4.setBounds(12, 110, 70, 15 );
        p1.add(l4);

        M = new JRadioButton("M");
        M.setBounds(80, 110, 40, 15 );
        p1.add(M);

        F = new JRadioButton("F");
        F.setBounds(120, 110, 40, 15 );
        p1.add(F);

        cl = new  JLabel("class");
        cl.setBounds(12, 150, 70, 15);
        p1.add(cl);
        cls = new JComboBox<>(new String[]{" ","1","2","3","4","5"});
        cls.setBounds(80,150,70,20);
        p1.add(cls);

        dobl = new JLabel("DOB");
        dobl.setBounds(12, 200, 70, 15);
        p1.add(dobl);
        t3 = new JTextField();
        t3.setBounds(80, 200, 80, 20);
        p1.add(t3);

        bcancel = new JButton("CANCEL");
        bcancel.setBounds(12, 250, 90, 35);
        p1.add(bcancel);

        bsubmit = new JButton("SUBMIT");
        bsubmit.setBounds(110, 250, 90, 35);
        p1.add(bsubmit);

        p2 = new JPanel(null);
        p2.setBounds(220, 65, 500,300 );
        //p2.setBackground(Color.GRAY);
        this.getContentPane().add(p2);

        String[][] data = { { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " } };

        String[] columnNames = { "Name", "Sex", "Class", "DoB", "Action" };
        tableModel = new DefaultTableModel(columnNames, 0);
        j = new JTable(tableModel);
        j.setBounds(80, 60, 350, 250);
        JScrollPane sp = new JScrollPane(j);
        sp.setBounds(0, 0, 500, 300);
        p2.add(sp);
        p2.setVisible(true);
        this.getContentPane().add(p2);

    }

    public JButton getBsubmit() {
        return bsubmit;
    }

    public void setBsubmit(JButton bsubmit) {
        this.bsubmit = bsubmit;
    }
}

