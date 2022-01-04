package com.company;

import javax.swing.*;
import java.awt.*;

public class result_display_jpanel {
    result_display_jpanel(Container container,JPanel panel)
    {
        //JPanel panel=new JPanel();
        //panel.setBounds(320,250,700,468);
        //panel.setBackground(Color.green);

        ImageIcon background_wood=new ImageIcon("images/wood.jpg");
        JLabel bgImage=new JLabel("",background_wood,JLabel.LEFT);
        bgImage.setBounds(0,0,background_wood.getIconWidth(),background_wood.getIconHeight());
        // bgImage.setFont(font);
        //bgImage.setForeground(red);
        //container.add(bgImage);
        System.out.println(background_wood.getIconWidth()+" width:height"+background_wood.getIconHeight());
        panel.add(bgImage);
        panel.repaint();
        panel.validate();
        //panel.setVisible(true);

        //panel.add(container);
    }
}
