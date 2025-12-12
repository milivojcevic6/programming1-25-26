import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) throws Exception {
        // GUI - Graphical User Interface
        // On macOS Swing UI elements sometimes ignore color settings unless this is set
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        // JFrame
        JFrame frame = new JFrame();
        frame.setTitle("MyFirstFrame");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton upperMenu = new JButton("Upper Menu");
        frame.add(upperMenu, BorderLayout.NORTH);

        // JLabel, JTextField, JTextArea, JCheckBox, JRadioButton...

        JCheckBox checkBox = new JCheckBox("CheckBox");
        checkBox.setBackground(Color.CYAN);
        frame.add(checkBox, BorderLayout.SOUTH);



        JRadioButton radio = new JRadioButton("Radio button");
        radio.setBackground(new Color(200,100,200));
        radio.setForeground(new Color(100,200,100));
        frame.add(radio, BorderLayout.WEST);

        JTextArea area = new JTextArea("Write here");
        area.setPreferredSize(new Dimension(100,200));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        frame.add(area, BorderLayout.EAST);

        // JPanel
        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());
        center.setBackground(Color.LIGHT_GRAY);

        JLabel label = new JLabel("Enter text:");
        JTextField field = new JTextField(10);
        JButton submit = new JButton("Submit");

        center.add(label);
        center.add(field);
        center.add(submit);
        center.add(new JButton("first"));
        center.add(new JButton("second"));

        // popup windows
        //JOptionPane.showMessageDialog(frame,"Hello!", "Info", JOptionPane.INFORMATION_MESSAGE);
        String s = JOptionPane.showInputDialog(frame, "Enter name:", "name", JOptionPane.QUESTION_MESSAGE);
        System.out.println(s);
        area.setText(s);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = field.getText();
                JOptionPane.showMessageDialog(frame, text);
            }
        });




        frame.add(center);
        // Set it visible
        frame.setVisible(true);//default is false
        // on Mac this needs to be last thing called
        //while (true) JOptionPane.showMessageDialog(frame,"VIRUS!", "VIRRRRRUUUUUS", JOptionPane.ERROR_MESSAGE);
    }
}