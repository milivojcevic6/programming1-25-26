import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPressed implements ActionListener {
    int j,i;
    TicTacToe game;

    ButtonPressed(TicTacToe game, int i, int j){
        this.game = game;
        this.i = i;
        this.j = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        button.setText(game.currentSign);
        button.setFont(game.font);
        button.setEnabled(false); // disable button after click

        // switch sign
        if(game.currentSign.equals("X")){
            game.currentSign = "O";
            game.status.setForeground(Color.RED);
        }else {
            game.currentSign = "X";
            game.status.setForeground(Color.BLUE);
        }

        game.status.setText(game.currentSign + " turn");

        // check if game is done
        game.checkIfDone();

    }
}
