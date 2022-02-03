package torsteinb.controller;

import torsteinb.model.Player;
import torsteinb.repository.TicTacToeRepository;

public class TicTacToeController {
    private TicTacToeRepository repository;
    private Player playerOne, playerTwo;
    private boolean playerOneTurn;

    public TicTacToeController(){

    }

    public void printBoard(){
        repository.getGameBoard().printBoardToConsole();
    }

    public void startGame(){
        this.playerOne = new Player(true);
        this.playerTwo = new Player(false);
        this.playerOneTurn = true;
        this.repository = new TicTacToeRepository();
    }


}
