import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // On macOS Swing UI elements sometimes ignore color settings unless this is set
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        // NOTEPAD APP
        new Notepad();
    }
}