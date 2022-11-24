package com.infy.hibernate.controller;

import com.infy.hibernate.dao.StudentDao;
import com.infy.hibernate.model.Student;
import com.infy.hibernate.view.StudentView;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController implements ActionListener {

    StudentDao dao = new StudentDao();
    Student student =  new Student();
    StudentView view = new StudentView();
//    DefaultTableModel modelTable = new DefaultTableModel();

    public StudentController(StudentView SView){
        this.view = SView;
        this.view.btnRefresh.addActionListener(this);
        this.view.btnAdd.addActionListener(this);
        this.view.btnUpdate.addActionListener(this);
        this.view.btnRemove.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.btnRemove){
            System.out.println("button remove test");
        }
    }
}
