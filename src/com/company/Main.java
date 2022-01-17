package com.company;

import java.sql.Connection;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        //class_global_variable.con=DataBase_Mysql.Mysql_Connection();
        new DataBase_Mysql();
        new gui_main();
    }
}
