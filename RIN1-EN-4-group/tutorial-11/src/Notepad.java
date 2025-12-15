import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

public class Notepad extends JFrame{
    //JFrame frame;
    // fields
    JTextArea textArea;
    JLabel searchLabel, charCount, wordCount;
    JTextField searchField;
    JButton searchButton;

    // contractor
    Notepad(){
        setTitle("Notepad 1.0");
        //setSize(500,400);
        setBounds(750,300,500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 30));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setSelectionColor(new Color(100,200,100));
        // add action lister
        textArea.addCaretListener(e -> updateTextStats());
        // lambda expression
        // (parameters) -> funtion/{statements}
        // we can use it only with interfaces with just 1 (abstract) method
        // these are known as functional interfaces

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
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
        searchField = new JTextField(10);
        searchButton = new JButton("Find");

        searchButton.addActionListener(e -> {
            String text = textArea.getText();
            String searchString = searchField.getText();

            if(!searchString.isEmpty()){

                int selectionEnd = textArea.getSelectionEnd();

                int index = text.indexOf(searchString, selectionEnd);

                if(index < 0){
                    index = text.indexOf(searchString, 0);
                }

                if(index >= 0){
                    textArea.requestFocusInWindow();
                    textArea.select(index, index + searchString.length());
                }
            }
        });

        topPanel.add(searchLabel);
        topPanel.add(searchField);
        topPanel.add(searchButton);

        add(topPanel,BorderLayout.NORTH);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        // Menu
        JMenu file = new JMenu("File");
        JMenu view = new JMenu("View");

        // add menu items to menus
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
        JMenuItem colorChange = new JMenuItem("Text Color");

        clearAll.addActionListener(e -> textArea.setText(""));
        zoomIn.addActionListener(e -> adjustTextSize(5));
        zoomOut.addActionListener(e -> adjustTextSize(-5));
        colorChange.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Choose a color for text", textArea.getForeground());
            textArea.setForeground(color);

        });

        view.add(clearAll);
        view.add(zoomIn);
        view.add(zoomOut);
        view.add(colorChange);


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

        // font cant be < 25 or bigger than 45
        size = Math.max(25, size);
        size = Math.min(45, size);

        textArea.setFont(new Font(font.getName(), font.getStyle(), size));
    }

    private void updateTextStats() {
        String text = textArea.getText();
        // get words
        //text.split(" ");
        int emptyCount = 0;
        String [] words = text.split(" ");
        for (int i = 0; i < words.length; i++){
            if(words[i].equals("")) emptyCount++;
        }

        wordCount.setText("Number of words: " + (text.isEmpty() ? 0 : words.length - emptyCount));

        text = text.replaceAll(" ", "").replaceAll("\n","");
        charCount.setText("Number of characters: " + text.length());
    }

}
