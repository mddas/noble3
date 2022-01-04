package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class gui_left implements ActionListener {
    JFrame frame;
    JButton profile_B,student_B,staff_B,exam_B,result_B,bill_B;
    Container container;
    gui_left(JFrame f,Container c){
        frame=f;
        container=c;
        JPanel panel=new JPanel();
        Color wood=new Color(13, 91, 31);
        panel.setBackground(wood);
        panel.setBounds(0,0,230,800);
        container.add(panel);

        //
        Color white,red;
        red=new Color(255,0,0);
        white=new Color(234,234,234);

        Font font,font1;
        font=new Font("Arial",Font.BOLD,20);
        font1=new Font("Arial",Font.BOLD,20);
        ImageIcon studentsLogo,staffLogo,examLogo,resultLogo,billLogo,bgImage1,AdminLogo;
        AdminLogo=new ImageIcon("images/teacherLogo_1.png");
        studentsLogo= new ImageIcon("images/studentsLogo_2.jpg");
        staffLogo= new ImageIcon("images/teacherLogo_1.png");
        examLogo= new ImageIcon("images/ExamLogo_1.png");
        resultLogo= new ImageIcon("images/ResultLogo_1.jpg");
        billLogo= new ImageIcon("images/BillLogo_2.png");
        bgImage1=new ImageIcon("images/6_1.jpg");

        JLabel bgimage1_L;
        JLabel profile_L_text,student_L_text,staff_L_text,exam_L_text,result_L_text,bill_L_text;


        bgimage1_L=new JLabel("Student Management",bgImage1,JLabel.LEFT);


        profile_L_text=new JLabel("Profile");
        profile_L_text.setBounds(112,-20,300,200);
        profile_L_text.setFont(font1);
        profile_L_text.setForeground(white);
        panel.add(profile_L_text);
        profile_B=new JButton(AdminLogo);
        profile_B.setBounds(10,15,300,200);
        profile_B.setFont(font1);
        profile_B.setForeground(red);
        profile_B.setSize(AdminLogo.getIconWidth(),AdminLogo.getIconHeight());
        panel.add(profile_B);


        student_L_text=new JLabel("student");
        student_L_text.setBounds(112,87,300,200);
        student_L_text.setFont(font1);
        student_L_text.setForeground(white);
        panel.add(student_L_text);
        student_B=new JButton(studentsLogo);
        student_B.setBounds(10,130,300,200);
        student_B.setFont(font1);
        student_B.setForeground(red);
        student_B.setSize(studentsLogo.getIconWidth(),studentsLogo.getIconHeight());
        panel.add(student_B);



        bill_L_text=new JLabel("Bill");
        bill_L_text.setBounds(112,195,300,200);
        bill_L_text.setFont(font1);
        bill_L_text.setForeground(white);
        panel.add(bill_L_text);
        bill_B=new JButton(billLogo);
        bill_B.setBounds(10,238,300,200);
        bill_B.setFont(font1);
        bill_B.setForeground(red);
        bill_B.setSize(billLogo.getIconWidth(),billLogo.getIconHeight());
        panel.add(bill_B);

        staff_L_text=new JLabel("Staff");
        staff_L_text.setBounds(112,305,300,200);
        staff_L_text.setFont(font1);
        staff_L_text.setForeground(white);
        panel.add(staff_L_text);
        staff_B=new JButton(staffLogo);
        staff_B.setBounds(10,345,300,200);
        staff_B.setFont(font1);
        staff_B.setForeground(red);
        staff_B.setSize(staffLogo.getIconWidth(),staffLogo.getIconHeight());
        panel.add(staff_B);

        exam_L_text=new JLabel("Exam");
        exam_L_text.setBounds(112,407,300,200);
        exam_L_text.setFont(font1);
        exam_L_text.setForeground(white);
        panel.add(exam_L_text);
        exam_B=new JButton(examLogo);
        exam_B.setBounds(10,460,300,200);
        exam_B.setFont(font1);
        exam_B.setForeground(red);
        exam_B.setSize(examLogo.getIconWidth(),examLogo.getIconHeight());
        panel.add(exam_B);

        result_L_text=new JLabel("Result");
        result_L_text.setBounds(112,370,500,500);
        result_L_text.setFont(font1);
        result_L_text.setForeground(white);
        panel.add(result_L_text);
        result_B=new JButton(resultLogo);
        result_B.setBounds(10,570,550,500);
        result_B.setFont(font1);
        result_B.setForeground(red);
        result_B.setSize(resultLogo.getIconWidth(),resultLogo.getIconHeight());
        panel.add(result_B);

        bgimage1_L.setBounds(0,0,bgImage1.getIconWidth(),bgImage1.getIconHeight());
        bgimage1_L.setFont(font);
        bgimage1_L.setForeground(red);
        // f.add(bgimage1_L);

        profile_B.addActionListener(this);//this is ActionListener
        student_B.addActionListener(this);
        staff_B.addActionListener(this);
        exam_B.addActionListener(this);
        result_B.addActionListener(this);
        bill_B.addActionListener(this);
        panel.setLayout(null);
        container.add(panel);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==profile_B){
            JOptionPane.showMessageDialog(container,"profile_B");
        }
        else if(e.getSource()==student_B) {
            JOptionPane.showMessageDialog(container,"student_B");
        }
        if(e.getSource()==staff_B){
            JOptionPane.showMessageDialog(container,"staff_B");
        }
        else if(e.getSource()==exam_B) {
            JOptionPane.showMessageDialog(container,"exam_B");
        }
        if(e.getSource()==result_B){
            JOptionPane.showMessageDialog(container,"result_B");
        }
        else if(e.getSource()==bill_B) {
            JOptionPane.showMessageDialog(container,"bill_B");
        }
    }
    }

