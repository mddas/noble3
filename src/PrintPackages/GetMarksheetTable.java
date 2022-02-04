package PrintPackages;

import com.company.DataBase_Mysql;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;

public class GetMarksheetTable {

    public static DefaultTableModel getModelMarksheet(String id){
        DefaultTableModel model = new DefaultTableModel();
        Vector<String> rowdata = new Vector<String>();
        HashMap<String, String> StudentDetailList=new HashMap<String,String>();
        try {
            ResultSet rs;
            rs = DataBase_Mysql.SELECT("SELECT * FROM Student_Result WHERE student_result_id = '" + id + "'");
            for (int j = 1; j <= 10; j++) {
                if (!rs.getString("sub_" + j).isEmpty() && rs.getString("sub_" + j) != null && rs.getString("sub_" + j) != "") {
                    StudentDetailList.put(rs.getString("sub_" + j), rs.getString("sub_" + j + "_fm"));
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        for (String key : StudentDetailList.keySet()) {
            if (key == "full_mark_id" || key == "Terminal" || key == "Class" || key == "year") {
            } else {
                model.addColumn(key);
            }
            rowdata.add(StudentDetailList.get(key));
        }
        System.out.println(StudentDetailList);
        model.addRow(rowdata);
        return model;
    }
}
