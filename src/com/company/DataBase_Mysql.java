package com.company;
import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

public class DataBase_Mysql {
    Connection con = null;
    public DataBase_Mysql(){

        try {

            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/Noble", "root", "");
            System.out.println("[OK] Database mysql connection Successfully");
        }
        catch (Exception e){
            System.out.println("[FAILED] Database connection constructor ."+e);
        }
    }
    public ConnectionImpl Mysql_Connection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Noble", "root", "");
            return (ConnectionImpl) con;

        } catch (Exception e) {
            System.out.println(e);
        }
        return (ConnectionImpl) con;
    }

    public ResultSet SELECT(String sql){
        ResultSet rs=null;
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
       //     while (rs.next())
         //       System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
           // con.close();
            return rs;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    public int Count(String sql){
        ResultSet rs=null;
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            rs.next();
            int count = rs.getInt(1);
            System.out.println("Number of records in the cricketers_data table: "+count);
           return count;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }
}
