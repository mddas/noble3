package Exam;

import com.company.DataBase_Mysql;
import com.company.PrintLibrary;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.*;
import java.sql.Array;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class result_table implements MouseListener {
    JFrame frame;
    JTable jt;
    JPanel panel;
    result_table(Container container, JFrame f,String sql){
        frame=f;
        if (sql==null){
            sql="SELECT * FROM `Student_Result` WHERE year='"+result_search.Year_selected+"' AND Terminal='"+result_search.Terminal_selected+"' AND Student_class='"+result_search.class_selected+"'";

        }
        ArrayList<String> TempColumn=new ArrayList<>(result_search.subjects);

        panel=new JPanel();
        panel.setBounds(200,160,1180,600);
        Color wood=new Color(130, 91, 31);
        panel.setBackground(wood);

        //

        //result_search.subjects
        DefaultTableModel model = new DefaultTableModel();

        TempColumn.add(0,"Roll");
        TempColumn.add(0,"Name");
        TempColumn.add(0,"Class");
        TempColumn.add(0,"Result_Id");

        for (int i=0;i<TempColumn.size();i++){
            model.addColumn(TempColumn.get(i));
        }
        System.out.println(TempColumn.size()+": Size TempColumn");

        try {
            ResultSet rs;
            rs = DataBase_Mysql.SELECT(sql);
            while (rs.next()) {
                Vector<String> rowdata= new Vector<String>();
                HashMap<String, String> dict = new HashMap<String, String>();
                for (int i = 1; i <= 10; i++) {
                    if (! rs.getString("sub_"+i).isEmpty() && rs.getString("sub_"+i)!=null && rs.getString("sub_"+i)!="") {
                        dict.put(rs.getString("sub_" + i), rs.getString("sub_" + i + "_fm"));
                    }
                }
                System.out.println(rs.getString("student_result_id"));
                dict.put("Result_Id",rs.getString("student_result_id"));
                dict.put("Class",rs.getString("Student_class"));
                dict.put("Name",rs.getString("Name"));
                dict.put("Roll",rs.getString("Roll"));
                for (int i=0;i<TempColumn.size();i++){
                    rowdata.add(dict.get(TempColumn.get(i)));
                }
                  System.out.println(rowdata);
                  model.addRow(rowdata);
            }

        } catch (Exception e) {
            System.out.println("result_table error: "+e);
        }

        jt = new JTable(model);

        //
        Font font1=new Font("Arial",Font.PLAIN,16);
        jt.setFont(font1);
        jt.setBounds(10,5,1120,550);
        jt.setForeground(Color.black);
        jt.setRowHeight(45);
        jt.setBackground(Color.cyan);
        JScrollPane sp=new JScrollPane(jt);
        sp.setBounds(45,5,1120,490);
        sp.setBackground(wood);

        JTableHeader tableHeader = jt.getTableHeader();
        tableHeader.setFont(font1);
        tableHeader.setForeground(Color.white);
        tableHeader.setBackground(new Color(13,91,31));
        panel.add(sp);
        panel.setLayout(null);
        container.add(panel);

        jt.addMouseListener(this);

        /*

        try{
            jt.print(JTable.PrintMode.FIT_WIDTH,new MessageFormat("i am header"),new MessageFormat("i am footer"));
        }
        catch (Exception e){
            System.out.println("printing Error "+e);
        }


         */


        //

/*
        Toolkit tkp = panel.getToolkit();
        PrintJob pjp = tkp.getPrintJob(frame, null, null);
        Graphics g = pjp.getGraphics();
        jt.print(g);
        g.dispose();
        pjp.end();

 */
        //

        //
        /* Schedule for the GUI to be created and shown on the EDT */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                /* Don't want bold fonts if we end up using metal */
                UIManager.put("swing.boldMetal", false);
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                }
                new PrintLibrary(model).setVisible(true);
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getButton() == MouseEvent.BUTTON1) {
            //JOptionPane.showMessageDialog(frame,"left click"+jt.getColumnCount());
            int rowN=jt.getSelectedRow();
            JPopupMenu popupmenu = new JPopupMenu("Edit");
            JMenuItem Edit = new JMenuItem("Edit");
            JMenuItem Delete = new JMenuItem("Delete");
            popupmenu.add(Edit); popupmenu.add(Delete);
            jt.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    e = SwingUtilities.convertMouseEvent(
                            e.getComponent(), e, frame);
                    popupmenu.show(frame , e.getX(), e.getY());
                }
            });
            panel.add(popupmenu);
            Edit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame,"Edit click");
                }
            });
            Delete.addActionListener((new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog((Component) null, "Are You Sure?", "alert", JOptionPane.YES_NO_CANCEL_OPTION);
                    System.out.println(result + ":Result");
                    if (result == 0) {
                        System.out.println("Deleted");
                        String id = jt.getValueAt(rowN, 0).toString();
                        String sql = "DELETE FROM Student_Result where student_result_id = '" + id + "'";
                        DataBase_Mysql.Delete(sql);
                    }
                }
            }));
            // for (int i=0;i< jt.getColumnCount();i++){
            //    System.out.println(jt.getValueAt(rowN, i));
            //}

        }
        if(me.getButton() == MouseEvent.BUTTON2) {
            JOptionPane.showMessageDialog(frame,"middle");
        }
        if(me.getButton() == MouseEvent.BUTTON3) {
            JOptionPane.showMessageDialog(frame,"right");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}

