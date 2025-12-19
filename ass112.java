import javax.swing.*;
import java.awt.event.*;
public class ass112 {
    public static void main(String[] args) {
        JFrame f=new JFrame("Simple Calculator");

        JLabel l1=new JLabel("First numer: ");
        JTextField t1 = new JTextField();

        JCheckBox c1 = new JCheckBox("CSE1");
        JCheckBox c2 = new JCheckBox("CSE2");

        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");

        ButtonGroup bg =new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JComboBox cb=new JComboBox(new String[]{"1st Year", "@nd Year", "#rd Year"});
        

        JButton b1=new JButton("Submit");

        l1.setBounds(40,30,80,30);
        t1.setBounds(120,30,120,30);
        
        c1.setBounds(40,70,80,30);
        c2.setBounds(130,70,80,30);

        r1.setBounds(40,110,80,30);
        r2.setBounds(130,110,80,30);

        cb.setBounds(40,150,120,30);
        b1.setBounds(80,200,80,30);

        

        // b1.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
        //         int a=Integer.parseInt(t1.getText());
        //         int b=Integer.parseInt(t2.getText());
        //         int sum=a+b;

        //         JOptionPane.showMessageDialog(f,"Sum = "+  sum);
        //     }
        // });
        f.add(l1);
        f.add(t1);
        f.add(c1);
        f.add(c2);
        f.add(r1);
        f.add(r2);
        f.add(cb);
        f.add(b1);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
