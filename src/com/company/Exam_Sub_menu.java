package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Exam_Sub_menu implements ActionListener {
    JFrame frame;
    JButton profile_B,student_B,staff_B,exam_B,result_B,bill_B,ExamManageB,AddSubjectB,AddExamB,SheatplanB;
    Container container;
    Exam_Sub_menu(JFrame f,Container c){
        frame=f;
        container=c;
        JPanel panel=new JPanel();
        Color wood=new Color(39, 40, 34);//new Color(13, 91, 31);
        panel.setBackground(wood);
        panel.setBounds(0,0,230,800);
        panel.setLayout(null);

        //
        Color white,red;
        red=new Color(255,0,0);
        white=new Color(234,234,234);

        Font font,font1;
        font=new Font("Arial",Font.BOLD,20);
        font1=new Font("Arial",Font.BOLD,20);
        ImageIcon homeLogo,studentsLogo,staffLogo,examLogo,resultLogo,billLogo,bgImage1,AdminLogo;
        homeLogo= new ImageIcon("images/home.png");
        AdminLogo=new ImageIcon("images/teacherLogo_1.png");
        studentsLogo= new ImageIcon("images/studentsLogo_2.jpg");
        staffLogo= new ImageIcon("images/teacherLogo_1.png");
        examLogo= new ImageIcon("images/ExamLogo_1.png");
        resultLogo= new ImageIcon("images/ResultLogo64.jpg");
        billLogo= new ImageIcon("images/BillLogo_2.png");
        bgImage1=new ImageIcon("images/6_1.jpg");

        ImageIcon newadmisson=new ImageIcon("images/newadmisson.png");
        ImageIcon ExamManageLogo=new ImageIcon("images/examManage.png");
        ImageIcon sheat_generateLogo=new ImageIcon("images/sheatPlan.jpg");
        ImageIcon ResultLogo=new ImageIcon("images/ResultLogo64.jpg");

        JLabel bgimage1_L;
        JLabel profile_L_text,ExamManageL,exam_L_text,AddExamL,AddSubjectL,result_L_text,SheatplanL;


        bgimage1_L=new JLabel("Student Management",bgImage1,JLabel.LEFT);


        profile_L_text=new JLabel("Home");
        profile_L_text.setBounds(112,-20,300,200);
        profile_L_text.setFont(font1);
        profile_L_text.setForeground(white);
        //panel.add(profile_L_text);
        profile_B=new JButton(homeLogo);
        profile_B.setBounds(30,15,300,200);
        profile_B.setFont(font1);
        profile_B.setForeground(red);
        profile_B.setSize(homeLogo.getIconWidth()+60,homeLogo.getIconHeight());
        panel.add(profile_B);

        exam_L_text=new JLabel("Exam");
        exam_L_text.setBounds(112,87,300,200);
        exam_L_text.setFont(font1);
        exam_L_text.setForeground(white);
        panel.add(exam_L_text);
        exam_B=new JButton(examLogo);
        exam_B.setBounds(10,130,300,200);
        exam_B.setFont(font1);
        exam_B.setForeground(red);
        exam_B.setSize(ExamManageLogo.getIconWidth(),ExamManageLogo.getIconHeight());
        panel.add(exam_B);

        result_L_text=new JLabel("Result");
        result_L_text.setBounds(112,195,300,200);
        result_L_text.setFont(font1);
        result_L_text.setForeground(white);
        panel.add(result_L_text);
        result_B=new JButton(resultLogo);
        result_B.setBounds(10,238,300,200);
        result_B.setFont(font1);
        result_B.setForeground(red);
        result_B.setSize(ExamManageLogo.getIconWidth(),ExamManageLogo.getIconHeight()+10);
        panel.add(result_B);



        ExamManageL=new JLabel("Exam Manage");
        ExamManageL.setBounds(112,280,300,200);
        ExamManageL.setFont(font1);
        ExamManageL.setForeground(white);
        panel.add(ExamManageL);
        ExamManageB=new JButton(ExamManageLogo);
        ExamManageB.setBounds(10,345,300,200);
        ExamManageB.setFont(font1);
        ExamManageB.setForeground(red);
        ExamManageB.setSize(ExamManageLogo.getIconWidth(),ExamManageLogo.getIconHeight());
        panel.add(ExamManageB);

        System.out.println(ExamManageLogo.getIconWidth()+"::"+ExamManageLogo.getIconHeight());

        AddExamL=new JLabel("Add Exam");
        AddExamL.setBounds(112,395,300,200);
        AddExamL.setFont(font1);
        AddExamL.setForeground(white);
        panel.add(AddExamL);
        AddExamB=new JButton(newadmisson);
        AddExamB.setBounds(10,435,300,200);
        AddExamB.setFont(font1);
        AddExamB.setForeground(red);
        AddExamB.setSize(ExamManageLogo.getIconWidth(),ExamManageLogo.getIconHeight());
        panel.add(AddExamB);

        AddSubjectL=new JLabel("Add subject");
        AddSubjectL.setBounds(112,515,500,500);
        AddSubjectL.setFont(font1);
        AddSubjectL.setForeground(white);
        panel.add(AddSubjectL);
        AddSubjectB=new JButton(newadmisson);
        AddSubjectB.setBounds(10,510,550,500);
        AddSubjectB.setFont(font1);
        AddSubjectB.setForeground(red);
        AddSubjectB.setSize(ExamManageLogo.getIconWidth(),ExamManageLogo.getIconHeight());
        panel.add(AddSubjectB);

        SheatplanL=new JLabel("Sheat generate");
        SheatplanL.setBounds(112,560,500,500);
        SheatplanL.setFont(font1);
        SheatplanL.setForeground(white);
        panel.add(SheatplanL);
        SheatplanB=new JButton(sheat_generateLogo);
        SheatplanB.setBounds(10,580,550,500);
        SheatplanB.setFont(font1);
        SheatplanB.setForeground(red);
        SheatplanB.setSize(ExamManageLogo.getIconWidth(),ExamManageLogo.getIconHeight());
        panel.add(SheatplanB);


        container.add(panel);
        container.repaint();
        container.validate();

        profile_B.addActionListener(this);//this is ActionListener
        student_B.addActionListener(this);
        staff_B.addActionListener(this);
        exam_B.addActionListener(this);
        result_B.addActionListener(this);
        bill_B.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==profile_B){
            JOptionPane.showMessageDialog(container,"profile_B");
            container.removeAll();

            new gui_left(frame,container);
            new gui_content_home(frame,container);
            new gui_right(frame,container);
            container.repaint();
            container.validate();

        }
        else if(e.getSource()==student_B) {
            //JOptionPane.showMessageDialog(container,"student_B");
            container.removeAll();

            new gui_left(frame,container);
            new gui_content_student(frame,container);
            container.repaint();
            container.validate();
        }
        if(e.getSource()==staff_B){
            JOptionPane.showMessageDialog(container,"staff_B");
            container.removeAll();

            new gui_left(frame,container);
            container.repaint();
            container.validate();
        }
        else if(e.getSource()==exam_B) {
            //JOptionPane.showMessageDialog(container,"exam_B");
            container.removeAll();

            new Exam_Sub_menu(frame,container);
            //new gui_content_exam(frame,container);
            container.repaint();
            container.validate();
        }
        if(e.getSource()==result_B){
            JOptionPane.showMessageDialog(container,"result_B");
            container.removeAll();

            new gui_left(frame,container);
            container.repaint();
            container.validate();
        }
        else if(e.getSource()==bill_B) {
            JOptionPane.showMessageDialog(container,"bill_B");
            container.removeAll();

            new gui_left(frame,container);
            container.repaint();
            container.validate();
        }
    }
}


