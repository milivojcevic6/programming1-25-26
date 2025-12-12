import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    JFrame frame;
    JButton [][] buttons = new JButton[3][3];
    String currentSign = "X";
    JLabel status;
    JButton newGame;

    public TicTacToe(){
        frame = new JFrame("TicTacToe");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel gameGrid = new JPanel();
        gameGrid.setLayout(new GridLayout(3,3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground(Color.white);
                buttons[i][j].addActionListener(new ButtonPressed(this, i, j));
                gameGrid.add(buttons[i][j]);
            }
        }

        // status label
        status = new JLabel("X turn");
        Font font = new Font("Serif", Font.BOLD, 40);
        status.setFont(font);
        status.setHorizontalAlignment(JLabel.CENTER);
        status.setBackground(Color.lightGray);
        status.setOpaque(true); // a lot of elements of Swing have transparent background
        // setOpaque makes them use the color
        status.setForeground(Color.blue);
        frame.add(status, BorderLayout.NORTH);

        // new game button
        newGame = new JButton("New Game");
        newGame.setBackground(Color.lightGray);
        newGame.setFont(font);
        newGame.addActionListener(new ButtonPressed(this, -1, -1));
        frame.add(newGame, BorderLayout.SOUTH);



        frame.add(gameGrid, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void checkIfDone(){

        for (int i = 0; i < 3; i++) {
            // rows
            if(checkThree(buttons[i][0],buttons[i][1],buttons[i][2])){
                win(buttons[i][0],buttons[i][1],buttons[i][2]);
            }
            // cols
            if(checkThree(buttons[0][i],buttons[1][i],buttons[2][i])){
                win(buttons[0][i],buttons[1][i],buttons[2][i]);
            }
        }

        // diagonals
        //main
        if(checkThree(buttons[0][0],buttons[1][1],buttons[2][2])){
            win(buttons[0][0],buttons[1][1],buttons[2][2]);
        }
        //alternative
        if(checkThree(buttons[0][2],buttons[1][1],buttons[2][0])){
            win(buttons[0][2],buttons[1][1],buttons[2][0]);
        }

        // check for draw
        boolean isDraw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(buttons[i][j].getText().isEmpty()){
                    isDraw = false;
                }
            }
        }

        if(isDraw){
            status.setText("Draw!");
            status.setForeground(new Color(200,0,200));
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

        status.setText(a.getText() + " WON!!!");
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
