import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // GUI - Graphical User Interface
        JFrame frame = new JFrame();
        frame.setTitle("MyFirstFrame");
        frame.setSize(800,800);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // default layout for frame is BorderLayout
        // NORTH; SOUTH; EAST; WEST; CENTER

        JButton upperMenu = new JButton("Upper menu");
        frame.add(upperMenu, BorderLayout.NORTH);

        JCheckBox checkBox = new JCheckBox("CheckBox");
        frame.add(checkBox, BorderLayout.EAST);
        checkBox.setBackground(new Color(200,0,255));

        JRadioButton radio = new JRadioButton("RadioButton");
        frame.add(radio, BorderLayout.WEST);
        radio.setBackground(new Color(200,100,255));

//        JTextArea textArea = new JTextArea(200, 200);
//        textArea.setPreferredSize(new Dimension(200,200));
//
//        frame.add(textArea, BorderLayout.SOUTH);

        // JPanel
        JPanel center = new JPanel(); // default layout is FlowLayout
        center.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter text:");
        JTextField field = new JTextField(10);
        JButton submit = new JButton("Submit");
        JButton first = new JButton("First");
        JButton second = new JButton("Second");
        first.setBackground(Color.cyan);
        second.setForeground(Color.red);


        center.add(label);
        center.add(field);
        center.add(submit);
        center.add(first);
        center.add(second);

        //JOptionPane.showMessageDialog(frame, "ERROR" ,"Error title", JOptionPane.QUESTION_MESSAGE);
        System.out.println(JOptionPane.showInputDialog("Enter text:"));


        frame.add(center, BorderLayout.CENTER);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = field.getText();
                JOptionPane.showMessageDialog(frame, "You entered: " + text);
            }
        });


        frame.setVisible(true);// needs to be at the end for macbook

    }
}