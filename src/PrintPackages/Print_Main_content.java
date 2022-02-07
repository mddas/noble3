package PrintPackages;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.MessageFormat;

public class Print_Main_content {
    public DefaultTableModel modelMarksheet;
    private int option;

    public Print_Main_content(DefaultTableModel model, int option) {
        modelMarksheet=model;
        System.out.println("this is print_main_content option is :"+option);
        // option 1 is gui frame with print dialog, option 2 is no gui frame only print dialog,3 means no gui frame no print dialog total silent print

        if (option == 1) {
            // This is for frame and dialog
            print_with_Full_Dialog();
        } else if (option == 2) {
            //this is for only print default dialog
            print_with_only_dialog();
        } else if (option == 3) {
            // this print silently with out gui frame or dialog
            print_with_no_GuI();
        }
    }

    // This is for frame and dialog
    public void print_with_Full_Dialog() {
        new PrintLibrary(modelMarksheet, option).setVisible(true);
    }

    //this is for only print default dialog
    public void print_with_only_dialog() {
        JTable table = GetTable();
        PrinterJob job = PrinterJob.getPrinterJob();
        MessageFormat[] header = new MessageFormat[13];
        header[0] = new MessageFormat("");
        header[1] = new MessageFormat(" ");
        header[2] = new MessageFormat("                            Noble Secondary English Boarding School");
        header[3] = new MessageFormat(" ");
        header[4] = new MessageFormat("                                             Janakpur Dham-12");
        header[5] = new MessageFormat(" ");
        header[6] = new MessageFormat("                                    Second Terminal Examination");
        header[7] = new MessageFormat(" ");
        header[8] = new MessageFormat("");
        header[9] = new MessageFormat("Class: X");
        header[10] = new MessageFormat("                                                                             GRADE-SHEET");
        header[11] = new MessageFormat(" ");
        header[12] = new MessageFormat("The marks secured by sd Roll No :- 3 has passed annual examination of 2078 B.S are given below.");

        MessageFormat[] footer = new MessageFormat[8];
        footer[0] = new MessageFormat(" __________________                                                                                   ________________");
        footer[1] = new MessageFormat("");
        footer[2] = new MessageFormat("        Prepared By                                                                                       Principal");
        footer[3] = new MessageFormat("");
        footer[4] = new MessageFormat("");
        footer[5] = new MessageFormat("");
        footer[6] = new MessageFormat("");
        footer[7] = new MessageFormat("Date of Issue_______________");
        //boolean complete=

        job.setPrintable(new MyTablePrintable(table, JTable.PrintMode.FIT_WIDTH, header, footer));

        if (job.printDialog()) {
            try {
                job.print();
                /* show a success message */
                JOptionPane.showMessageDialog(new JFrame(),
                        "Printing Complete",
                        "Printing Result",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (PrinterException pe) {
                /* Printing failed, report to the user */
                JOptionPane.showMessageDialog(new JFrame(),
                        "Printing Failed: " + pe.getMessage(),
                        "Printing Result",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            /* show a message indicating that printing was cancelled */
            JOptionPane.showMessageDialog(new JFrame(),
                    "Printing Cancelled",
                    "Printing Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // this print silently with out gui frame or dialog
    public void print_with_no_GuI() {
        PrinterJob job = PrinterJob.getPrinterJob();
        MessageFormat[] header = new MessageFormat[13];
        header[0] = new MessageFormat("");
        header[1] = new MessageFormat(" ");
        header[2] = new MessageFormat("                            Noble Secondary English Boarding School");
        header[3] = new MessageFormat(" ");
        header[4] = new MessageFormat("                                             Janakpur Dham-12");
        header[5] = new MessageFormat(" ");
        header[6] = new MessageFormat("                                    Second Terminal Examination");
        header[7] = new MessageFormat(" ");
        header[8] = new MessageFormat("");
        header[9] = new MessageFormat("Class: X");
        header[10] = new MessageFormat("                                                                             GRADE-SHEET");
        header[11] = new MessageFormat(" ");
        header[12] = new MessageFormat("The marks secured by sd Roll No :- 3 has passed annual examination of 2078 B.S are given below.");

        MessageFormat[] footer = new MessageFormat[8];
        footer[0] = new MessageFormat(" __________________                                                                                   ________________");
        footer[1] = new MessageFormat("");
        footer[2] = new MessageFormat("        Prepared By                                                                                       Principal");
        footer[3] = new MessageFormat("");
        footer[4] = new MessageFormat("");
        footer[5] = new MessageFormat("");
        footer[6] = new MessageFormat("");
        footer[7] = new MessageFormat("Date of Issue_______________");
        //boolean complete=
        JTable table = GetTable();
        job.setPrintable(new MyTablePrintable(table, JTable.PrintMode.FIT_WIDTH, header, footer));

        if (job.printDialog()) {
            try {
                job.print();
                /* show a success message */
                JOptionPane.showMessageDialog(new JFrame(),
                        "Printing Complete",
                        "Printing Result",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (PrinterException pe) {
                /* Printing failed, report to the user */
                JOptionPane.showMessageDialog(new JFrame(),
                        "Printing Failed: " + pe.getMessage(),
                        "Printing Result",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            /* show a message indicating that printing was cancelled */
            JOptionPane.showMessageDialog(new JFrame(),
                    "Printing Cancelled",
                    "Printing Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public JTable GetTable() {
        JTable gradesTable = new JTable(modelMarksheet);//createTable(new GradesModel());
        gradesTable.setFillsViewportHeight(true);
        Font font1 = new Font("Arial", Font.PLAIN, 28);
        gradesTable.setFont(font1);
        gradesTable.setBounds(10, 5, 1120, 550);
        gradesTable.setForeground(Color.black);
        gradesTable.setRowHeight(80);
        //gradesTable.setBackground(Color.cyan);

        //setting table header font */
        JTableHeader tableHeader = gradesTable.getTableHeader();
        tableHeader.setFont(font1);
        tableHeader.setForeground(Color.BLACK);
        //tableHeader.setBackground(new Color(13,91,31));
        tableHeader.setPreferredSize(new Dimension(100, 100));
        /* hide horizontal line */
        gradesTable.setShowHorizontalLines(false);
        gradesTable.setGridColor(Color.orange);

        /* Set a custom renderer on the "Passed" column */
        //gradesTable.getColumn("Passed").setCellRenderer(createPassedColumnRenderer());

        /* put all Value on center oj column*/
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        int numberofcols = gradesTable.getColumnCount();
        for (int x = 0; x < numberofcols; x++) {
            gradesTable.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
        }
        return gradesTable;
    }
}
