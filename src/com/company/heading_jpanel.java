package com.company;

import javax.swing.*;
import java.awt.*;

public class heading_jpanel {
    heading_jpanel(Container container){
        JPanel panel=new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(350,5,550,90);
        container.add(panel);
        ImageIcon logo=new ImageIcon("images/noble3.png");
        //header=new JLabel("Noble Secondary English Boarding School",icon,JLabel.RIGHT);
        JLabel txt=new JLabel("Noble Secondary boardidng school",logo,JLabel.LEFT);
        txt.setForeground(Color.white);
        panel.add(txt);
        container.add(panel);
    }
}
