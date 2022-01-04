package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class search_jpanel implements ActionListener {
    JButton search_B;
    Container container;
JFrame frame;
    JPanel panel;
    search_jpanel(JFrame f,Container c)
    {
        frame=f;

        container=c;
        panel=new JPanel();
        panel.setBackground(Color.blue);
        panel.setLayout(null);
        panel.setBounds(360,130,400,80);

        Font font1;
        font1=new Font("Arial",Font.PLAIN,20);

        JTextField serch=new JTextField();
        serch.setBounds(10,3, 270,60);
        serch.setFont(font1);
        panel.add(serch);

        ImageIcon logo=new ImageIcon("images/search.jpg");
        search_B=new JButton(logo);
        search_B.setBounds(320,5, 5,20);
        search_B.setFont(font1);
        search_B.setForeground(Color.RED);
        search_B.setSize(logo.getIconWidth(),logo.getIconHeight());
        panel.add(search_B);
        search_B.addActionListener(this);//this is ActionListener

        container.add(panel);


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==search_B){
            /*
            ImageIcon background_wood=new ImageIcon("images/wood.jpg");
            JLabel bgImage=new JLabel("",background_wood,JLabel.LEFT);
            bgImage.setBounds(0,0,background_wood.getIconWidth(),background_wood.getIconHeight());
            // bgImage.setFont(font);
            //bgImage.setForeground(red);
            //container.add(bgImage);
            System.out.println(background_wood.getIconWidth()+" width:height"+background_wood.getIconHeight());
            panel.add(bgImage);
            panel.setVisible(true);
            panel.validate();
            JOptionPane.showMessageDialog(container,"Searched");

*/
            new result_display_jpanel(container,panel);


        }
    }
}
