package com.company;

import javax.swing.*;
import java.awt.*;

public class gui_content_exam {
        gui_content_exam(JFrame frame, Container container) {
            JPanel panel = new JPanel();
            Color wood=new Color(130, 91, 31);
            panel.setBackground(wood);
            JPanel panel_display=new JPanel();
            panel_display.setBounds(300,260,700,500);
            panel_display.setBackground(wood);

            new result_search(container,frame);
            new result_table(container,frame);

            container.add(panel);
            panel_display.setVisible(false);
            container.add(panel_display);

        }
    }

