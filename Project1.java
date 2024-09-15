package com.mycompany.cmpr113_hw4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project1 {
    
    public static double total = 0;

    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        //JLabel oil = new JLabel("Oil Change");
        
        JCheckBox Go = new JCheckBox("Finish");
        
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JCheckBox oil = new JCheckBox("Oil change -- $26.00");
        JCheckBox lube = new JCheckBox("Lube job -- $18.00");
        JCheckBox radiator = new JCheckBox("Radiator flush -- $30.00");
        JCheckBox transmission = new JCheckBox("Transmission flush -- $80.00");
        JCheckBox inspection = new JCheckBox("Inspection -- $15.00");
        JCheckBox muffler = new JCheckBox("Muffler Replacement -- $100.00");
        JCheckBox tire = new JCheckBox("Tire Rotation -- $20.00");
        JTextField NonRoutineService = new JTextField("Joe performs other nonroutine services and charge for parts and for labor ($20 per hour)");
        
        
        oil.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(oil.isSelected())
                {
                    System.out.println("Oil was selected");
                    total += 26;
                }               
            }
        }  );
        
        
        
        lube.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(lube.isSelected())
                {
                    System.out.println("Lube was selected");
                    total += 18;
                }
            }
            
        });
        
        radiator.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (radiator.isSelected())
                {
                    System.out.println("Radiator was selected");
                    total += 30;
                }
            }
        }
        
        );
        
        transmission.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (transmission.isSelected())
                {
                    System.out.println("Transmission was selected");
                    total += 80;
                }
            }
            
        }      
        );
        
        inspection.addActionListener(new ActionListener()
        {
            
            public void actionPerformed(ActionEvent e)
            {
                if (inspection.isSelected())
                {
                    System.out.println("Inspection was selected");
                    total += 15;
                }
            }
        }
        
        
        );
        
        muffler.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (muffler.isSelected())
                {
                  System.out.println("Muffler was selected");
                  total += 100;
                }
            }
        }  
        );
        
        tire.addActionListener(new ActionListener()
        {
            
            public void actionPerformed(ActionEvent e)
            {
                
                if (tire.isSelected())
                {
                    System.out.println("Tire Rotation was selected");
                    total += 20;
                }
                
            }
        }
        
        
        );
        
        
                
        Go.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                total += 40;
                
                JOptionPane.showMessageDialog(null, "2 Hour Labor Charge");
                
                JOptionPane.showMessageDialog(null, "Total is: " + total);
            }
        }             
        );
        
        
         
                frame.add(NonRoutineService);
                
                frame.add(oil);           
                frame.add(lube);
                frame.add(radiator);
                frame.add(transmission);
                frame.add(inspection);
                frame.add(muffler);
                frame.add(tire);
                
                frame.setTitle("Joe's Automotive");
                
                frame.setSize(600, 300);
                                          
                frame.add(Go);
                
                frame.setVisible(true);
          
    }
}
