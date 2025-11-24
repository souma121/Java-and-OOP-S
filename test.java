import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
// import java.awt.event.*;
// import java.util.ArrayList;

public class test extends JFrame {

    private DefaultListModel<String> studentListModel;
    private JList<String> studentList;
    private JTextField nameField, rollField, deptField;
    private JTextArea logArea;

    public test() {
        setTitle("Student Management System");
        setSize(900, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // -------------------- NORTH PANEL --------------------
        JPanel top = new JPanel(new BorderLayout());
        top.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel title = new JLabel("Student Management System", JLabel.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));
        top.add(title);

        add(top, BorderLayout.NORTH);

        // -------------------- WEST PANEL (Student List) --------------------
        JPanel left = new JPanel(new BorderLayout());
        left.setBorder(new EmptyBorder(10, 10, 10, 10));

        studentListModel = new DefaultListModel<>();
        studentList = new JList<>(studentListModel);
        studentList.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        left.add(new JScrollPane(studentList), BorderLayout.CENTER);

        add(left, BorderLayout.WEST);

        // -------------------- CENTER PANEL (Form) --------------------
        JPanel center = new JPanel(new GridLayout(8, 1, 10, 10));
        center.setBorder(new EmptyBorder(20, 30, 20, 30));

        center.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        center.add(nameField);

        center.add(new JLabel("Roll Number:"));
        rollField = new JTextField();
        center.add(rollField);

        center.add(new JLabel("Department:"));
        deptField = new JTextField();
        center.add(deptField);

        JButton addBtn = new JButton("Add Student");
        JButton removeBtn = new JButton("Remove Student");

        center.add(addBtn);
        center.add(removeBtn);

        add(center, BorderLayout.CENTER);

        // -------------------- SOUTH PANEL (Log Area) --------------------
        JPanel bottom = new JPanel(new BorderLayout());
        bottom.setBorder(new EmptyBorder(10, 10, 10, 10));

        logArea = new JTextArea(5, 20);
        logArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        bottom.add(new JScrollPane(logArea));

        add(bottom, BorderLayout.SOUTH);

        // -------------------- ACTION LISTENERS --------------------
        addBtn.addActionListener(e -> addStudent());
        removeBtn.addActionListener(e -> removeStudent());

        studentList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && studentList.getSelectedValue() != null) {
                log("Selected: " + studentList.getSelectedValue());
            }
        });
    }

    private void addStudent() {
        String name = nameField.getText().trim();
        String roll = rollField.getText().trim();
        String dept = deptField.getText().trim();

        if (name.isEmpty() || roll.isEmpty() || dept.isEmpty()) {
            log("Please fill all fields!");
            return;
        }

        String student = name + " | Roll: " + roll + " | Dept: " + dept;

        studentListModel.addElement(student);
        log("Added: " + student);

        nameField.setText("");
        rollField.setText("");
        deptField.setText("");
    }

    private void removeStudent() {
        int index = studentList.getSelectedIndex();
        if (index == -1) {
            log("Select a student to remove!");
            return;
        }

        String removed = studentListModel.remove(index);
        log("Removed: " + removed);
    }

    private void log(String message) {
        logArea.append(message + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new test().setVisible(true));
    }
}