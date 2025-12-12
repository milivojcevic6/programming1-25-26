import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    JFrame frame;
    JButton [][] buttons = new JButton[3][3]; // playing grid
    String currentSign  = "X";
    JLabel status;
    JButton newGame;

    public TicTacToe(){
        frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);

        JPanel gameGrid = new JPanel();
        gameGrid.setLayout(new GridLayout(3,3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(new ButtonPressed(this, i,j));
                buttons[i][j].setBackground(Color.white);
                gameGrid.add(buttons[i][j]);
            }
        }

        status = new JLabel("X turn");
        currentSign = "X";
        Font font  = new Font("Serif", Font.BOLD, 40);
        status.setFont(font);
        status.setForeground(Color.blue);
        status.setBackground(Color.lightGray);
        status.setOpaque(true); // many components in Swing have transparent
        // background so we need to specify that we want to see backgorund color
        status.setHorizontalAlignment(JLabel.CENTER);
        //status.setVerticalAlignment(JLabel.CENTER);
        // new game button
        newGame = new JButton("New Game");
        newGame.setBackground(Color.lightGray);
        newGame.setFont(font);
        newGame.addActionListener(new ButtonPressed(this, -1,-1));

        // adding things to the frame
        frame.add(newGame, BorderLayout.SOUTH);
        frame.add(status, BorderLayout.NORTH);
        frame.add(gameGrid, BorderLayout.CENTER);
        frame.setVisible(true);

    }

    public void checkIfDone(){
        for (int i = 0; i < 3; i++) {
            // rows
            if(checkThree(buttons[i][0],buttons[i][1],buttons[i][2])){
                win(buttons[i][0],buttons[i][1],buttons[i][2]);
                return;
            }
            // cols
            if(checkThree(buttons[0][i],buttons[1][i],buttons[2][i])){
                win(buttons[0][i],buttons[1][i],buttons[2][i]);
                return;
            }
        }

        // diagonals
        // main
        if(checkThree(buttons[0][0],buttons[1][1], buttons[2][2])){
            win(buttons[0][0],buttons[1][1], buttons[2][2]);
            return;
        }
        //alternative
        if(checkThree(buttons[0][2],buttons[1][1], buttons[2][0])){
            win(buttons[0][2],buttons[1][1], buttons[2][0]);
            return;
        }

        // check for draw
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
            status.setText("DRAW!");
            status.setForeground(Color.orange);
        }

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

        // change status
        status.setText("WINNER: "+ a.getText());
        status.setForeground(a.getText().equals("X") ? Color.BLUE : Color.RED);
    }

    public boolean checkThree(JButton a, JButton b, JButton c){
        return !a.getText().isEmpty() &&
                a.getText().equals(b.getText()) &&
                a.getText().equals(c.getText());
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
