package canteensystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FoodMenu extends JFrame
{
    JButton b1,b2,b3,b4;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3,l4;
    JPanel p1;
    JTable table;
    DefaultTableModel model;
    String ID, PName, Price;
    
    public FoodMenu() 
    {
        setTitle("Food Menu");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
        getContentPane().setBackground(Color.GRAY); 
        
        Font f1 = new Font("Times New Roman", Font.BOLD, 20);
        
        p1 = new JPanel();
	p1.setBounds(0,0,700,200);
	p1.setBackground(Color.GRAY);
	p1.setLayout(null);
	add(p1);
        
        Object data[][] = {{1, "Shingara", 7}, {2, "Samosa", 7},{3, "Abrar", 1214}};
        String columnNames[] = {"ID", "Product Name", "Price"};      
        model = new DefaultTableModel(data,columnNames);
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(10,10,660,180);
        p1.add(sp);
          
        t1 = new JTextField();
        t1.setBounds(200,200,300,40);
        add(t1);
        
        t2 = new JTextField();
        t2.setBounds(200,250,300,40);
        add(t2);
        
        t3 = new JTextField();
        t3.setBounds(200,300,300,40);
        add(t3);
        
        l1 = new JLabel("ID");
        l1.setFont(f1);
        l1.setBounds(80,200,100,40);
        add(l1);
        
        l2 = new JLabel("PRODUCT NAME");
        l2.setFont(f1);
        l2.setBounds(10,250,180,40);
        add(l2);
        
        l3 = new JLabel("PRICE");
        l3.setFont(f1);
        l3.setBounds(60,300,100,40);
        add(l3);
        
        b1 = new JButton("ADD");
        b1.setBounds(200,380,80,50);
        add(b1);
        
        b2 = new JButton("UPDATE");
        b2.setBounds(300,380,80,50);
        add(b2);
        
        b3 = new JButton("DELETE");
        b3.setBounds(400,380,80,50);
        add(b3);
        
        b4 = new JButton("EXIT");
        b4.setBounds(600,380,80,50);
        add(b4);
        
        setVisible(true);
        
        
        b1.addActionListener(new ActionListener() 
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                ID = t1.getText();
		PName = t2.getText();
		Price = t3.getText();
				
		Object newRow[]= {ID,PName,Price};
		model.addRow(newRow); 
            }
        });
        
        table.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                int rowIndex = table.getSelectedRow();
                ID = (String) model.getValueAt(rowIndex, 0);//row, column
                PName = (String) model.getValueAt(rowIndex, 1);
                Price = (String) model.getValueAt(rowIndex, 2);
                
                t1.setText(ID);
                t2.setText(PName);
                t3.setText(Price);
            }
        });
            
        b2.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                ID = t1.getText();
		PName = t2.getText();
		Price = t3.getText();
				
		int row = table.getSelectedRow();
				
		model.setValueAt(ID, row, 0);
		model.setValueAt(PName, row, 1);
		model.setValueAt(Price, row, 2);
            }
                
        });
        
        b3.addActionListener(new ActionListener() 
        {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            model.removeRow(table.getSelectedRow());
        }
        });
        
        b4.addActionListener(new ActionListener() 
        {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            dispose();
        }
        });
        
}
    
}
