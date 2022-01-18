package Exam;

import com.company.DataBase_Mysql;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddResult implements ActionListener {
    Container container;
    JFrame frame;
    JButton submit;
    JLabel subject_L,fullMark_L;


    JTextField subject_1_jt,subject_2_jt,subject_3_jt,subject_4_jt;
    JTextField subject_5_jt,subject_6_jt,subject_7_jt,subject_8_jt,subject_9_jt,subject_10_jt;
    JTextField subject_1_fm_jt,subject_2_fm_jt,subject_3_fm_jt,subject_4_fm_jt,subject_5_fm_jt;
    JTextField subject_6_fm_jt,subject_7_fm_jt,subject_8_fm_jt,subject_9_fm_jt,subject_10_fm_jt;
    JTextField nameResult,rollResult,Class_jt;

    JLabel class_L,subject_1_L,subject_2_L,subject_3_L,subject_4_L,subject_5_L,subject_6_L,subject_7_L,subject_8_L,subject_9_L,subject_10_L;
    AddResult(Container c, JFrame f){
        container=c;
        frame=f;

        Color color=new Color(13,91,31);

        Font font=new Font("Arial",Font.PLAIN,16);
        JPanel panel=new JPanel();
        panel.setBackground(color);
        panel.setBounds(400,250,880,450);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.insets = new Insets(10,10,2,20);//top,left,bottm,right

        constraints.ipady = 20;
        constraints.ipadx = 100;
        constraints.gridx = 0;constraints.gridy = 0;
        Class_jt=new JTextField();
        Class_jt.setFont(font);
        panel.add(Class_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 1;constraints.gridy = 0;
        nameResult=new JTextField();
        nameResult.setFont(font);
        panel.add(nameResult,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 50;
        constraints.gridx = 2;constraints.gridy = 0;
        rollResult=new JTextField();
        rollResult.setFont(font);
        panel.add(rollResult,constraints);



        constraints.ipady = 20;
        constraints.ipadx = 20;
        constraints.gridx = 0;constraints.gridy = 1;
        subject_L=new JLabel("Subject");
        subject_L.setFont(font);
        subject_L.setForeground(color.white);
        panel.add(subject_L,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 20;
        constraints.gridx = 1;constraints.gridy = 1;
        fullMark_L=new JLabel("Full mark");
        fullMark_L.setFont(font);
        fullMark_L.setForeground(Color.white);
        panel.add(fullMark_L,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 20;
        constraints.gridx = 2;constraints.gridy = 1;
        subject_L=new JLabel("Subject");
        subject_L.setFont(font);
        subject_L.setForeground(Color.white);
        panel.add(subject_L,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 20;
        constraints.gridx = 3;constraints.gridy = 1;
        fullMark_L=new JLabel("Full mark");
        fullMark_L.setFont(font);
        fullMark_L.setForeground(Color.white);
        panel.add(fullMark_L,constraints);


        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 2;
        subject_1_jt=new JTextField();
        subject_1_jt.setFont(font);
        panel.add(subject_1_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 2;
        subject_1_fm_jt=new JTextField();
        subject_1_fm_jt.setFont(font);
        panel.add(subject_1_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 2;
        subject_2_jt=new JTextField();
        subject_2_jt.setFont(font);
        panel.add(subject_2_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 2;
        subject_2_fm_jt=new JTextField();
        subject_2_fm_jt.setFont(font);
        panel.add(subject_2_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 3;
        subject_3_jt=new JTextField();
        subject_3_jt.setFont(font);
        panel.add(subject_3_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 3;
        subject_3_fm_jt=new JTextField();
        subject_3_fm_jt.setFont(font);
        panel.add(subject_3_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 3;
        subject_4_jt=new JTextField();
        subject_4_jt.setFont(font);
        panel.add(subject_4_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 3;
        subject_4_fm_jt=new JTextField();
        subject_4_fm_jt.setFont(font);
        panel.add(subject_4_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 4;
        subject_5_jt=new JTextField();
        subject_5_jt.setFont(font);
        panel.add(subject_5_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 4;
        subject_5_fm_jt=new JTextField();
        subject_5_fm_jt.setFont(font);
        panel.add(subject_5_fm_jt,constraints);

        //here
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 4;
        subject_6_jt=new JTextField();
        subject_6_jt.setFont(font);
        panel.add(subject_6_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 4;
        subject_6_fm_jt=new JTextField();
        subject_6_fm_jt.setFont(font);
        panel.add(subject_6_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 5;
        subject_7_jt=new JTextField();
        subject_7_jt.setFont(font);
        panel.add(subject_7_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 5;
        subject_7_fm_jt=new JTextField();
        subject_7_fm_jt.setFont(font);
        panel.add(subject_7_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 5;
        subject_8_jt=new JTextField();
        subject_8_jt.setFont(font);
        panel.add(subject_8_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 5;
        subject_8_fm_jt=new JTextField();
        subject_8_fm_jt.setFont(font);
        panel.add(subject_8_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 0;constraints.gridy = 6;
        subject_9_jt=new JTextField();
        subject_9_jt.setFont(font);
        panel.add(subject_9_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 1;constraints.gridy = 6;
        subject_9_fm_jt=new JTextField();
        subject_9_fm_jt.setFont(font);
        panel.add(subject_9_fm_jt,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 2;constraints.gridy = 6;
        subject_10_jt=new JTextField();
        subject_10_jt.setFont(font);
        panel.add(subject_10_jt,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 80;
        constraints.gridx = 3;constraints.gridy = 6;
        subject_10_fm_jt=new JTextField();
        subject_10_fm_jt.setFont(font);
        panel.add(subject_10_fm_jt,constraints);



        constraints.gridx=1;constraints.gridy=7;
        submit=new JButton("Submit");
        submit.setForeground(Color.white);
        submit.setBackground(Color.blue);
        panel.add(submit,constraints);

        //container.add(panel0);
        //container.add(panel);

        System.out.println(result_search.subjects);

        JPopupMenu popupmenu = new JPopupMenu("Edit");
        popupmenu.add(panel);
        popupmenu.show(container,400,250);

        submit.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            String Student_Class=Class_jt.getText();
            String Name=nameResult.getText();
            int Roll=Integer.parseInt(rollResult.getText());


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
            //JOptionPane.showMessageDialog(container, Classp);

            String sql="INSERT INTO `Student_Result`(`Student_class`, `Name`, `Roll`, `sub_1`, `sub_1_fm`, `sub_2`, `sub_2_fm`, `sub_3`, `sub_3_fm`, `sub_4`, `sub_4_fm`, `sub_5`, `sub_5_fm`, `sub_6`, `sub_6_fm`, `sub_7`, `sub_7_fm`, `sub_8`, `sub_8_fm`, `sub_9`, `sub_9_fm`, `sub_10`, `sub_10_fm`) VALUES ('"+Student_Class+"','"+Name+"','"+Roll+"','"+sub_1+"','"+sub_1_fm+"','"+sub_2+"','"+sub_2_fm+"','"+sub_3+"','"+sub_3_fm+"','"+sub_4+"','"+sub_4_fm+"','"+sub_5+"','"+sub_5_fm+"','"+sub_6+"','"+sub_6_fm+"','"+sub_7+"','"+sub_7_fm+"','"+sub_8+"','"+sub_8_fm+"','"+sub_9+"','"+sub_9_fm+"','"+sub_10+"','"+sub_10_fm+"')";
            DataBase_Mysql.Insert(sql);

        }
    }
}

