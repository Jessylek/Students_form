package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    JButton btn1, btn2, btn3;


    public View(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Index");
        this.setBounds(400, 200, 500, 300);
        this.setLayout(null);

        btn1 = new JButton("Register a student");
        btn1.setBounds(80, 30,300,40);
        btn1.addActionListener(this);
        this.getContentPane().add(btn1);
        btn2 = new JButton("Register an exam");
        btn2.setBounds(80, 90,300,40);
        this.getContentPane().add(btn2);
        btn2.addActionListener(this);
        btn3 = new JButton("Register marks");
        btn3.setBounds(80, 150,300,40);
        this.getContentPane().add(btn3);
        btn3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == btn1) {
            this.dispose();
            FormView vf = new FormView();
            vf.setVisible(true);
        }
        else
        { this.dispose();
            View homeview = new View();
        }

    }}


