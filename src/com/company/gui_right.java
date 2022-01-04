package com.company;

import javax.swing.*;
import java.awt.*;

public class gui_right {
gui_right(JFrame frame,Container container){
    JPanel panel=new JPanel();
    panel.setBackground(Color.blue);
    panel.setBounds(1150,0,250,900);
    container.add(panel);

    JLabel total,newAdmisson,studentleftSchool,Income,MoneySpend;
    ImageIcon TotalLOgo = new ImageIcon("images/circle.jpg");

    total = new JLabel(TotalLOgo);
    total.setBounds(1000, 70, 200, 200);
    total.setForeground(Color.white);
    panel.add(total);

    newAdmisson = new JLabel(TotalLOgo);
    newAdmisson.setBounds(1180, 70, 200, 200);
    newAdmisson.setForeground(Color.white);
    panel.add(newAdmisson);

    studentleftSchool = new JLabel(TotalLOgo);
    studentleftSchool.setBounds(1080, 250, 200, 200);
    studentleftSchool.setForeground(Color.white);
    panel.add(studentleftSchool);

    Income = new JLabel(TotalLOgo);
    Income.setBounds(1000, 430, 200, 200);
    Income.setForeground(Color.white);
    panel.add(Income);

    container.add(panel);
}
}
