package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class result_display_jpanel {
    String names;
    result_display_jpanel(Container container,JPanel panel)
    {

       panel.setLayout(null);

        Color wood=new Color(130, 91, 31);
        Font font;
        font=new Font("Arial",Font.PLAIN,20);
        String names="";
        try {
            ResultSet rs;
            System.out.println("hiii");
            //DataBase_Mysql db = new DataBase_Mysql();
            rs = DataBase_Mysql.SELECT("SELECT * FROM `Students`");

            while (rs.next()){
                names=rs.getString("Student_Name")+"<br>"+names+"";
            }

        }
        catch (Exception e){
            System.out.println(e);
        }

        names="<center><h1>"+names+"</h1></center>";
        JEditorPane editorPane = new JEditorPane();
        //editorPane.setBounds(0,10,50,10);
        editorPane.setBackground(wood);
        editorPane.setContentType("text/html");
        editorPane.setText(names);
        //panel.add(editorPane);

        JScrollPane scrollableTextArea = new JScrollPane(editorPane);
        //scrollableTextArea.setForeground(Color.red);
        scrollableTextArea.setBounds(-2,-2,750,500);


        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(scrollableTextArea);

        /*
        JTextArea textArea = new JTextArea(20,20);
        textArea.setText("how re you");
        textArea.setFont(font);
        textArea.setEditable(false);
        textArea.setForeground(Color.white);
        textArea.setBackground(wood);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);
        scrollableTextArea.setForeground(Color.red);
        scrollableTextArea.setBackground(Color.red);
        scrollableTextArea.setBounds(100,30,300,200);

        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(scrollableTextArea);

         */





        //panel.repaint();
       // panel.validate();
        panel.setVisible(true);


    }
}
