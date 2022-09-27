import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ifsc_web implements ActionListener
{
    String bank1;
    String branch;
    String centre;
    String district;
    String state;
    String add;
    String contact;
    String info[]=new String[10];
    JButton button1;
    JTextField enter;
    JTextField bk;
    JTextField br;
    JTextField cen;
    JTextField dis;
    JTextField sta;
    JTextField address;
    JTextField con;
    String str;
    public ifsc_web ()throws IOException,ParseException
    {
        button1=new JButton("Search..");
        JFrame frame=new JFrame();
        JLabel title=new JLabel("IFSC CODE");
        JPanel panel=new JPanel();
        bk=new JTextField();
        br=new JTextField();
        cen=new JTextField();
        dis=new JTextField();
        sta=new JTextField();
        address=new JTextField();
        con=new JTextField();
        enter=new JTextField();
        button1.setBounds(450, 100, 100, 20);
        enter.setBounds(200, 100, 200, 20);
        bk.setBounds(200, 150, 400, 20);
        br.setBounds(200, 200, 400, 20);
        cen.setBounds(200, 250, 400, 20);
        dis.setBounds(200, 300, 400, 20);
        sta.setBounds(200, 350, 400, 20);
        address.setBounds(200, 400, 10000, 20);
        con.setBounds(200, 450, 400, 20);
        button1.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(30,2,10,300));
        panel.setLayout(null);
        frame.add(panel,BorderLayout.CENTER);
        button1.setBackground(Color.GREEN);
        frame.setTitle("Ifsc search");
        enter.setBackground(Color.gray);
        frame.getContentPane().setBackground(Color.CYAN);
        panel.setBackground(Color.BLACK);
        bk.setBackground(Color.black);
        br.setBackground(Color.black);
        cen.setBackground(Color.black);
        dis.setBackground(Color.black);
        sta.setBackground(Color.black);
        address.setBackground(Color.black);
        con.setBackground(Color.black);
        address.setForeground(Color.white);
        br.setForeground(Color.WHITE);
        cen.setForeground(Color.white);
        bk.setForeground(Color.white);
        dis.setForeground(Color.white);
        sta.setForeground(Color.white);
        con.setForeground(Color.white);
        bk.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        br.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dis.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        sta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        con.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.pack();
        frame.setVisible(true);
        panel.add(button1);
        panel.add(enter);
        panel.add(bk);
        panel.add(br);
        panel.add(dis);
        panel.add(sta);
        panel.add(address);
        panel.add(con);
        panel.add(cen);
        panel.add(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws IOException,ParseException
    {
     new ifsc_web();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try 
        {
            if(e.getSource()==button1)
            {
                str=enter.getText();
                if(str.length()<11)
                System.exit(0);
                String bank=str.substring(0,4);
                String file="C:/Users/meera/OneDrive/Desktop/Project/data/"+bank+".json";  
                JSONParser parser = new JSONParser();
                    Object obj = parser.parse(new FileReader(file));
                    JSONObject jsonObject = (JSONObject) obj;
                    JSONObject code = (JSONObject) jsonObject.get(str);
                    bank1 = (String) code.get("BANK");
                    branch = (String) code.get("BRANCH");
                    centre = (String) code.get("CENTRE");
                    district = (String) code.get("DISTRICT");
                    state = (String) code.get("STATE");
                    add = (String) code.get("ADDRESS");
                    contact= (String) code.get("CONTACT");
                }
                if(bank1.equals("null")&&branch.equals("null")&&centre.equals("null")&&district.equals("null")&&state.equals("null")&&add.equals("null")&&contact.equals("null"))
                {
                    bk.setText("Invalid Input");
                    cen.setText("Invalid Input");
                    br.setText("Invalid Input");
                    dis.setText("Invalid Input");
                    sta.setText("Invalid Input");
                    address.setText("Invalid Input");
                    con.setText("Invalid Input");
                }
                else
                {
                    bk.setText("BANK :  "+bank1);
                    cen.setText("BRANCH :  "+branch);
                    br.setText("CENTRE :  "+centre);
                    dis.setText("DISTRICT :  "+district);
                    sta.setText("STATE :  "+state);
                    address.setText("ADDRESS :  "+add);
                    con.setText("CONTACT INFO :  "+contact);
                }
            } 
            catch (IOException | ParseException e1) 
            {
                e1.printStackTrace();
            }
        
    }
}