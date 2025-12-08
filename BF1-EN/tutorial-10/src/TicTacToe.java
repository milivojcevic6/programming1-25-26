import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    JFrame frame;
    JButton[][] buttons = new JButton[3][3];
    String currentSign = "X";
    JLabel status;
    JButton newGame;

    public TicTacToe(){
        frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        //frame.setResizable(false);
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3));

        // create button
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground(Color.white);
                buttons[i][j].addActionListener(new ButtonPressed(this, i, j));
                center.add(buttons[i][j]);
            }
        }

        status = new JLabel();
        status.setText("X turn");
        Font font =  new Font("Serif", Font.BOLD, 40);
        status.setFont(font);
        status.setHorizontalAlignment(JLabel.CENTER);
        status.setForeground(Color.blue);
        status.setBackground(Color.lightGray);
        status.setOpaque(true);


        newGame = new JButton("New Game");
        newGame.setBackground(Color.lightGray);
        newGame.setFont(font);
        newGame.addActionListener(new ButtonPressed(this, -1, -1));


        frame.add(newGame, BorderLayout.SOUTH);
        frame.add(status, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void checkForWinner(){
        // rows and columns
        for (int i = 0; i < 3; i++) {
            //rows
            if(checkThreeButtons(buttons[i][0], buttons[i][1],buttons[i][2])){
                win(buttons[i][0], buttons[i][1],buttons[i][2]);
                return;
            }
            //cols
            if(checkThreeButtons(buttons[0][i], buttons[1][i],buttons[2][i])){
                win(buttons[0][i], buttons[1][i],buttons[2][i]);
                return;
            }
        }

        // diagonals
        // main diagonal
        if(checkThreeButtons(buttons[0][0], buttons[1][1], buttons[2][2])){
            win(buttons[0][0], buttons[1][1], buttons[2][2]);
            return;
        }
        // alternative diagonal
        if(checkThreeButtons(buttons[0][2], buttons[1][1], buttons[2][0])){
            win(buttons[0][2], buttons[1][1], buttons[2][0]);
            return;
        }

        boolean isDraw = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(buttons[i][j].getText().isEmpty()){
                    isDraw = false;
                    break;
                }
            }

        }

        if(isDraw){
            status.setText("Draw!");
            status.setForeground(Color.yellow);
        }



    }

    public boolean checkThreeButtons(JButton a, JButton b, JButton c){
        return !a.getText().isEmpty() &&
                a.getText().equals(b.getText())
                && a.getText().equals(c.getText());
    }

    public void win(JButton a, JButton b, JButton c){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
        a.setBackground(Color.green);
        b.setBackground(Color.green);
        c.setBackground(Color.green);
        status.setText(a.getText() + " WON");
        status.setForeground(a.getText().equals("X") ? Color.blue : Color.red);
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
