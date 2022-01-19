package Exam;

import com.company.DataBase_Mysql;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class result_table {
    result_table(Container container, JFrame frame){

        JPanel panel=new JPanel();
        panel.setBounds(200,160,1180,600);
        Color wood=new Color(130, 91, 31);
        panel.setBackground(wood);

        //

        //result_search.subjects
        DefaultTableModel model = new DefaultTableModel();
        for (int i=0;i<result_search.subjects.size();i++){
            model.addColumn(result_search.subjects.get(i));
        }
        System.out.println(result_search.subjects);
        model.addRow(new Vector<String>(Collections.singleton("hkkj")));
        model.addRow(new Vector<String>(Collections.singleton("hkkj")));
        model.addRow(new Vector<String>(Collections.singleton("hkkj")));
        model.addRow(new Vector<String>(Collections.singleton("hkkj")));


        try {
            ResultSet rs;
            System.out.println("hiii");
            String sql="SELECT * FROM `Student_Result` WHERE year='"+result_search.Year_selected+"' AND Terminal='"+result_search.Terminal_selected+"' AND Student_class='"+result_search.class_selected+"'";
            rs = DataBase_Mysql.SELECT(sql);

            int i = 1;
            while (rs.next()) {
                //Vector<String> data = new Vector<String>();
                HashMap<String, String> dict = new HashMap<String, String>();
                for (i = 1; i <= 10; i++) {
                    if (! rs.getString("sub_"+i).isEmpty() && rs.getString("sub_"+i)!=null && rs.getString("sub_"+i)!="") {
                        dict.put(rs.getString("sub_" + i), rs.getString("sub_" + i + "_fm"));
                    }
                }
                //model.addRow(data);

                System.out.println("this is dict"+dict);
            }

        } catch (Exception e) {
            System.out.println("result display database not found"+e);
        }

        JTable jt = new JTable(model);

        //
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
