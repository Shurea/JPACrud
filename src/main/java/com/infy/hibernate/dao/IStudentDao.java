package com.infy.hibernate.dao;

import java.util.List;

import com.infy.hibernate.model.Student;

public interface IStudentDao {
    //save Student method
    void saveStudent(Student student);

    //Update Student
    void updateStudent(Student student);

    //get Student By Id
    Student getStudentById(long id);

    //get All Students
    List<Student> getAllStudents();

    //Delete Student
    void deleteStudent(long id);
}
