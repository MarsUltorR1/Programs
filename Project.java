import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Project implements ActionListener
{
    JTextField enter,enter1;
    JButton button1,button2,button3,button4;
    String copy="",copy2="";int count=0;
    public Project()
    {
        button1=new JButton("Delete");
        button2=new JButton("Copy");
        button3=new JButton("Cut");
        button4=new JButton("Paste");
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        enter=new JTextField();
        button1.setBounds(250, 300, 100, 20);
        button2.setBounds(450, 300, 100, 20);
        button3.setBounds(650, 300, 100, 20);
        button4.setBounds(850, 300, 100, 20);
        enter.setBounds(500, 200, 200, 20);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(30,2,10,300));
        panel.setLayout(null);
        frame.getContentPane().setBackground(Color.CYAN);
        panel.setBackground(Color.BLACK);
        enter.setBackground(Color.CYAN);
        button1.setBackground(Color.ORANGE);
        button2.setBackground(Color.ORANGE);
        button3.setBackground(Color.ORANGE);
        button4.setBackground(Color.ORANGE);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PROJECT");
        frame.pack();
        frame.setVisible(true);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(enter);
    }
 
    public static void main(String[] args) 
    {
       new Project();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==button2)
        {
            copy2="";
            copy=enter.getText();
            copy2=copy2+copy;
        }
        if(e.getSource()==button3)
        {
            copy2="";
            copy=enter.getText();
            enter.setText("");
        }
        if(e.getSource()==button4)
        {
            copy2=copy2+copy;
            enter.setText(copy2);
        }
        if(e.getSource()==button1)
        {
            enter.setText("");
            copy2="";
        }
    }
}