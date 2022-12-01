package com.infy.hibernate.dao;

import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infy.hibernate.model.Student;
import com.infy.hibernate.util.HibernateUtil;

public class StudentDao implements IStudentDao{

    //save Student method
    @Override
    public void saveStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();

            //save student object
            session.save(student);
            //commit the transaction
            transaction.commit();

        }catch(Exception e) {
            if(transaction !=null) {
                transaction.rollback();
            }
        }
    }

    //Update Student
    @Override
    public void updateStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();

            //save student object
            session.saveOrUpdate(student);
            //commit the transaction
            transaction.commit();

        }catch(Exception e) {
            if(transaction !=null) {
                transaction.rollback();
            }
        }
    }

    //get Student By Id
    @Override
    public Student getStudentById(long id) {
        Transaction transaction = null;
        Student student = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();

            //get student object
            student = session.get(Student.class,id);
//			student = session.load(Student.class, id);
            //commit the transaction
            transaction.commit();

        }catch(Exception e) {
            if(transaction !=null) {
                transaction.rollback();
            }
        }

        return student;
    }

    //get All Students
    @Override
    @SuppressWarnings("unchecked")
    public List<Student> getAllStudents() {
        Transaction transaction = null;
        List<Student> students = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();

            //get students
            students = session.createQuery("from Student").list();

            //commit the transaction
            transaction.commit();

        }catch(Exception e) {
            if(transaction !=null) {
                transaction.rollback();
            }
        }

        return students;
    }

    //Delete Student
    @Override
    public void deleteStudent(long id) {
        Transaction transaction = null;
        Student student = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            //start the transaction
            transaction = session.beginTransaction();
            //getting the student that we want to delete
            student = session.get(Student.class, id);
            //get student object
            session.delete(student);
            //commit the transaction
            transaction.commit();

        }catch(Exception e) {
            if(transaction !=null) {
                transaction.rollback();
            }
        }
    }
}
