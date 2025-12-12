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
        //frame.setResizable(false);

        // JButton
        JButton upperMenu = new JButton("Upper menu");
        // frame uses BorderLayout by default
        // NORTH, SOUTH, EAST, WEST, CENTER
        frame.add(upperMenu, BorderLayout.NORTH);

        // JLabel, JTextField, JTextArea, JCheckBox, JRadioButton...
        JCheckBox checkBox = new JCheckBox("CheckBox");
        checkBox.setBackground(Color.blue);
        checkBox.setForeground(Color.white);
        frame.add(checkBox,BorderLayout.SOUTH);

        JRadioButton radio = new JRadioButton("RadioButton");
        radio.setBackground(Color.red);
        frame.add(radio, BorderLayout.WEST);

        JTextArea area = new JTextArea("Write here!");
        area.setBackground(new Color(200,222,222));
        area.setPreferredSize(new Dimension(100,200));
        area.setLineWrap(true);
        frame.add(area, BorderLayout.EAST);

        // JPanel - container for other elements
        JPanel center = new JPanel();
        center.setBackground(Color.lightGray);
        // default layout in Panel is FlowLayout
        center.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter text:");
        JTextField field = new JTextField(10);
        JButton submit = new JButton("Submit");

        JButton a = new JButton("first");
        a.setBackground(Color.green);
        JButton b = new JButton("second");
        b.setForeground(Color.blue);

        center.add(label);
        center.add(field);
        center.add(submit);
        center.add(a);
        center.add(b);

        //JOptionPane.showMessageDialog(frame, "Hello", "Title",JOptionPane.INFORMATION_MESSAGE);
        String s = JOptionPane.showInputDialog(frame, "Enter your name:", "Name", JOptionPane.QUESTION_MESSAGE);
        System.out.println(s);
        area.setText(s);

        //ActionListener - listens for events (e.g. mouse click) and acts accordingly
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = field.getText();
                JOptionPane.showMessageDialog(frame,"You entered: " + text);
            }
        });


        frame.add(center, BorderLayout.CENTER);
        frame.setVisible(true); // by default false
//while (true) {
//    JOptionPane.showMessageDialog(frame, "VIRUS", "VIRUS", JOptionPane.ERROR_MESSAGE);
//}
    }
}