package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class search_jpanel implements ActionListener {
    JButton search_B;
    Container container;
    JFrame frame;
    JPanel panel,panel_display;
    search_jpanel(JFrame f,Container c,JPanel result_panel)
    {
        frame=f;
        panel_display=result_panel;
        container=c;
        panel=new JPanel();
        Color wood=new Color(130, 91, 31);
        panel.setBackground(wood);
        panel.setLayout(null);
        panel.setBounds(460,110,400,80);

        Font font1;
        font1=new Font("Arial",Font.PLAIN,20);

        JTextField serch=new JTextField();
        serch.setBounds(10,3, 270,60);
        serch.setFont(font1);
        panel.add(serch);

        ImageIcon logo=new ImageIcon("images/search.jpg");
        search_B=new JButton(logo);
        search_B.setBounds(310,7, 5,20);
        search_B.setFont(font1);
        search_B.setForeground(Color.RED);
        search_B.setSize(logo.getIconWidth(),logo.getIconHeight());
        panel.add(search_B);
        search_B.addActionListener(this);//this is ActionListener

        container.add(panel);


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==search_B){

            new result_display_jpanel(container,panel_display);


        }
    }
}
