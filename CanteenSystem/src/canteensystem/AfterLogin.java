package canteensystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AfterLogin extends JFrame {
    JLabel l1;
    JPanel p1,p2;
    JButton b1,b2,b3,b4,b5;
    
    
    AfterLogin()
    {
        setTitle("Canteen Management System");
        setSize(800,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
        
        Font f1 = new Font("Candara", Font.BOLD, 12);
        
        JLabel l1 = new JLabel("");
        l1.setBounds(50,50,300,50);
        add(l1);
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(211,211,211));
        p1.setBounds(0,0,800,100);
        add(p1);
        
        b1 = new JButton("About Project");
        b1.setFont(f1);
        b1.setBounds(20,30,120,40);
        b1.setBackground(new Color(132,123,166));
        b1.setFocusable(false);
        p1.add(b1);
        
        b2 = new JButton("Food Menu");
        b2.setFont(f1);
        b2.setBounds(180,30,120,40);
        b2.setBackground(new Color(132,123,166));
        b2.setFocusable(false);
        p1.add(b2);
        
        b3 = new JButton("Add Sells");
        b3.setFont(f1);
        b3.setBounds(340,30,120,40);
        b3.setBackground(new Color(132,123,166));
        b3.setFocusable(false);
        p1.add(b3);
        
        b4 = new JButton("Staff List");
        b4.setFont(f1);
        b4.setBounds(500,30,120,40);
        b4.setBackground(new Color(132,123,166));
        b4.setFocusable(false);
        p1.add(b4);
        
        b5 = new JButton("Exit");
        b5.setFont(f1);
        b5.setBounds(650,30,120,40);
        b5.setBackground(new Color(132,123,166));
        b5.setFocusable(false);
        p1.add(b5);
        
        p2 = new JPanel();
        //p2.setLayout(null);
        p2.setBounds(0,160,800,505);
        p2.setBackground(Color.RED);
        add(p2);
        
        l1 = new JLabel("CANTEEN MANAGEMENT SYSTEM");
        l1.setBounds(10,80,500,100);
        Font f2 = new Font("Candara", Font.BOLD, 25);
        l1.setFont(f2);
        add(l1);
        
        JLabel imagelabel = new JLabel();  
	imagelabel.setIcon(new ImageIcon("D://Downloads//New Project.jpg"));
        p2.add(imagelabel);
        
        setVisible(true);
          
        b1.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //new About();
            }

        });
        
        b2.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new FoodMenu();
            }

        });
        
        b3.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new Sells();
            }

        });
        
        b4.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //new Staff();
            }

        });
        
        b5.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
            }

        });
    
}
    
}
