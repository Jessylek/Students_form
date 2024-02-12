package view;

import javax.swing.*;
import controller.UserClickContoller;
import javax.swing.table.JTableHeader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


public class FormView extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, cl, dobl;
    JTextField t1, t2;
    JFormattedTextField t3;
    JPanel p1, p2;
    JRadioButton M,F;
    JComboBox<String> cls;
    JButton bcancel, bsubmit;
    JTable j;
    JScrollPane sp;
    ButtonGroup buttonGroup;
    DefaultTableModel tableModel;
    SimpleDateFormat dateFormat;
    public String selectedGender;
    public FormView(){
        this.setTitle("Registration Form");
        this.setLayout(null);
        this.setBounds(800, 600, 800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("Fill the form to register a student");
        l1.setFont(new Font("sanserif", Font.BOLD, 14));
        l1.setForeground(Color.darkGray);
        l1.setBounds(125, 25, 400, 15);
        this.getContentPane().add(l1);

        p1 = new JPanel(null);
        p1.setBounds(10, 65, 200,300 );
        //p1.setBackground(Color.gray);
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
       M.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               selectedGender ="M";
           }
       });
        F = new JRadioButton("F");
        F.setBounds(120, 110, 40, 15 );
        p1.add(F);
        F.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGender = "G";
            }
        });

        buttonGroup = new ButtonGroup();
        buttonGroup.add(M);
        buttonGroup.add(F);

        cl = new  JLabel("class");
        cl.setBounds(12, 150, 70, 15);
        p1.add(cl);
        cls = new JComboBox<>(new String[]{" ","1","2","3","4","5"});
        cls.setBounds(80,150,70,20);
        p1.add(cls);

        dobl = new JLabel("DOB");
        dobl.setBounds(12, 200, 70, 15);
        p1.add(dobl);
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        MaskFormatter maskFormatter = null;
        try {
            maskFormatter = new MaskFormatter("##/##/####");
            maskFormatter.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        t3 = new JFormattedTextField(maskFormatter);
        t3.setBounds(80, 200, 80, 20);
        p1.add(t3);

        bcancel = new JButton("CANCEL");
        bcancel.setForeground(new Color(51,50,155));
        bcancel.setBounds(12, 250, 90, 35);
        p1.add(bcancel);
        bcancel.addActionListener(new UserClickContoller(this));

        bsubmit = new JButton("SUBMIT");
        bsubmit.setForeground(new Color(51,50,155));
        bsubmit.setBounds(110, 250, 90, 35);
        bsubmit.addActionListener(new UserClickContoller(this));
        p1.add(bsubmit);

        p2 = new JPanel(null);
        p2.setBounds(220, 65, 500,300 );
        p2.setBackground(Color.GRAY);
        this.getContentPane().add(p2);

        String[][] data = { { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " } };
        String[] columnNames = { "Name", "Sex", "Class", "DoB", "Action" };
        tableModel = new DefaultTableModel(columnNames, 0);
        j = new JTable(tableModel);
        j.setBounds(80, 60, 350, 250);
        sp = new JScrollPane(j);
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

    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String lastname = t2.getText();
       // ButtonModel gender = buttonGroup.;
        String clas = (String) cls.getSelectedItem() ;
        String Dob = t3.getText();
        DefaultTableModel model = (DefaultTableModel) j.getModel();
        tableModel.addRow(new Object[]{name+ " " +lastname, selectedGender, clas, Dob, "Action"});
    }


    public JTextField getT1() {
        return t1;
    }

    public void setT1(JTextField t1) {
        this.t1 = t1;
    }

    public JTextField getT2() {
        return t2;
    }

    public void setT2(JTextField t2) {
        this.t2 = t2;
    }

    public JFormattedTextField getT3() {
        return t3;
    }

    public void setT3(JFormattedTextField t3) {
        this.t3 = t3;
    }

    public JRadioButton getM() {
        return M;
    }

    public void setM(JRadioButton m) {
        M = m;
    }

    public JRadioButton getF() {
        return F;
    }

    public void setF(JRadioButton f) {
        F = f;
    }

    public JComboBox<String> getCls() {
        return cls;
    }

    public void setCls(JComboBox<String> cls) {
        this.cls = cls;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public JTable getJ() {
        return j;
    }

    public void setJ(JTable j) {
        this.j = j;
    }

    public ButtonGroup getButtonGroup() {
        return buttonGroup;
    }

    public void setButtonGroup(ButtonGroup buttonGroup) {
        this.buttonGroup = buttonGroup;
    }

}


