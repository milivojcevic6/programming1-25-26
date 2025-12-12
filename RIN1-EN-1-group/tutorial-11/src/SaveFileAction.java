import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SaveFileAction implements ActionListener {
    Notepad parent;

    SaveFileAction(Notepad parent){
        this.parent = parent;
    }

//    @Override
//    public void actionPerformed(ActionEvent actionEvent) {
//        JFileChooser fileChooser =  new JFileChooser();
//        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
//        int option = fileChooser.showSaveDialog(parent);
//
//        if(option == JFileChooser.APPROVE_OPTION){
//            File file = fileChooser.getSelectedFile();
//
//            if(! file.getName().endsWith(".txt")){
//                file = new File(file.getAbsoluteFile() + ".txt");
//            }
//
//            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
//                writer.write(parent.textArea.getText());
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//    }

    // SIMPLE OPTION
    @Override
    public void actionPerformed(ActionEvent e) {
        String fileName = JOptionPane.showInputDialog(parent, "Enter file name");
        while (!fileName.endsWith(".txt")) {
            JOptionPane.showMessageDialog(parent, "File name must end with .txt", "Save", JOptionPane.WARNING_MESSAGE);
            fileName = JOptionPane.showInputDialog(parent, "Enter file name");
        }
//        // it is relative path so if you want to save somewhere else use absolute if dont know how to get there
//        // for downloads on mac: "/Users/ljeb/Downloads/"
//        String home = System.getProperty("user.home");
//        Path path = Paths.get(home, "Downloads", fileName);
        //try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile())) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String text = parent.textArea.getText();
            writer.write(text);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
