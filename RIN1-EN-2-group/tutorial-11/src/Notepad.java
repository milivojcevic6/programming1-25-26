import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.nio.file.OpenOption;

public class Notepad extends JFrame {
    JTextArea textArea;
    JLabel charCount, wordCount, searchLabel;
    JButton searchButton;
    JTextField searchField;
    Notepad(){
        setTitle("Notepad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(800,900);
        setBounds(700, 300, 500, 400);

        JPanel panel = new JPanel(new BorderLayout());

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 30));
        textArea.setSelectionColor(new Color(100,200,100));
        // add caret listener
        textArea.addCaretListener(e -> updateTextStats()); // we can use lambda expressions when we have
        // interface with only 1 abstract method (functional interface)
        // (parameters) -> {function/statements}
//        textArea.addCaretListener(e -> {
//            int dot = e.getDot(); // current position
//            int mark = e.getMark(); // start position of selection
//
//            if(dot == mark){
//                System.out.println("Caret move to position "+ dot);
//            }else{
//                textArea.replaceSelection("CAT");
//            }
//
//        });

        JScrollPane scrollPane = new JScrollPane(textArea);

        panel.add(scrollPane);
        add(panel);

        // lower panel for stats
        JPanel statsPanel = new JPanel();
        charCount = new JLabel("Number of characters: 0");
        wordCount = new JLabel("Number of words: 0");

        statsPanel.add(charCount);
        statsPanel.add(wordCount);
        add(statsPanel, BorderLayout.SOUTH);

        // topPanel

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        searchLabel = new JLabel("Find:");
        searchField = new JTextField(10);
        searchButton = new JButton("Find");
        searchButton.addActionListener(e -> {
            String text = textArea.getText();
            String searchText = searchField.getText();

            if(!searchText.isEmpty()){
                int startIndex = textArea.getSelectionEnd();
                int index = text.indexOf(searchText, startIndex);

                if(index < 0){
                    index = text.indexOf(searchText,0);
                }

                if(index >= 0){
                    textArea.requestFocusInWindow();
                    textArea.select(index, index + searchText.length());
                }
            }
        });

        topPanel.add(searchLabel);
        topPanel.add(searchField);
        topPanel.add(searchButton);

        add(topPanel, BorderLayout.NORTH);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        // menus
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        JMenu viewMenu = new JMenu("View");
        viewMenu.setMnemonic(KeyEvent.VK_V);
        // add menuitems to menus
        JMenuItem newItem  = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));
        newItem.addActionListener(e -> {
            if(textArea.getText().isEmpty()) {
                dispose();
                new Notepad();
            }else{
                int choice = JOptionPane.showConfirmDialog(this, "Do you want to save before exiting?","Save", JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION){
                    new SaveFileAction(this).actionPerformed(e);
                    dispose();
                    new Notepad();
                }else{
                    dispose();
                    new Notepad();
                }
            }
        });
        saveItem.addActionListener(new SaveFileAction(this));
        openItem.addActionListener(new OpenFileAction(this));

        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);


        JMenuItem clearAllItem  = new JMenuItem("ClearAll");
        JMenuItem zoomInItem = new JMenuItem("ZoomIn");
        zoomInItem.setMnemonic(KeyEvent.VK_I);

        JMenuItem zoomOutItem = new JMenuItem("ZoomOut");
        zoomOutItem.setMnemonic(KeyEvent.VK_O);
        JMenuItem changeColorItem = new JMenuItem("ChangeTextColor");

        clearAllItem.addActionListener(e -> textArea.setText(""));
        zoomInItem.addActionListener(e -> updateTextSize(5));
        zoomOutItem.addActionListener(e -> updateTextSize(-5));
        changeColorItem.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Choose text color", textArea.getForeground());
            textArea.setForeground(color);
        });

        viewMenu.add(clearAllItem);
        viewMenu.add(zoomInItem);
        viewMenu.add(zoomOutItem);
        viewMenu.add(changeColorItem);


        // add menus to menubar
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);

        // add menu bar to frame
        setJMenuBar(menuBar);

        setVisible(true);
    }

    private void updateTextSize(int i) {
        Font font = textArea.getFont();
        int size = font.getSize() + i;
        // we dont allow text size < 20 and > 50
        size = Math.max(size, 20);
        size = Math.min(size, 50);

        textArea.setFont(new Font(font.getName(), font.getStyle(), size));
    }

    private void updateTextStats() {
        String text = textArea.getText();
        wordCount.setText("Number of words: " + (text.isEmpty() ? 0 : text.split(" ").length));

        text = text.replaceAll(" ","").replaceAll("\n","");
        charCount.setText("Number of characters: " + text.length());
    }
}
