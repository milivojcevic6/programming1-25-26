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
        frame.setSize(800,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel gameGrid = new JPanel();
        gameGrid.setLayout(new GridLayout(3,3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(new ButtonPressed(this, i, j));
                buttons[i][j].setBackground(Color.white);
                gameGrid.add(buttons[i][j]);
            }

        }

        // create status label
        status = new JLabel("X turn");
        status.setBackground(Color.lightGray);
        // some swing components have transparent background by default
        // use setOpaque(true)
        status.setOpaque(true);
        status.setFont(font);
        status.setHorizontalAlignment(JLabel.CENTER);
        status.setForeground(Color.blue);
        frame.add(status, BorderLayout.NORTH);

        // new game button
        JButton newGame = new JButton("New Game");
        newGame.setFont(font);
        newGame.setBackground(Color.lightGray);
        newGame.addActionListener(e -> {
                    frame.dispose();
                    new TicTacToe();
                }
        );

        frame.add(newGame, BorderLayout.SOUTH);
        frame.add(gameGrid,BorderLayout.CENTER);
        frame.setVisible(true);
    }

    void checkIfDone(){
        for (int i = 0; i < 3; i++) {
            // rows
            if(threeEqual(buttons[i][0],buttons[i][1],buttons[i][2])){
                win(buttons[i][0],buttons[i][1],buttons[i][2]);
            }
            // cols
            if(threeEqual(buttons[0][i],buttons[1][i],buttons[2][i])){
                win(buttons[0][i],buttons[1][i],buttons[2][i]);
            }
        }

        // diagonals
        if(threeEqual(buttons[0][0],buttons[1][1],buttons[2][2])){
            win(buttons[0][0],buttons[1][1],buttons[2][2]);
        }

        if(threeEqual(buttons[0][2],buttons[1][1],buttons[2][0])){
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
            status.setText("DRAW");
            status.setForeground(Color.DARK_GRAY);
        }



    }

    boolean threeEqual(JButton a, JButton b, JButton c){
        return !a.getText().isEmpty() &&
                a.getText().equals(b.getText()) &&
                a.getText().equals(c.getText());
    }

    void win(JButton a, JButton b, JButton c) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }

        a.setBackground(Color.green);
        b.setBackground(Color.green);
        c.setBackground(Color.green);

        status.setText(a.getText() + " WON");
        status.setForeground(a.getText().equals("X") ? Color.BLUE : Color.RED);
    }


    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        new TicTacToe();
    }
}
