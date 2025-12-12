import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SaveFileAction implements ActionListener {
    Notepad notepad;

    SaveFileAction(Notepad notepad) {
        this.notepad = notepad;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files Only", "txt"));

        int option = fileChooser.showSaveDialog(notepad);

        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            if (!file.getName().endsWith(".txt")) {
                file = new File(file.getAbsolutePath() + ".txt");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(notepad.textArea.getText());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
    // SIMPLE OPTION
 //   @Override
//    public void actionPerformed(ActionEvent e) {
//        String fileName = JOptionPane.showInputDialog(notepad, "Enter file name");
//        while (!fileName.endsWith(".txt")) {
//            JOptionPane.showMessageDialog(notepad, "File name must end with .txt", "Save", JOptionPane.WARNING_MESSAGE);
//            fileName = JOptionPane.showInputDialog(notepad, "Enter file name");
//        }
////        // it is relative path so if you want to save somewhere else use absolute if dont know how to get there
////        // for downloads on mac: "/Users/ljeb/Downloads/"
////        String home = System.getProperty("user.home");
////        Path path = Paths.get(home, "Downloads", fileName);
//        //try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile())) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
//            String text = notepad.textArea.getText();
//            writer.write(text);
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//}
