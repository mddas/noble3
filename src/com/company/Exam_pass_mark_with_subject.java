package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam_pass_mark_with_subject implements ActionListener {
    Container container;
    JFrame frame;
    JButton submit;

    JTextField class_jt,subject_1_jt,subject_2_jt,subject_3_jt,subject_4_jt;
    JTextField subject_5_jt,subject_6_jt,subject_7_jt,subject_8_jt,subject_9_jt,subject_10_jt;
    JTextField subject_1_fm_jt,subject_2_fm_jt,subject_3_fm_jt,subject_4_fm_jt,subject_5_fm_jt;
    JTextField subject_6_fm_jt,subject_7_fm_jt,subject_8_fm_jt,subject_9_fm_jt,subject_10_fm_jt;
    JTextField year,terminal;

    JLabel class_L,subject_1_L,subject_2_L,subject_3_L,subject_4_L,subject_5_L,subject_6_L,subject_7_L,subject_8_L,subject_9_L,subject_10_L;
    Exam_pass_mark_with_subject(Container c, JFrame f){
        container=c;
        frame=f;

        Font font=new Font("Arial",Font.PLAIN,16);
        JPanel panel=new JPanel();
        Color color=new Color(13,91,31);
        panel.setBackground(color);
        panel.setBounds(450,50,900,450);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.insets = new Insets(10,2,2,20);//top,left,bottm,right

        constraints.ipady = 20;
        constraints.ipadx = 100;
        constraints.gridx = 0;constraints.gridy = 0;
        year=new JTextField();
        year.setFont(font);
        panel.add(year,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 100;
        constraints.gridx = 1;constraints.gridy = 0;
        terminal=new JTextField();
        terminal.setFont(font);
        panel.add(terminal,constraints);

        constraints.ipady = 0;
        constraints.ipadx = 0;
        constraints.gridx = 2;constraints.gridy = 0;
        class_L=new JLabel("Class");
        class_L.setForeground(Color.white);
        panel.add(class_L,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 3;constraints.gridy = 0;
        class_jt=new JTextField();
        class_jt.setFont(font);
        panel.add(class_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 1;
        subject_1_jt=new JTextField();
        subject_1_jt.setFont(font);
        panel.add(subject_1_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 1;
        subject_1_fm_jt=new JTextField();
        subject_1_fm_jt.setFont(font);
        panel.add(subject_1_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 1;
        subject_2_jt=new JTextField();
        subject_2_jt.setFont(font);
        panel.add(subject_2_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 1;
        subject_2_fm_jt=new JTextField();
        subject_2_fm_jt.setFont(font);
        panel.add(subject_2_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 2;
        subject_3_jt=new JTextField();
        subject_3_jt.setFont(font);
        panel.add(subject_3_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 2;
        subject_3_fm_jt=new JTextField();
        subject_3_fm_jt.setFont(font);
        panel.add(subject_3_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 2;
        subject_4_jt=new JTextField();
        subject_4_jt.setFont(font);
        panel.add(subject_4_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 2;
        subject_4_fm_jt=new JTextField();
        subject_4_fm_jt.setFont(font);
        panel.add(subject_4_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 3;
        subject_5_jt=new JTextField();
        subject_5_jt.setFont(font);
        panel.add(subject_5_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 3;
        subject_5_fm_jt=new JTextField();
        subject_5_fm_jt.setFont(font);
        panel.add(subject_5_fm_jt,constraints);

        //here
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 3;
        subject_6_jt=new JTextField();
        subject_6_jt.setFont(font);
        panel.add(subject_6_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 3;
        subject_6_fm_jt=new JTextField();
        subject_6_fm_jt.setFont(font);
        panel.add(subject_6_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 4;
        subject_7_jt=new JTextField();
        subject_7_jt.setFont(font);
        panel.add(subject_7_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 4;
        subject_7_fm_jt=new JTextField();
        subject_7_fm_jt.setFont(font);
        panel.add(subject_7_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 4;
        subject_8_jt=new JTextField();
        subject_8_jt.setFont(font);
        panel.add(subject_8_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 4;
        subject_8_fm_jt=new JTextField();
        subject_8_fm_jt.setFont(font);
        panel.add(subject_8_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 5;
        subject_9_jt=new JTextField();
        subject_9_jt.setFont(font);
        panel.add(subject_9_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 5;
        subject_9_fm_jt=new JTextField();
        subject_9_fm_jt.setFont(font);
        panel.add(subject_9_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 5;
        subject_10_jt=new JTextField();
        subject_10_jt.setFont(font);
        panel.add(subject_10_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 5;
        subject_10_fm_jt=new JTextField();
        subject_10_fm_jt.setFont(font);
        panel.add(subject_10_fm_jt,constraints);



        constraints.gridx=1;constraints.gridy=6;
        submit=new JButton("Submit");
        submit.setForeground(Color.white);
        submit.setBackground(Color.blue);
        panel.add(submit,constraints);

        container.add(panel);

        submit.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            String which_year = year.getText();

            String which_terminal = terminal.getText();

            String Classp = class_jt.getText();

            String sub_1 = subject_1_jt.getText();
            int sub_1_fm=0;
            if (subject_1_fm_jt.getText().isEmpty()==false){
                sub_1_fm=Integer.parseInt(subject_1_fm_jt.getText());
            }

            String sub_2 = subject_2_jt.getText();
            int sub_2_fm=0;
            if (subject_2_fm_jt.getText().isEmpty()==false){
                sub_2_fm=Integer.parseInt(subject_2_fm_jt.getText());
            }

            String sub_3 = subject_3_jt.getText();
            int sub_3_fm=0;
            if (subject_3_fm_jt.getText().isEmpty()==false){
                sub_3_fm=Integer.parseInt(subject_3_fm_jt.getText());
            }

            String sub_4 = subject_4_jt.getText();
            int sub_4_fm=0;
            if (subject_4_fm_jt.getText().isEmpty()==false){
                sub_4_fm=Integer.parseInt(subject_4_fm_jt.getText());
            }

            String sub_5 = subject_5_jt.getText();
            int sub_5_fm=0;
            if (subject_5_fm_jt.getText().isEmpty()==false){
                sub_5_fm=Integer.parseInt(subject_5_fm_jt.getText());
            }

            String sub_6 = subject_6_jt.getText();
            int sub_6_fm=0;
            if (subject_6_fm_jt.getText().isEmpty()==false){
                sub_6_fm=Integer.parseInt(subject_6_fm_jt.getText());
            }

            String sub_7 = subject_7_jt.getText();
            int sub_7_fm=0;
            if (subject_7_fm_jt.getText().isEmpty()==false){
                sub_7_fm=Integer.parseInt(subject_7_fm_jt.getText());
            }

            String sub_8 = subject_8_jt.getText();
            int sub_8_fm=0;
            if (subject_8_fm_jt.getText().isEmpty()==false){
                sub_8_fm=Integer.parseInt(subject_8_fm_jt.getText());
            }

            String sub_9 = subject_9_jt.getText();
            int sub_9_fm=0;
            if (subject_9_fm_jt.getText().isEmpty()==false){
                sub_9_fm=Integer.parseInt(subject_9_fm_jt.getText());
            }

            String sub_10 = subject_10_jt.getText();
            int sub_10_fm=0;
            if (subject_10_fm_jt.getText().isEmpty()==false){
                sub_10_fm=Integer.parseInt(subject_10_fm_jt.getText());
            }

            DataBase_Mysql db = new DataBase_Mysql();


            //JOptionPane.showMessageDialog(container, Classp);
           // String sql = "INSERT INTO `class_subject`(`ClassName`, `sub_1`, `sub_2`, `sub_3`, `sub_4`, `sub_5`, `sub_6`, `sub_7`, `sub_8`, `sub_9`, `sub_10`) VALUES ('" + Classp + "','" + sub_1 + "','" + sub_2 + "','" + sub_3 + "','" + sub_4 + "','" + sub_5 + "','" + sub_6 + "','" + sub_7 + "','" + sub_8 + "','" + sub_9 + "','" + sub_10 + "')";
            String sql="INSERT INTO `full_marks`(`year`, `Terminal`, `ClassName`, `sub_1`, `sub_1_fm`, `sub_2`, `sub_2_fm`, `sub_3`, `sub_3_fm`, `sub_4`, `sub_4_fm`, `sub_5`, `sub_5_fm`, `sub_6`, `sub_6_fm`, `sub_7`, `sub_7_fm`, `sub_8`, `sub_8_fm`, `sub_9`, `sub_9_fm`, `sub_10`, `sub_10_fm`) VALUES ('"+which_year+"','"+which_terminal+"','"+Classp+"','"+sub_1+"','"+sub_1_fm+"','"+sub_2+"','"+sub_2_fm+"','"+sub_3+"','"+sub_3_fm+"','"+sub_4+"','"+sub_4_fm+"','"+sub_5+"','"+sub_5_fm+"','"+sub_6+"','"+sub_6_fm+"','"+sub_7+"','"+sub_7_fm+"','"+sub_8+"','"+sub_8_fm+"','"+sub_9+"','"+sub_9_fm+"','"+sub_10+"','"+sub_10_fm+"')";
            db.Insert(sql);


        }
    }
}
