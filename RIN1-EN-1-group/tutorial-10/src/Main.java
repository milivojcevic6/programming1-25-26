import javax.swing.*;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) throws Exception {
        // On macOS Swing UI elements sometimes ignore color settings unless this is set
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        // GUI - Graphical User Interface
        JFrame frame = new JFrame("First JFame");
        // default layot for frame is BorderLayout
        // NORTH, SOUTH, EAST, WEST, CENTER
        //frame.setTitle("First JFame"); // same thing as above
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);

        // JButton
        JButton upperMenu  = new JButton("Upper menu");
        frame.add(upperMenu, BorderLayout.NORTH);

        // JLabel, JTextField, JTextArea, JCheckBox, JRadioButton...
        JCheckBox checkBox  = new JCheckBox("CheckBox");
        checkBox.setBackground(new Color(200,0,100));
        frame.add(checkBox, BorderLayout.SOUTH);

        JRadioButton radio = new JRadioButton("RadioButton");
        radio.setBackground(new Color(0, 200, 199));
        frame.add(radio, BorderLayout.WEST);

        JTextArea textArea = new JTextArea("Write here!");
        textArea.setBackground(Color.lightGray);
        textArea.setPreferredSize(new Dimension(100,200));
        textArea.setLineWrap(true);
        frame.add(textArea, BorderLayout.EAST);

        // JPanel - container that can hold other elements
        // default layout for JPanel is FlowLayout
        JPanel center = new JPanel();
        center.setLayout(new FlowLayout()); // this is how we set layout

        JLabel label = new JLabel("Enter text:");
        JTextField field = new JTextField(10);
        JButton submit = new JButton("Submit");

        JButton first = new JButton("First");
        JButton second = new JButton("Second");
        first.setBackground(Color.green);
        second.setForeground(Color.red);


        center.add(label);
        center.add(field);
        center.add(submit);
        center.add(first);
        center.add(second);

        // Add action listener to submit button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = field.getText();
                JOptionPane.showMessageDialog(frame, "You entered: " + text);
            }
        });



        frame.add(center, BorderLayout.CENTER);

        // JOptionPane
//        while (true) {
//            JOptionPane.showMessageDialog(frame, "YOU HAVE A VIRUS!", "VIRUS 0x0182", JOptionPane.ERROR_MESSAGE);
//        }
        String s = JOptionPane.showInputDialog(frame, "Enter your name:", "First name", JOptionPane.QUESTION_MESSAGE);

        textArea.setText(s);

        frame.setVisible(true); // by default set to false
        // On MacOS this thing needs to be last instruction

    }
}