import java.util.*;
import javax.swing.*;
// import java.awt.event.*;

public class GUI_STudent_List {
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student List");
        JTextField nameField = new JTextField();
        JButton addButton = new JButton("Add Student");
        JButton showButton = new JButton("Show Student");
        JLabel label = new JLabel("Enter Students Name");
        JTextArea output = new JTextArea();

        label.setBounds(10,10,50,5);
        nameField.setBounds(30, 30, 200, 25);
        addButton.setBounds(250, 30, 120, 25);
        showButton.setBounds(150, 70, 150, 25);
        output.setBounds(30, 110, 340, 120);

        frame.add(label);
        frame.add(nameField);
        frame.add(addButton);
        frame.add(showButton);
        frame.add(output);

        addButton.addActionListener(e -> {
            String name = nameField.getText();
            if (!name.isEmpty()) {
                list.add(name);
                nameField.setText(" ");
            }
        });

        showButton.addActionListener(e -> {
            output.setText("Student List: \n");
            for (String s : list) {
                output.append(s + "\n");
            }
        });
        frame.setSize(420, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
