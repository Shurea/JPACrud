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
            add();
        }
        if (e.getSource()==view.btnUpdate){
            System.out.println("button update test");
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
