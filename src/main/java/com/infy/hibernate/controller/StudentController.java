package com.infy.hibernate.controller;

import com.infy.hibernate.dao.StudentDao;
import com.infy.hibernate.model.Student;
import com.infy.hibernate.view.StudentView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentController implements ActionListener {

    StudentDao dao = new StudentDao();
    Student student =  new Student();
    StudentView view = new StudentView();
    DefaultTableModel modelTable = new DefaultTableModel();

    boolean isUpdating = false;

    public StudentController(StudentView SView){
        this.view = SView;
        this.view.btnRefresh.addActionListener(this);
        this.view.btnAdd.addActionListener(this);
        this.view.btnUpdate.addActionListener(this);
        this.view.btnRemove.addActionListener(this);
//        getAll(view.table);
    }

    // TODO: Implementar los métodos delete, update, add, getAll usando
    // el DAO para interactuar con la BD
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.btnRefresh){
            System.out.println("button refresh test");
            getAll(view.table);
        }
        if (e.getSource()==view.btnAdd){
            System.out.println("button add test");
            if(isUpdating){
                update();
                isUpdating = false;
            }else{
                add();
            }
        }
        if (e.getSource()==view.btnUpdate){
            System.out.println("button update test");
            int selectedRow = view.table.getSelectedRow();
            if (selectedRow == -1){
                JOptionPane.showMessageDialog(view, "You must select a row!");
            }
            else{
                int id = Integer.parseInt((String)view.table.getValueAt(selectedRow, 0).toString());
                String email = (String)view.table.getValueAt(selectedRow, 1);
                String FName = (String)view.table.getValueAt(selectedRow,2);
                String LName = (String)view.table.getValueAt(selectedRow,3);

                view.txtFieldId.setText(""+id);
                view.txtFieldEmail.setText(email);
                view.txtFieldFName.setText(FName);
                view.txtFieldLName.setText(LName);
                isUpdating = true;
            }
        }
        if (e.getSource()==view.btnRemove){
            System.out.println("button remove test");
        }
    }

    void clear(){

    }

    public void delete(){

    }

    public void add(){
        String FName = view.txtFieldFName.getText();
        String LName = view.txtFieldLName.getText();
        String email = view.txtFieldEmail.getText();

        student.setFirstName(FName);
        student.setLastName(LName);
        student.setEmail(email);

        dao.saveStudent(student);
    }

    public void update(){
        int id = Integer.parseInt(view.txtFieldId.getText());
        String FName = view.txtFieldFName.getText();
        String LName = view.txtFieldLName.getText();
        String email = view.txtFieldEmail.getText();

        student.setId(id);
        student.setFirstName(FName);
        student.setLastName(LName);
        student.setEmail(email);

        dao.updateStudent(student);
    }

    public void getAll(JTable table){
        modelTable = (DefaultTableModel) table.getModel();
        modelTable.addColumn("ID");
        modelTable.addColumn("Email");
        modelTable.addColumn("First Name");
        modelTable.addColumn("Last Name");

        List<Student> list = dao.getAllStudents();
        Object[] object = new Object[4];
        for (int i = 0; i < list.size(); i++){
            object[0] = list.get(i).getId();
            object[1] = list.get(i).getEmail();
            object[2] = list.get(i).getFirstName();
            object[3] = list.get(i).getLastName();
            modelTable.addRow(object);
        }
        view.table.setModel(modelTable);
    }
}
