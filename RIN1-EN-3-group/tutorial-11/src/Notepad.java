import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;

public class Notepad extends JFrame {
    // fields
    JTextArea textArea;
    JTextField searchField;
    JButton searchButton;
    JLabel charCount, wordCount, searchLabel;

    Notepad(){
        setTitle("Notepad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(400,600);
        setBounds(750,200,400,500);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Monospaced",Font.PLAIN,30));
        textArea.setSelectionColor(new Color(100, 200, 100));
        textArea.addCaretListener(e -> updateStats());


        JScrollPane scrollPane = new JScrollPane(textArea);


        add(scrollPane);

        // stats panel
        JPanel statsPanel = new JPanel();
        charCount = new JLabel("Number of characters: 0");
        wordCount = new JLabel("Number of words: 0");

        statsPanel.add(charCount);
        statsPanel.add(wordCount);

        add(statsPanel, BorderLayout.SOUTH);

        // top panel
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        searchLabel = new JLabel("Find:");
        searchButton = new JButton("Find");
        searchField = new JTextField(10);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textArea.getText();
                String searchString = searchField.getText();

                if(!searchString.isEmpty()){

                    int startPosition = textArea.getSelectionEnd();

                    int index = text.indexOf(searchString, startPosition);

                    if(index < 0){
                        index = text.indexOf(searchString, 0);
                    }

                    if(index >= 0){
                        textArea.requestFocusInWindow();
                        textArea.select(index, index + searchString.length());
                    }
                }
            }
        });

        // ADD ACTION LISTENER

        topPanel.add(searchLabel);
        topPanel.add(searchField);
        topPanel.add(searchButton);

        add(topPanel, BorderLayout.NORTH);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        //Menu
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        viewMenu.setMnemonic(KeyEvent.VK_V);


        // add menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        // add action listeners
        newItem.addActionListener(e -> {
            if(textArea.getText().isEmpty()){
                dispose();
                new Notepad();
            }else {
                int choice = JOptionPane.showConfirmDialog(this, "Do you want to save?", "Save", JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION){
                    new SaveFileAction(this).actionPerformed(e);
                }
                dispose();
                new Notepad();

            }


        });
        exit.addActionListener(e -> System.exit(0));
        save.addActionListener(new SaveFileAction(this));
        open.addActionListener(new OpenFileAction(this));

        fileMenu.add(newItem);
        fileMenu.add(save);
        fileMenu.add(open);
        fileMenu.add(exit);

        JMenuItem clearAll = new JMenuItem("Clear Text");
        JMenuItem zoomIn = new JMenuItem("Zoom In");
        JMenuItem zoomOut = new JMenuItem("Zoom Out");
        JMenuItem textColor = new JMenuItem("Text Color");

        clearAll.setMnemonic(KeyEvent.VK_C);
        zoomIn.setMnemonic(KeyEvent.VK_Z);
        zoomOut.setMnemonic(KeyEvent.VK_O);
        textColor.setMnemonic(KeyEvent.VK_T);


        // add action listeners to menu items
        clearAll.addActionListener(e -> textArea.setText(""));
        // lambda expressions allows us to use anonymous functions
        // (parameters) -> function(parameters or empty)
        // applicable to interfaces with just 1 abstract method
        // also known as functional interfaces
        zoomIn.addActionListener(e -> changeTextSize(5));
        zoomOut.addActionListener(e -> changeTextSize(-5));
        textColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Choose text color", textArea.getForeground());
            textArea.setForeground(color);
        });

        viewMenu.add(clearAll);
        viewMenu.add(zoomIn);
        viewMenu.add(zoomOut);
        viewMenu.add(textColor);
        // add menus to menubar
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        // set menu
        setJMenuBar(menuBar);
        setVisible(true);
    }

    private void updateStats() {
        String text = textArea.getText();
        wordCount.setText("Number of words: " + (text.isEmpty() ? 0 : text.split(" ").length));

        text = text.replaceAll(" ","").replaceAll("\n","");
        charCount.setText("Number of characters: " + text.length());
    }

    private void changeTextSize(int i) {
        Font font = textArea.getFont();
        int size = font.getSize() + i;
        // we dont allow size < 20 and > 50
        size = Math.max(20, size);
        size = Math.min(50, size);

        textArea.setFont(new Font(font.getName(), font.getStyle(), size));
    }

}
