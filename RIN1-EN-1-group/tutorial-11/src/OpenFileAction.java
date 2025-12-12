import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OpenFileAction implements ActionListener {
    Notepad parent;

    OpenFileAction(Notepad parent){
        this.parent = parent;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // simple load
        String fileName = JOptionPane.showInputDialog("Enter file name");
        while (!fileName.endsWith(".txt")) {
            JOptionPane.showMessageDialog(parent, "File name must end with .txt", "Save", JOptionPane.WARNING_MESSAGE);
            fileName = JOptionPane.showInputDialog(parent, "Enter file name");
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String text = "";

            while((text = reader.readLine()) != null){
                parent.textArea.setText(parent.textArea.getText() + text + "\n");
            }
        }catch (Exception ex){
            if(ex instanceof FileNotFoundException){
                JOptionPane.showMessageDialog(null,"File not found");
            }
        }
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setFileFilter( new FileNameExtensionFilter( "Text Files", "txt"));
//        int option = fileChooser.showOpenDialog(parent);
//        if (option == JFileChooser.APPROVE_OPTION) {
//            File file = fileChooser.getSelectedFile();
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String text = "";
//                while ((text = reader.readLine()) != null) {
//                    parent.textArea.setText(parent.textArea.getText() + text + "\n");
//                }
//
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }

    }


}
