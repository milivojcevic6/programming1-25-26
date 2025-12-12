import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad extends JFrame {
    JTextArea textArea;
    JLabel charCount, wordCount;

    Notepad(){
        setTitle("Notepad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(800,800);
        setBounds(600,200,800,600);

        JPanel panel = new JPanel(new BorderLayout());

        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 30));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setSelectionColor(new Color(100, 200, 100));
        // ADD CARET LISTENER
        textArea.addCaretListener(e -> updateTextCount()); // actionPerformed(event) lambda expression
        // (parameters) -> {function/statements}

//        textArea.addCaretListener(e -> {
//            int dot = e.getDot(); // current positon
//            int mark = e.getMark(); // selection start
//
//            if(dot == mark){
//                System.out.println("Caret position: " + dot);
//            }else{
//                textArea.replaceSelection("anavolimilovana");
//            }
//
//
//        });
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);

        // stats panel
        JPanel statsPanel = new JPanel();
        charCount = new JLabel("Number of characters: 0");
        wordCount = new JLabel("Number of words: 0");

        statsPanel.add(charCount);
        statsPanel.add(wordCount);

        panel.add(statsPanel, BorderLayout.SOUTH);

        // create search bar
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JLabel searchLabel = new JLabel("Find:");
        JTextField searchField = new JTextField(10);
        JButton searchButton = new JButton("Find");

        // ADD ACTION LISTENER
        searchButton.addActionListener(e -> {
            String searchText = searchField.getText();

            if(!searchText.isEmpty()) {

                String text = textArea.getText();

                int startPosition = textArea.getSelectionEnd();

                int index = text.indexOf(searchText, startPosition);

                if(index < 0){
                    index = text.indexOf(searchText);
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

        // menu bar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        // add items
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        exitMenuItem.addActionListener(e -> System.exit(0));
        newMenuItem.addActionListener(e -> {
            dispose();
            new Notepad();
        });

        saveMenuItem.addActionListener(new SaveFileAction(this));
        openMenuItem.addActionListener(new OpenFileAction(this));


        // add them to file menu
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);


        menuBar.add(fileMenu);

        JMenu viewMenu = new JMenu("View");
        // add items
        JMenuItem zoomInMenuItem = new JMenuItem("Zoom In");
        JMenuItem zoomOutMenuItem = new JMenuItem("Zoom Out");
        JMenuItem clearAllMenuItem = new JMenuItem("Clear All");
        JMenuItem textColorMenuItem = new JMenuItem("Text Color");

        zoomInMenuItem.addActionListener(e -> adjustText(5));
        zoomOutMenuItem.addActionListener(e -> adjustText(-5));
        clearAllMenuItem.addActionListener(e -> textArea.setText(""));
        textColorMenuItem.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Choose text color", textArea.getForeground());
            textArea.setForeground(color);
        });

        viewMenu.add(zoomInMenuItem);
        viewMenu.add(zoomOutMenuItem);
        viewMenu.add(clearAllMenuItem);
        viewMenu.add(textColorMenuItem);

        menuBar.add(viewMenu);

        setJMenuBar(menuBar); // add it to frame

        add(panel);
        setVisible(true);
    }

    private void adjustText(int i) {
        Font font = textArea.getFont();
        int size = font.getSize() + i;
        // minimum 20 pixels font size
        size = Math.max(size, 20);
        size = Math.min(size, 60);

        textArea.setFont(new Font(font.getName(), font.getStyle(), size));
    }

    void updateTextCount() {
        String text = textArea.getText();

        wordCount.setText("Number of words: " + (text.isEmpty() ? 0 : text.split(" ").length));

        text = text.replaceAll(" ","").replaceAll("\n","");
        charCount.setText("Number of characters: " + text.length());
    }

}
