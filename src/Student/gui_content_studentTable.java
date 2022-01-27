package Student;

import com.company.DataBase_Mysql;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.sql.ResultSet;
import java.util.Vector;

public class gui_content_studentTable {
    gui_content_studentTable(Container container,JFrame frame){

        JPanel panel=new JPanel();
        panel.setBounds(200,130,1180,600);
        Color wood=new Color(130, 91, 31);
        panel.setBackground(wood);
//
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAME");
        model.addColumn("CLASS");
        model.addColumn("ROLL");
        model.addColumn("ADDRESS");
        model.addColumn("PARENTS");
        model.addColumn("MOBILE");
        model.addColumn("Student_Occupation");
        model.addColumn("Student_profile");
        try {
            ResultSet rs;
            DataBase_Mysql db = new DataBase_Mysql();
            rs = db.SELECT("SELECT * FROM `Students`");

            int i = 1;
            while (rs.next()) {
                Vector<String> data = new Vector<String>();
                data.add(rs.getString("Student_id"));
                data.add(rs.getString("Student_Name"));
                data.add(rs.getString("Student_Class"));
                data.add(rs.getString("Student_Roll"));
                data.add(rs.getString("Student_Place"));
                data.add(rs.getString("Student_Parents"));
                data.add(rs.getString("Student_Mobile"));
                data.add(rs.getString("Student_Occupation"));
                data.add(rs.getString("Student_profile"));
                model.addRow(data);
                System.out.println(data);
            }

        } catch (Exception e) {
            System.out.println("result display database not found"+e);
        }

        JTable jt = new JTable(model);
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
