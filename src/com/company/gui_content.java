package com.company;

import javax.swing.*;
import java.awt.*;

public class gui_content {
    gui_content(JFrame frame,Container container) {

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        panel.setBounds(250, 0, 870, 800);
        new heading_jpanel(container);//this is heading
        new search_jpanel(frame,container);
        //new result_display_jpanel(container);

        ImageIcon background_wood=new ImageIcon("images/6_1.jpg");
        JLabel bgImage=new JLabel("",background_wood,JLabel.LEFT);
        bgImage.setBounds(0,0,background_wood.getIconWidth(),background_wood.getIconHeight());
        // bgImage.setFont(font);
        //bgImage.setForeground(red);
        container.add(bgImage);
        System.out.println(background_wood.getIconWidth()+" width:height"+background_wood.getIconHeight());

        panel.add(bgImage);
        container.add(panel);



    }
}
