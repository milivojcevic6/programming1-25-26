import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class OpenFileAction implements ActionListener {
    Notepad notepad;

    OpenFileAction(Notepad notepad) {
        this.notepad = notepad;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files Only", "txt"));

        int option = fileChooser.showOpenDialog(notepad);

        if(option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String text = "";
                while ((text = reader.readLine()) != null){
                    String currentText = notepad.textArea.getText();
                    notepad.textArea.setText(currentText + text + "\n");
                }
            }catch (Exception ex){
               ex.printStackTrace();
            }
        }
        // simple load
//            String fileName = JOptionPane.showInputDialog("Enter file name");
//            while (!fileName.endsWith(".txt")) {
//                JOptionPane.showMessageDialog(notepad, "File name must end with .txt", "Save", JOptionPane.WARNING_MESSAGE);
//                fileName = JOptionPane.showInputDialog(notepad, "Enter file name");
//            }
//            try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
//                String text = "";
//
//                while((text = reader.readLine()) != null){
//                    notepad.textArea.setText(notepad.textArea.getText() + text + "\n");
//                }
//            }catch (Exception ex){
//                if(ex instanceof FileNotFoundException){
//                    JOptionPane.showMessageDialog(null,"File not found");
//                }
//            }
    }
}
