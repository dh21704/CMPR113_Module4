package com.mycompany.cmpr113_hw4;
//import javax.swing.*:
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Project2 {
    
    public static double ratePerMinute;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Long Distance Calls");
        
        JCheckBox daytime = new JCheckBox("Daytime (6:00 A.M through 5:59 P.M");
        JCheckBox evening = new JCheckBox("Evening (6:00 P.M through 11:59 P.M");
        JCheckBox offPeak = new JCheckBox("Off-Peak (12:00 A.M through 5:59 A.M");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new FlowLayout());
        
        frame.setSize(400, 400);
  
        JButton go = new JButton("Finish");
        
        JLabel label = new JLabel("Number of Minutes on Call");
        JTextField textField = new JTextField(7);
        
        daytime.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                ratePerMinute = 0.07;
            }
        }
        
        
        );
        
        evening.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                ratePerMinute = 0.12;
            }
        }
        );
        
        offPeak.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                ratePerMinute = 0.05;
            }
        }
        );
        
    
        go.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)              
            {
                String text = textField.getText();
                
                go.setText("Number of Minutes");
                
                double minutes = Double.parseDouble(text);
                
                JOptionPane.showMessageDialog(null, "Minutes: " + minutes);
                
                double total = ratePerMinute * minutes;
                
                JOptionPane.showMessageDialog(null, "Total for " + minutes + " minutes \nat a rate of " + ratePerMinute + "\nis $" + total);
            }   
        }
        );
       
        frame.add(label);
        frame.add(textField);
        frame.add(daytime);
        frame.add(evening);
        frame.add(offPeak);
        frame.add(go);
        
        frame.setVisible(true);
        
    }
    
}
