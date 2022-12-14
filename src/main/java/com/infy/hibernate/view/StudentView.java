package com.infy.hibernate.view;

import javax.swing.*;
import java.awt.*;

public class StudentView extends JFrame {
    private JPanel panelTop;
    private JPanel panelBottom;
//    private JPanel panelLeft;
//    private JPanel panelRight;
//    private JPanel panelCenter;
    private JLabel title;

    private JLabel id;
    public JTextField txtFieldId;

    private JLabel firstName;
    public JTextField txtFieldFName;

    private JLabel lastName;
    public JTextField txtFieldLName;

    private JLabel email;
    public JTextField txtFieldEmail;

    public JButton btnRefresh;
    public JButton btnAdd;
    public JButton btnUpdate;
    public JButton btnRemove;

    public JTable table;
    private JScrollPane sp;

    public StudentView(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 700));
        setLayout(new BorderLayout(5, 5));


        //-----------main panels------------
        panelTop = new JPanel();
        panelBottom = new JPanel();

        panelTop.setBackground(Color.lightGray);
        panelTop.setLayout(new GridLayout(4, 3, 40, 40));
        panelBottom.setBackground(Color.lightGray);

        //------ID------
        //Label
        id = new JLabel("Id: ");
        id.setFont(new Font("Arial", Font.PLAIN, 32));
        id.setSize(100, 25);
        panelTop.add(id);
        //TextField
        txtFieldId = new JTextField();
        txtFieldId.setFont(new Font("Arial", Font.PLAIN, 15));
        txtFieldId.setPreferredSize(new Dimension(100, 30));
        txtFieldId.setEditable(false);
        panelTop.add(txtFieldId);
        //Refresh Button
        btnRefresh = new JButton("Refresh");
        btnRefresh.setFont(new Font("Arial", Font.BOLD, 17));
        btnRefresh.setSize(220, 30);
        panelTop.add(btnRefresh);

        //------First Name------
        //Label
        firstName = new JLabel("First Name:");
        firstName.setFont(new Font("Arial", Font.PLAIN, 32));
        firstName.setSize(230, 25);
        panelTop.add(firstName);
        //TextField
        txtFieldFName = new JTextField();
        txtFieldFName.setFont(new Font("Arial", Font.PLAIN, 15));
        txtFieldFName.setSize(230, 30);
        panelTop.add(txtFieldFName);
        //Add Button
        btnAdd = new JButton("Save");
        btnAdd.setFont(new Font("Arial", Font.BOLD, 17));
        btnAdd.setSize(220, 30);
        panelTop.add(btnAdd);

        //------Last Name------
        //Label
        lastName = new JLabel("Last Name:");
        lastName.setFont(new Font("Arial", Font.PLAIN, 32));
        lastName.setSize(170, 25);
        panelTop.add(lastName);
        //TextField
        txtFieldLName = new JTextField();
        txtFieldLName.setFont(new Font("Arial", Font.PLAIN, 15));
        txtFieldLName.setSize(230, 30);
        panelTop.add(txtFieldLName);
        //Update Button
        btnUpdate = new JButton("Edit");
        btnUpdate.setFont(new Font("Arial", Font.BOLD, 17));
        btnUpdate.setSize(220, 30);
        panelTop.add(btnUpdate);

        //------Email------
        //Label
        email = new JLabel("Email:");
        email.setFont(new Font("Arial", Font.PLAIN, 32));
        email.setSize(170, 25);
        panelTop.add(email);
        //TextField
        txtFieldEmail = new JTextField();
        txtFieldEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        txtFieldEmail.setSize(230, 30);
        panelTop.add(txtFieldEmail);
        //Remove Button
        btnRemove = new JButton("Remove");
        btnRemove.setFont(new Font("Arial", Font.BOLD, 17));
        btnRemove.setSize(220, 30);
        panelTop.add(btnRemove);

        //Table
        table = new JTable();
        table.setPreferredSize(new Dimension(750, 300));
        table.setFont(new Font("Roboto", Font.PLAIN, 19));
        table.getTableHeader().setFont(new Font("Roboto", Font.ITALIC, 24));
        //Adding it to JScrollPane
        sp = new JScrollPane(table);
        sp.setPreferredSize(new Dimension(750, 300));
        panelBottom.add(sp);

        //Panel dimensions
        panelTop.setPreferredSize(new Dimension(100, 250));
        panelBottom.setPreferredSize(new Dimension(100, 350));

        pack();
        add(panelTop, BorderLayout.CENTER);
        add(panelBottom, BorderLayout.SOUTH);
        setLocation(500, 150);
//        setVisible(true);
    }
}
