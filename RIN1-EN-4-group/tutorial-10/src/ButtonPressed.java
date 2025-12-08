import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPressed implements ActionListener {
    TicTacToe game;

    ButtonPressed(TicTacToe game){
        this.game = game;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource(); // get what button was pressed

        if(button == game.newGame){
            game.frame.dispose();
            new TicTacToe();
        }

        button.setText(game.currentSign);
        button.setEnabled(false);
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 80));

        if(game.currentSign.equals("X")){
            game.currentSign = "O";
        }else{
            game.currentSign = "X";
        }

        game.status.setText(game.currentSign + " turn");
        if(game.currentSign.equals("X")) game.status.setForeground(Color.blue);
        else game.status.setForeground(Color.red);

        // check if game is finished
        game.checkIfWinner();
    }
}
