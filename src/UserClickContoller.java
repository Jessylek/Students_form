import view.FormView;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class UserClickContoller implements ActionListener{
    FormView formView;
    public UserClickContoller (FormView form) {this.formView = form;}
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "SUBMIT":{
                String name = formView.getT1().getText();
                String lastname = formView.getT2().getText();
                //ButtonModel gender = formView.getButtonGroup().selectedGender();
                String clas = (String) formView.getCls().getSelectedItem() ;
                String Dob = formView.getT3().getText();
                DefaultTableModel model = (DefaultTableModel) formView.getJ().getModel();
                formView.getTableModel().addRow(new Object[]{name+ " " +lastname, formView.selectedGender, clas, Dob, "Action"});
            break;
            }
            case "CANCEL": {
                this.formView.getT1().setText(" ");
                this.formView.getT2().setText(" ");
                //ButtonModel gender = formView.getButtonGroup().selectedGender();
                this.formView.getCls().setToolTipText(" "); ;
                this.formView.getT3().setText(" ");
                break;
            }

        }
    }
}
