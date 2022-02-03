package torsteinb.repository;

import torsteinb.model.Board;
import torsteinb.model.Player;

public class TicTacToeRepository {
    private Board gameBoard;

    public TicTacToeRepository(){
        gameBoard = new Board();
    }

    public Board getGameBoard() {
        return gameBoard;
    }
}
