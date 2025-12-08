import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        //GUI - Graphical User Interface
        JFrame frame = new JFrame();
        frame.setTitle("First JFrame");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Default layout for frame is border layout
        JButton upperMenu = new JButton("Upper menu");
        frame.add(upperMenu, BorderLayout.NORTH);

        JCheckBox checkBox = new JCheckBox("CheckBox");
        frame.add(checkBox, BorderLayout.SOUTH);

        JRadioButton radio = new JRadioButton("RadioButton");
        frame.add(radio, BorderLayout.WEST);

        JTextArea textArea = new JTextArea("Write here!",20,30);
        textArea.setPreferredSize(new Dimension(30,200));
        textArea.setLineWrap(true);

        frame.add(textArea, BorderLayout.EAST);

        //JPanel - conatainer that can hold other elements
        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter text:");
        JTextField textField = new JTextField(10);
        JButton submit = new JButton("Submit");

        JButton first = new JButton("First");
        JButton second = new JButton("Second");

        //center.setBackground(Color.yellow);
        center.setBackground(new Color(200,0,100));
        center.add(label);
        center.add(textField);
        center.add(submit);
        center.add(first);
        center.add(second);

        frame.add(center, BorderLayout.CENTER);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                JOptionPane.showMessageDialog(frame, "You have entered: " + text);
            }
        });

        //JOptionPane.showMessageDialog(frame, "Hello!", "Info",JOptionPane.ERROR_MESSAGE);
        String s = JOptionPane.showInputDialog("Enter text!"); // user input
        System.out.println(s);


        frame.setVisible(true); // put this at the end




    }
}