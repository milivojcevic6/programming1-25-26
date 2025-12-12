import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPressed implements ActionListener {
    TicTacToe game;
    int i, j;

    ButtonPressed(TicTacToe game, int i, int j){
        this.game = game;
        this.i = i;
        this.j = j;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if(button == game.newGame){
            game.frame.dispose();
            new TicTacToe(); // start the game
        }
        System.out.println("Button " + i +"," + j);

        button.setText(game.currentSign);
        button.setFont(game.font);
        button.setEnabled(false);

        // change sign
        if(game.currentSign.equals("X")){
            game.currentSign = "O";
            game.status.setForeground(Color.red);
        }else {
            game.currentSign = "X";
            game.status.setForeground(Color.blue);
        }
        game.status.setText(game.currentSign + " turn");

        // check if game is Done

        game.checkIfDone();
    }
}
