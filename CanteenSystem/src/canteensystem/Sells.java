package canteensystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Sells extends JFrame
{
    JTable table;
    JButton b1,b2;
    JPanel p1;
    DefaultTableModel model;
    JTextField t1,t2,t3,t4,t5,t6;
    JLabel l1,l2,l3;
    String ID, Quantity,Price,temp;
    double d1,d2,d3=0,d4;
    
    Sells() 
    {
        
        setTitle("ADD SELLS");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
        getContentPane().setBackground(Color.GRAY); 
        
        //Font f1 = new Font("Times New Roman", Font.BOLD, 20);
        
        p1 = new JPanel();
	p1.setBounds(0,0,700,250);
	p1.setBackground(Color.GRAY);
	p1.setLayout(null);
	add(p1);
        
        Object data[][] = {};
        String columnNames[] = {"ProductID","Quantity","Price"};      
        model = new DefaultTableModel(data,columnNames);
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(10,70,660,200);
        p1.add(sp);
        
        t1 = new JTextField("Customer Name");
        t1.setBounds(10,10,280,35);
        p1.add(t1);
        
        t2 = new JTextField("Date & Time");
        t2.setBounds(350,10,280,35);
        p1.add(t2);
        
        t3 = new JTextField("Product ID");
        t3.setBounds(10,280,140,35);
        add(t3);
        
        t4 = new JTextField("Price");
        t4.setBounds(10,320,280,35);
        add(t4);
        
        t5 = new JTextField("Quantity");
        t5.setBounds(150,280,140,35);
        add(t5);
         
        b1 = new JButton("ADD");
        b1.setBounds(80,370,80,50);
        add(b1);
        
        b2 = new JButton("EXIT");
        b2.setBounds(550,400,80,50);
        add(b2);
        
        
        Font f1 = new Font("Times New Roman", Font.BOLD, 25);
        
        l1 = new JLabel("Total Cost :");
        l1.setFont(f1);
        l1.setBounds(350,280,150,50);
        add(l1);
        
        t6 = new JTextField();
        t6.setBounds(480,290,180,30);
        t6.setEditable(false);
        add(t6);
        
        
        setVisible(true);
        
        b1.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {

                ID = t3.getText();
		Quantity = t5.getText();
		Price = t4.getText();		
		Object newRow[]= {ID,Quantity,Price};
		model.addRow(newRow);
                
                
                d1 = Double.parseDouble(Quantity);
                d2 = Double.parseDouble(Price);
                d3 = d4 + (d1*d2);
                t6.setText(Double.toString(d3));   
                temp = t6.getText();
                d4 = Double.parseDouble(temp);
            }
        });
        
        b2.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
            }
        });
}
    
}
    
