import javax.swing.*;
import java.awt.event.*;
public class ass111 {
    public static void main(String[] args) {
        JFrame f=new JFrame("Simple Calculator");

        JLabel l1=new JLabel("First numer: ");
        JLabel l2=new JLabel("Second numer: ");

        JTextField t1 = new JTextField();
        JTextField t2=new JTextField();

        JButton b1=new JButton("ADD");

        l1.setBounds(50,30,100,30);
        t1.setBounds(100,30,100,30);
        l2.setBounds(50,70,100,30);
        t2.setBounds(160,70,100,30);

        b1.setBounds(100,120,80,30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int sum=a+b;

                JOptionPane.showMessageDialog(f,"Sum = "+  sum);
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);

        f.setSize(320,220);
        f.setLayout(null);
        f.setVisible(true);
    }
}
