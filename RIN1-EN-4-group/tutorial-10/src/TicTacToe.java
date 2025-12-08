import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    JFrame frame;
    String currentSign;
    JButton [][] buttons = new JButton[3][3];
    JLabel status;
    JButton newGame;

    public TicTacToe(){
        frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setResizable(false);

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3));

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground(Color.white);
                buttons[i][j].addActionListener(new ButtonPressed(this));
                center.add(buttons[i][j]);
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

        frame.add(status,BorderLayout.NORTH);


        frame.add(center);

        newGame = new JButton("New Game");
        newGame.setFont(font);
        newGame.setBackground(Color.lightGray);
        newGame.addActionListener(new ButtonPressed(this));


        frame.add(newGame, BorderLayout.SOUTH);

        frame.setVisible(true);

    }

    public void checkIfWinner(){
        // check rows and columns
        for (int i = 0; i < 3; i++) {
            // rows
            if(threeEqual(buttons[i][0], buttons[i][1], buttons[i][2])){
                win(buttons[i][0], buttons[i][1], buttons[i][2]);
                return;
            }
            // columns
            if(threeEqual(buttons[0][i], buttons[1][i], buttons[2][i])){
                win(buttons[0][i], buttons[1][i], buttons[2][i]);
                return;
            }
        }

        // diagonals
        if(threeEqual(buttons[0][0], buttons[1][1], buttons[2][2])){
            win(buttons[0][0], buttons[1][1], buttons[2][2]);
            return;
        }

        if(threeEqual(buttons[2][0], buttons[1][1], buttons[0][2])){
            win(buttons[2][0], buttons[1][1], buttons[0][2]);
            return;
        }

        // check for draw
        boolean isDraw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(buttons[i][j].getText().isEmpty()) {
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
    public void win(JButton a, JButton b, JButton c){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }

        }
        a.setBackground(Color.green);
        b.setBackground(Color.green);
        c.setBackground(Color.green);

        status.setText("We have a winner: " + a.getText());
        status.setForeground(a.getText().equals("X") ? Color.blue : Color.red);
    }

    boolean threeEqual(JButton a, JButton b, JButton c){
        return !a.getText().isEmpty() &&
                a.getText().equals(b.getText()) &&
                a.getText().equals(c.getText());
    }


    public static void main(String[] args) {
        new TicTacToe();
    }
}
