package com.infy.hibernate;

import com.infy.hibernate.dao.IStudentDao;
import com.infy.hibernate.dao.StudentDao;
import com.infy.hibernate.model.Student;
import com.infy.hibernate.view.StudentView;

public class App {
    public static void main(String[] args) {

//		StudentView studentView = new StudentView();

		IStudentDao studentDao = new StudentDao();
//
//		// save student test
		Student student = new Student("Omar", "Bustamante", "omar@infy.com");
		studentDao.saveStudent(student);
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
//		students.forEach(studnt -> System.out.println(studnt.getId()));
//
//		// delete student
////		studentDao.deleteStudent(student.getId());
    }
}