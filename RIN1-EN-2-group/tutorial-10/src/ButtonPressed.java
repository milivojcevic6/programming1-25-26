import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPressed implements ActionListener {
    TicTacToe game;
    int i;
    int j;

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
            new TicTacToe();
        }

        button.setText(game.currentSign);
        button.setFont(new Font("Serif", Font.BOLD, 80));
        button.setEnabled(false);

        if(button.getText().equals("X")){
            game.currentSign = "O";
            game.status.setForeground(Color.RED);
        }else {
            game.currentSign = "X";
            game.status.setForeground(Color.BLUE);
        }

        game.status.setText(game.currentSign + " turn");

        game.checkIfDone();

    }
}
