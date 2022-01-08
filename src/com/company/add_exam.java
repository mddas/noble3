package com.company;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class add_exam {
    Container container=new Container();
    JFrame frame=new JFrame();
    add_exam(Container c, JFrame f){
        container=c;
        frame=f;
        JPanel panel=new JPanel();
        panel.setBounds(200,160,1180,600);
        Color wood=new Color(130, 91, 31);
        panel.setBackground(wood);


        String data[][]={ {"101","2078","First","Mathematics-100","Science-75","Social studies 80","Mathematics-100","Mathematics-100","Mathematics-100","Mathematics-100","Mathematics-100","Mathematics-100","Mathematics-100"},
                {"101","2078","First","1","2","3","4","5","6","7","8","9","10"},
                {"101","kl","","Sachin","700000","9","13","JANAKPUR","SANAM","9808059156","RS 5000","UPDATE","DELETE"}};
        String column[]={"Exam-ID","Year","Terminal","sub-1","sub-2","ub-3","sub-4","sub-5","sub-6","sub-7","sub-8","sub-9","sub-10"};
        JTable jt=new JTable(data,column);
        Font font1=new Font("Arial",Font.PLAIN,14);
        jt.setFont(font1);
        jt.setBounds(10,5,1120,550);
        jt.setForeground(Color.black);
        jt.setRowHeight(45);
        jt.setBackground(Color.cyan);
        JScrollPane sp=new JScrollPane(jt);
        sp.setBounds(45,5,1120,550);
        sp.setBackground(wood);

        JTableHeader tableHeader = jt.getTableHeader();
        tableHeader.setFont(font1);
        tableHeader.setForeground(Color.white);


        tableHeader.setBackground(new Color(13,91,31));
        panel.add(sp);
        panel.setLayout(null);
        container.add(panel);


    }
}
