package Exam;
import Exam.Exam_Sub_menu;
import Exam.exam_add_exam;
import com.company.NewAdmisson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class result_search implements ActionListener {
    JButton search_B,NewRegister,ExamManageB,sheatPlanB,viewResultB;
    Container container;
    JFrame frame;
    result_search(Container c,JFrame f){
        frame=f;
        container=c;

        JPanel panel=new JPanel();
        Color color=new Color(13,91,31);
        panel.setBackground(color);
        panel.setBounds(230,0,1150,150);
        panel.setLayout(null);

        Font font1;
        font1=new Font("Arial",Font.PLAIN,20);

        ImageIcon searchLogo=new ImageIcon("images/search.jpg");
        ImageIcon newadmisson=new ImageIcon("images/newadmisson.png");
        ImageIcon ExamManageLogo=new ImageIcon("images/newadmisson.png");
        ImageIcon sheat_generateLogo=new ImageIcon("images/sheatPlan.jpg");
        ImageIcon ResultLogo=new ImageIcon("images/ResultLogo64.jpg");


        JLabel clas,rol,addResult,sheatPlanL,ExammanagerL,viewResultL;

        ExamManageB=new JButton(ExamManageLogo);
        sheatPlanB=new JButton(sheat_generateLogo);
        ExammanagerL=new JLabel("Exam Add:");
        sheatPlanL=new JLabel("Sheat Plan");
        viewResultB=new JButton(ResultLogo);
        viewResultL=new JLabel("View Result:");

        ExammanagerL.setForeground(Color.white);
        ExammanagerL.setFont(font1);
        ExammanagerL.setBounds(40,5,200,50);
        panel.add(ExammanagerL);

        ExamManageB.setBounds(200,2,200,50);
        ExamManageB.setSize(ExamManageLogo.getIconWidth(),ExamManageLogo.getIconHeight());
        panel.add(ExamManageB);

        sheatPlanL.setForeground(Color.white);
        sheatPlanL.setFont(font1);
        sheatPlanL.setBounds(350,5,200,50);
        panel.add(sheatPlanL);

        sheatPlanB.setBounds(480,2,200,10);
        sheatPlanB.setSize(sheat_generateLogo.getIconWidth(),sheat_generateLogo.getIconHeight());
        panel.add(sheatPlanB);

        viewResultL.setForeground(Color.white);
        viewResultL.setFont(font1);
        viewResultL.setBounds(650,5,200,50);
        panel.add(viewResultL);

        viewResultB.setBounds(800,2,200,10);
        viewResultB.setSize(ResultLogo.getIconWidth(),ResultLogo.getIconHeight());
        panel.add(viewResultB);


        clas=new JLabel("class:");
        //clas.setBackground(Color.white);
        clas.setForeground(Color.white);
        clas.setFont(font1);
        clas.setBounds(40,90,100,50);
        panel.add(clas);


        String country[]={"Non","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two","One","LKG","UKG","Nursery"};
        JComboBox cb=new JComboBox(country);
        cb.setBackground(Color.white);
        cb.setBounds(100,90,100,50);
        panel.add(cb);

        rol=new JLabel("Roll:");
        rol.setForeground(Color.white);
        rol.setFont(font1);
        rol.setBounds(250,90,100,50);
        panel.add(rol);

        JTextField roll=new JTextField();
        roll.setBounds(300,90, 100,50);
        roll.setFont(font1);
        panel.add(roll);

        JTextField serch=new JTextField();
        serch.setBounds(450,90, 300,50);
        serch.setFont(font1);
        panel.add(serch);

        search_B=new JButton(searchLogo);
        search_B.setBounds(770,95,100,70);
        search_B.setSize(searchLogo.getIconWidth(),searchLogo.getIconHeight());
        panel.add(search_B);


        addResult=new JLabel("Add Result:");
        //addResult.setBackground(Color.white);
        addResult.setForeground(Color.white);
        addResult.setFont(font1);
        addResult.setBounds(870,90,200,70);
        panel.add(addResult);

        NewRegister=new JButton(newadmisson);
        NewRegister.setBounds(990,85,100,70);
        NewRegister.setSize(newadmisson.getIconWidth(),newadmisson.getIconHeight());
        panel.add(NewRegister);

        NewRegister.addActionListener(this);
        search_B.addActionListener(this);
        ExamManageB.addActionListener(this);
        sheatPlanB.addActionListener(this);

        container.add(panel);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==search_B){
            //new result_display_jpanel(container,panel_display);
            JOptionPane.showMessageDialog(container,"search");

        }
        else if(e.getSource()==NewRegister){

            //new NewAdmisson(container);
            //JOptionPane.showMessageDialog(container,"NewAddmisson");

        }
        else if (e.getSource()==ExamManageB){
            JOptionPane.showMessageDialog(container,"ExamManageB");
            container.removeAll();
            new Exam_Sub_menu(frame,container);
            new exam_add_exam(container,frame);
            container.repaint();
            container.validate();
        }
        else  if (e.getSource()==sheatPlanB){
            JOptionPane.showMessageDialog(container,"sheatPlanB");
        }
    }
}
