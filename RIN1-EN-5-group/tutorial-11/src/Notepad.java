import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad extends JFrame {
    // fields
    JTextArea textArea;
    JLabel charCount, wordCount, searchLabel;
    JTextField searchField;
    JButton searchButton;

    Notepad(){
        setTitle("Best Notepad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(400,400);
        setBounds(800,200,400,400);

        // textArea
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setSelectionColor(new Color(100,200,100));
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 30));

        // add caret listener
        textArea.addCaretListener(e -> updateTextStats());
        // lambda expression - helps us create anonymous functions
        // it can be used only with interfaces with 1 abstract method
        // also known as functional interfaces
        // (parameters) -> function()

        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane); // default is center
        //stats panel
        JPanel statsPanel = new JPanel();
        charCount = new JLabel("Number of characters: 0");
        wordCount = new JLabel("Number of words: 0");

        statsPanel.add(charCount);
        statsPanel.add(wordCount);

        add(statsPanel,BorderLayout.SOUTH);

        // top panel
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        searchLabel = new JLabel("Find:");
        searchField = new JTextField(10);
        searchButton = new JButton("Search");

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

        topPanel.add(searchLabel);
        topPanel.add(searchField);
        topPanel.add(searchButton);

        add(topPanel, BorderLayout.NORTH);

        // Menu bar

        JMenuBar menuBar = new JMenuBar();

        // Menus
        JMenu file = new JMenu("File");
        JMenu view = new JMenu("View");

        // Menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        exit.addActionListener(e -> System.exit(0));
        newItem.addActionListener(e -> {
            dispose();
            new Notepad();
        });

        save.addActionListener(new SaveFileAction(this));
        open.addActionListener(new OpenFileAction(this));


        // add items to file menu
        file.add(newItem);
        file.add(save);
        file.add(open);
        file.addSeparator();
        file.add(exit);

        JMenuItem clear = new JMenuItem("Clear All");
        JMenuItem zoomIn = new JMenuItem("Zoom In");
        JMenuItem zoomOut = new JMenuItem("Zoom Out");
        JMenuItem colorItem = new JMenuItem("Text Color");

        clear.addActionListener(e -> textArea.setText(""));
        colorItem.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Choose color for text", textArea.getForeground());
            textArea.setForeground(color);
        });
        zoomIn.addActionListener(e -> adjustTextSize(5));
        zoomOut.addActionListener(e -> adjustTextSize(-5));

        // add items to view menu
        view.add(clear);
        view.add(zoomIn);
        view.add(zoomOut);
        view.add(colorItem);


        // Add menus to menubar
        menuBar.add(file);
        menuBar.add(view);

        // add menu bar to frame
        setJMenuBar(menuBar);


        setVisible(true);
    }

    private void adjustTextSize(int i) {
        Font font = textArea.getFont();
        int size = font.getSize() + i;

        // size < 20 and > 50 is not allowed
        size = Math.max(20,size);
        size = Math.min(50,size);


        textArea.setFont(new Font(font.getName(), font.getStyle(), size));
    }

    private void updateTextStats() {
        String text = textArea.getText();
        wordCount.setText("Number of words: " + (text.isEmpty() ? 0 : text.split(" ").length));

        text = text.replaceAll(" ","").replaceAll("\n","");
        charCount.setText("Number of characters: "+ text.length());
    }
}
