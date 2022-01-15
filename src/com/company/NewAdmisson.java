package com.company;
import javax.swing.*;
import java.awt.*;

public class NewAdmisson {
    Container container;
    public NewAdmisson(Container c){
        container=c;
        Font font=new Font("Arial",Font.PLAIN,16);
        JTextField first_name_form,Last_name_form,class_form,roll_form,address_form,parents_form,mobileNumber_form,age_form,email_form;
        JLabel first_nameL,Last_nameL,clasL,roll_L,addresL,parentsL,mobileNumberL,ageL,emailL;
        JButton submit;
        JPopupMenu popupmenu = new JPopupMenu("Edit");
        JPanel panel=new JPanel();
        Color color=new Color(13,91,31);
        panel.setBackground(color);
       //panel.setBounds(450,300,1250,1050);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.insets = new Insets(22,2,22,10);//top,left,bottm,right

        constraints.gridx = 0;constraints.gridy = 0;
        first_nameL=new JLabel("First Name");
        first_nameL.setForeground(Color.white);
        panel.add(first_nameL,constraints);

        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 1;constraints.gridy = 0;
        first_name_form=new JTextField();
        first_name_form.setFont(font);
        panel.add(first_name_form,constraints);

        constraints.ipady = 0;
        constraints.ipadx = 0;
        constraints.gridx = 2;constraints.gridy = 0;
        Last_nameL=new JLabel("Last Name");
        Last_nameL.setForeground(Color.white);
        panel.add(Last_nameL,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 3;constraints.gridy = 0;
        Last_name_form=new JTextField();
        Last_name_form.setFont(font);
        panel.add(Last_name_form,constraints);

        constraints.ipady = 0;
        constraints.ipadx = 0;
        constraints.gridx = 4;constraints.gridy = 0;
        clasL=new JLabel("Class");
        clasL.setForeground(Color.white);
        panel.add(clasL,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 5;constraints.gridy = 0;
        class_form=new JTextField();
        class_form.setFont(font);
        panel.add(class_form,constraints);

        constraints.ipady = 0;
        constraints.ipadx = 0;
        constraints.gridx = 0;constraints.gridy = 1;
        roll_L=new JLabel("Roll No");
        roll_L.setForeground(Color.white);
        panel.add(roll_L,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 1;constraints.gridy = 1;
        roll_form=new JTextField();
        roll_form.setFont(font);
        panel.add(roll_form,constraints);

        constraints.ipady = 0;
        constraints.ipadx = 0;
        constraints.gridx = 2;constraints.gridy = 1;
        addresL=new JLabel("Address");
        addresL.setForeground(Color.white);
        panel.add(addresL,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 3;constraints.gridy = 1;
        address_form=new JTextField();
        address_form.setFont(font);
        panel.add(address_form,constraints);

        constraints.ipady = 0;
        constraints.ipadx = 0;
        constraints.gridx = 4;constraints.gridy = 1;
        parentsL=new JLabel("Parrents");
        parentsL.setForeground(Color.white);
        panel.add(parentsL,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 5;constraints.gridy = 1;
        parents_form=new JTextField();
        parents_form.setFont(font);
        panel.add(parents_form,constraints);

        //here
        constraints.ipady = 0;
        constraints.ipadx = 0;
        constraints.gridx = 0;constraints.gridy = 2;
        mobileNumberL=new JLabel("Mobile Number");
        mobileNumberL.setForeground(Color.white);
        panel.add(mobileNumberL,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 1;constraints.gridy = 2;
        mobileNumber_form=new JTextField();
        mobileNumber_form.setFont(font);
        panel.add(mobileNumber_form,constraints);

        constraints.ipady = 0;
        constraints.ipadx = 0;
        constraints.gridx = 2;constraints.gridy = 2;
        ageL=new JLabel("Age");
        ageL.setForeground(Color.white);
        panel.add(ageL,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 3;constraints.gridy = 2;
        age_form=new JTextField();
        age_form.setFont(font);
        panel.add(age_form,constraints);

        constraints.ipady = 0;
        constraints.ipadx = 0;
        constraints.gridx = 4;constraints.gridy = 2;
        emailL=new JLabel("Email");
        emailL.setForeground(Color.white);
        panel.add(emailL,constraints);
        // increases components height by 50 pixels
        constraints.ipady = 20;
        constraints.ipadx = 200;
        constraints.gridx = 5;constraints.gridy = 2;
        email_form=new JTextField();
        email_form.setFont(font);
        panel.add(email_form,constraints);

        constraints.gridx=2;constraints.gridy=3;
        submit=new JButton("Submit");
        submit.setForeground(Color.white);
        submit.setBackground(Color.blue);
        panel.add(submit,constraints);

        popupmenu.add(panel);
        popupmenu.show(container,250,200);
    }
}
