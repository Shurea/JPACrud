package com.infy.hibernate.view;

import javax.swing.*;

import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
public class StudentView extends JFrame{
    //Components
    private JLabel title;

    private Container c;

    private JLabel id;
    private JTextField txtFieldId;

    private JLabel firstName;
    private JTextField txtFieldFName;

    private JLabel lastName;
    private JTextField txtFieldLName;

    private JLabel email;
    private JTextField txtFieldEmail;

    private JButton btnRefresh;
    private JButton btnAdd;
    private JButton btnUpdate;
    private JButton btnRemove;

    private JTable table;
    private JScrollPane sp;


    public StudentView() {
        setTitle("Student test");
        setBounds(550, 150, 900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setResizable(false);
        setLayout(null);

//		c = getContentPane();
//		c.setLayout(null);

        getContentPane();
        setLayout(null);

        title = new JLabel("Student Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
//        c.add(title);
        add(title);

        //ID
        id = new JLabel("Id: ");
        id.setFont(new Font("Arial", Font.PLAIN, 32));
        id.setSize(100, 25);
        id.setLocation(100, 100);
//        c.add(id);
        add(id);

        txtFieldId = new JTextField();
        txtFieldId.setFont(new Font("Arial", Font.PLAIN, 15));
        txtFieldId.setSize(230, 30);
        txtFieldId.setLocation(270, 100);
//        c.add(txtFieldId);
        add(txtFieldId);

        //First Name
        firstName = new JLabel("First Name:");
        firstName.setFont(new Font("Arial", Font.PLAIN, 32));
        firstName.setSize(230, 25);
        firstName.setLocation(100, 150);
//        c.add(firstName);
        add(firstName);

        txtFieldFName = new JTextField();
        txtFieldFName.setFont(new Font("Arial", Font.PLAIN, 15));
        txtFieldFName.setSize(230, 30);
        txtFieldFName.setLocation(270, 150);
//        c.add(txtFieldFName);
        add(txtFieldFName);

        //Last Name
        lastName = new JLabel("Last Name:");
        lastName.setFont(new Font("Arial", Font.PLAIN, 32));
        lastName.setSize(170, 25);
        lastName.setLocation(100, 200);
//        c.add(lastName);
        add(lastName);

        txtFieldLName = new JTextField();
        txtFieldLName.setFont(new Font("Arial", Font.PLAIN, 15));
        txtFieldLName.setSize(230, 30);
        txtFieldLName.setLocation(270, 200);
//        c.add(txtFieldLName);
        add(txtFieldLName);

        //Email
        email = new JLabel("Email:");
        email.setFont(new Font("Arial", Font.PLAIN, 32));
        email.setSize(170, 25);
        email.setLocation(100, 250);
//        c.add(email);
        add(email);

        txtFieldEmail = new JTextField();
        txtFieldEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        txtFieldEmail.setSize(230, 30);
        txtFieldEmail.setLocation(270, 250);
//        c.add(txtFieldEmail);
        add(txtFieldEmail);

        //Buttons

        //Refresh
        btnRefresh = new JButton("Refresh");
        btnRefresh.setFont(new Font("Arial", Font.BOLD, 17));
        btnRefresh.setSize(220, 30);
        btnRefresh.setLocation(520, 100);
//        c.add(btnRefresh);
        add(btnRefresh);
        //Add
        btnAdd = new JButton("Add");
        btnAdd.setFont(new Font("Arial", Font.BOLD, 17));
        btnAdd.setSize(220, 30);
        btnAdd.setLocation(520, 150);
//        c.add(btnAdd);
        add(btnAdd);
        //Update
        btnUpdate = new JButton("Update");
        btnUpdate.setFont(new Font("Arial", Font.BOLD, 17));
        btnUpdate.setSize(220, 30);
        btnUpdate.setLocation(520, 200);
//        c.add(btnUpdate);
        add(btnUpdate);
        //Remove
        btnRemove = new JButton("Remove");
        btnRemove.setFont(new Font("Arial", Font.BOLD, 17));
        btnRemove.setSize(220, 30);
        btnRemove.setLocation(520, 250);
//        c.add(btnRemove);
        add(btnRemove);

        //Table
        // Column Names
        String[] columnNames = { "Id", "First Name", "Last Name", "Email" };

        String[][] data = new String[][] {
                {"1", "John", "Johnson", "JJohnson@hotmail.com" },
                {"2", "Ramón", "Hernandez", "RHernandez@gmail.com" },
                {"3", "Juan", "Perez", "JuanP@live.com" },
        };
        //Initializing table
        table = new JTable(data, columnNames);
        table.setBounds(100, 350, 300, 300);
        //Adding it to JScrollPane
        sp = new JScrollPane(table);
//        c.add(sp);
        sp.setBounds(100, 350, 750, 280);
        add(sp);

        setVisible(true);
    }
}
