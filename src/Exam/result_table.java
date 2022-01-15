package Exam;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class result_table {
    result_table(Container container, JFrame frame){

        JPanel panel=new JPanel();
        panel.setBounds(200,160,1180,600);
        Color wood=new Color(130, 91, 31);
        panel.setBackground(wood);


        String data[][]={ {"101","Amit","670000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"102","Jai","780000","9","13","JANAKPUR","SANAM","9808059156","UPDATE","DELETE"},
                {"101","Sachin","700000","9","13","JANAKPUR","SANAM","9808059156","RS 5000","UPDATE","DELETE"}};
        String column[]={"ID","NAME","CLASS","ROLL","Age","ADDRESS","PARENTS","MOBILE","UPDATE","DELETE"};
        JTable jt=new JTable(data,column);
        Font font1=new Font("Arial",Font.PLAIN,16);
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
