import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // GUI - Graphical User Interface
        JFrame frame = new JFrame("MyFirstFrame");
        //frame.setTitle("MyFirstFrame");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JButton, JTextField, JTextArea, JLabel, JCheckBox, JRadioButton, JPanel...
        JButton upperMenu = new JButton("Upper Menu");

        frame.add(upperMenu, BorderLayout.NORTH);
        upperMenu.setBackground(Color.red);
        upperMenu.setForeground(Color.yellow);

        JCheckBox check = new JCheckBox("Checkbox");
        check.setBackground(Color.blue);
        check.setForeground(Color.white);
        frame.add(check, BorderLayout.SOUTH);

        JRadioButton radio = new JRadioButton("Radio Button");
        radio.setBackground(new Color(229, 91, 91));
        frame.add(radio, BorderLayout.WEST);

        JTextArea area = new JTextArea("Write here!");
        area.setPreferredSize(new Dimension(100,200));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        // panel - container for other elements
        JPanel center = new JPanel();
        center.setLayout(new FlowLayout()); // this is redundant here
        JLabel label = new JLabel("Enter text:");
        JTextField field = new JTextField(10);
        JButton submit = new JButton("Submit");

        center.add(label);
        center.add(field);
        center.add(submit);
        center.setBackground(new Color(62, 100,0, 120));
        frame.add(center, BorderLayout.CENTER);
        // popup windows
        //JOptionPane.showMessageDialog(frame,"Hello", "New title", JOptionPane.INFORMATION_MESSAGE);
        String name = JOptionPane.showInputDialog(frame, "Enter name:");
        System.out.println(name);
        area.setText(name);

        // Action listener - interface that listens for events (e.g. mouse click) and acts
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = field.getText();
                JOptionPane.showMessageDialog(frame,text);
            }
        });

        frame.add(area, BorderLayout.EAST);
        frame.setVisible(true); // put as last statement
        // especially if you use MacOS




    }
}