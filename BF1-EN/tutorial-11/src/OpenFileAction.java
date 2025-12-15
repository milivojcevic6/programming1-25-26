import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OpenFileAction implements ActionListener {
    Notepad notepad;

    OpenFileAction(Notepad notepad){
        this.notepad = notepad;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Please select txt file","txt"));

        int choice = fileChooser.showOpenDialog(notepad);

        if(choice == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String text  = "";
                while ((text = reader.readLine()) != null){
                    String currentText = notepad.textArea.getText();
                    notepad.textArea.setText(currentText + text + "\n");
                }
            }catch (IOException ex){
                throw new RuntimeException();
            }
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
