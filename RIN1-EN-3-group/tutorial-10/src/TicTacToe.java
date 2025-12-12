import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    JFrame frame;
    JButton [][] buttons = new JButton[3][3];
    String currentSign = "X";
    JLabel status;
    JButton newGame;
    Font font = new Font("Serif", Font.BOLD, 40);

    TicTacToe(){
        frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,900);
        // gridPanel

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3,3));

        // buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground(Color.white);
                buttons[i][j].addActionListener(new ButtonPressed(this, i, j));
                gridPanel.add(buttons[i][j]);
            }

        }
        frame.add(gridPanel, BorderLayout.CENTER);

        // status label
        status = new JLabel("X turn");
        status.setFont(font);
        status.setHorizontalAlignment(JLabel.CENTER);
        status.setForeground(Color.blue);
        status.setBackground(Color.yellow);
        // some elements in Swing have transparetn background
        // to solve this
        status.setOpaque(true);

        // new game button
        newGame = new JButton("New Game");

        frame.add(newGame, BorderLayout.SOUTH);
        newGame.setBackground(Color.yellow);
        newGame.setFont(font);
        newGame.addActionListener(new ButtonPressed(this, -1,-1));



        frame.add(status, BorderLayout.NORTH);

        frame.setVisible(true);
    }

    void checkIfDone(){
        for (int i = 0; i < 3; i++) {
            // rows
            if(checkThreeButtons(buttons[i][0], buttons[i][1],buttons[i][2])){
                win(buttons[i][0], buttons[i][1],buttons[i][2]);
                return;
            }

            // cols
            if(checkThreeButtons(buttons[0][i], buttons[1][i],buttons[2][i])){
                win(buttons[0][i], buttons[1][i],buttons[2][i]);
                return;
            }
        }
        // diagonals
        if(checkThreeButtons(buttons[0][0], buttons[1][1],buttons[2][2])){
            win(buttons[0][0], buttons[1][1],buttons[2][2]);
            return;
        }
        if(checkThreeButtons(buttons[2][0], buttons[1][1],buttons[0][2])){
            win(buttons[2][0], buttons[1][1],buttons[0][2]);
            return;
        }

        // check for draw
        boolean isDraw = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(buttons[i][j].isEnabled()){
                    isDraw = false;
                    break;
                }
            }
        }
        if(isDraw) {
            status.setText("DRAW");
            status.setForeground(Color.darkGray);
        }

    }

    boolean checkThreeButtons(JButton a, JButton b, JButton c){
        return !a.isEnabled() &&
                a.getText().equals(b.getText())
                && a.getText().equals(c.getText());
    }

    void win(JButton a, JButton b, JButton c) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }

        status.setText(a.getText() + " WON");
        status.setForeground(a.getText().equals("X") ? Color.BLUE : Color.RED);

        // color winning buttons green
        a.setBackground(Color.green);
        b.setBackground(Color.green);
        c.setBackground(Color.green);




    }


    public static void main(String[] args) {
        new TicTacToe(); // start the game
    }
}
