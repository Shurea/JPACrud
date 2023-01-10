package com.infy.hibernate;

import com.infy.hibernate.controller.StudentController;
import com.infy.hibernate.dao.IStudentDao;
import com.infy.hibernate.dao.StudentDao;
import com.infy.hibernate.model.Student;
import com.infy.hibernate.view.StudentView;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.List;

public class App {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {

		StudentView studentView = new StudentView();
        StudentController controller = new StudentController(studentView);
        UIManager.setLookAndFeel(new SynthLookAndFeel());
        studentView.setVisible(true);

//		IStudentDao studentDao = new StudentDao();
//
//		// save student test
//		Student student = new Student("Rogelio", "Martinez", "RogerM@infy.com");
//		studentDao.saveStudent(student);
//
//		// update student test
////		student.setFirstName("Onar");
//		studentDao.updateStudent(student);
//
//		// get student by id test
//		Student student2 = studentDao.getStudentById(student.getId());
//		System.out.println("student fetched by id: " + student2.getId());
//
//		// get all students test
//		List<Student> students = studentDao.getAllStudents();
//		students.forEach(studnt -> System.out.println(studnt.getFirstName()));
//
//		// delete student
////		studentDao.deleteStudent(student.getId());
    }
}
