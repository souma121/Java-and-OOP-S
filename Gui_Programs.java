import javax.swing.*;
import java.awt.event.*;

public class Gui_Programs {
    public static void main(String[] args) {
        //Object Cretion
        JFrame frame = new JFrame("First Frame");
        JTextField text = new JTextField();
        JButton button = new JButton("Submit");
        JLabel label = new JLabel("Enter Your Name: ");
        // Setting the bounds
        label.setBounds(30, 40, 150, 25);
        text.setBounds(180, 40, 150, 25);
        button.setBounds(150, 90, 100, 30);
        //register objects into frame
        frame.add(label);
        frame.add(text);
        frame.add(button);
        //Listen the action and performe the action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name=text.getText();
                JOptionPane.showMessageDialog(frame,"Hello" + name + "!");
            }
        });
        //set the frame information
        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
