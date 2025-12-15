import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

public class Notepad extends JFrame {
    //JFrame frame;
    // fields
    JTextArea textArea;
    JTextField searchField;
    JLabel searchLabel, wordCount, charCount;
    JButton searchButton;
    JMenuBar menuBar;

    // constructor
    public Notepad(){
        setTitle("Notepad v0.1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(500,500);
        setBounds(750,400,500,300);

        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced",Font.PLAIN, 30));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setSelectionColor(new Color(100,200,100));
        textArea.setCaretColor(new Color(12, 70, 12));
        // add action listener
        textArea.addCaretListener(e -> updateTextStats());
        // lambda expressions
        // (params) -> functions/{statements}
        // it can be used only with interfaces with only 1 method
        // funtional interfaces

        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane);

        // stats panel
        JPanel statsPanel = new JPanel();
        charCount = new JLabel("Number of characters: 0");
        wordCount = new JLabel("Number of words: 0");

        statsPanel.add(charCount);
        statsPanel.add(wordCount);

        add(statsPanel,BorderLayout.SOUTH);

        // top panel
        JPanel topPanel =  new JPanel(new FlowLayout(FlowLayout.RIGHT));

        searchLabel = new JLabel("Find:");
        searchField = new JTextField(10);
        searchButton = new JButton("FIND");

        searchButton.addActionListener(e -> {
            String text = textArea.getText();
            String searchPattern = searchField.getText();

            if(!searchPattern.isEmpty()){
                int selectionEnd = textArea.getSelectionEnd();
                int index = text.indexOf(searchPattern,selectionEnd);

                if(index < 0){
                    index = text.indexOf(searchPattern,0);
                }

                if(index >= 0){
                    textArea.requestFocusInWindow();
                    textArea.select(index, index + searchPattern.length());
                }

            }
        });

        topPanel.add(searchLabel);
        topPanel.add(searchField);
        topPanel.add(searchButton);

        add(topPanel,BorderLayout.NORTH);

        // add menu bar
        menuBar = new JMenuBar();

        // create menus
        JMenu file = new JMenu("File");
        JMenu view = new JMenu("View");

        // add items
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        exit.addActionListener(e -> System.exit(0));
        newFile.addActionListener(e -> {
            dispose();
            new Notepad();
        });
        save.addActionListener(new SaveFileAction(this));
        open.addActionListener(new OpenFileAction(this));

        file.add(newFile);
        file.add(save);
        file.add(open);
        file.addSeparator();
        file.add(exit);

        JMenuItem clearAll = new JMenuItem("Clear Text");
        JMenuItem zoomIn = new JMenuItem("Zoom In");
        JMenuItem zoomOut = new JMenuItem("Zoom Out");
        JMenuItem changeColor = new JMenuItem("Text Color");

        // add action listeners to items
        clearAll.addActionListener(e -> textArea.setText(""));
        zoomIn.addActionListener(e -> adjustTextSize(5));
        zoomOut.addActionListener(e -> adjustTextSize(-5));
        changeColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this,"Choose text color", textArea.getForeground());
            textArea.setForeground(color);
        });

        view.add(clearAll);
        view.add(zoomIn);
        view.add(zoomOut);
        view.add(changeColor);


        // add menus
        menuBar.add(file);
        menuBar.add(view);


        // set menu bar
        setJMenuBar(menuBar);

        setVisible(true);
    }

    private void adjustTextSize(int i) {
        Font font = textArea.getFont();
        int size = font.getSize() + i;

        // < 25 or > 45 is not allowed
        size = Math.max(25,size);
        size = Math.min(45, size);

        textArea.setFont(new Font(font.getName(), font.getStyle(), size));
    }

    private void updateTextStats() {
        String text = textArea.getText();
        String [] words = text.split(" ");
        int countEmpty = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].isEmpty()) countEmpty++;
        }

        wordCount.setText("Number of words: " + (text.isEmpty() ? 0 : words.length - countEmpty));

        text = text.replaceAll(" ","").replaceAll("\n","");
        charCount.setText("Number of characters: " + text.length());
    }
}
