package torsteinb.controller;

import torsteinb.model.Player;
import torsteinb.repository.TicTacToeRepository;


public class TicTacToeController {
    private TicTacToeRepository repository;
    private Player playerOne, playerTwo;
    private boolean playerOneTurn;

    public TicTacToeController(){}

    public void printBoard(){
        repository.getGameBoard().printBoardToConsole();
    }

    public void startGame(){
        this.playerOne = new Player(true);
        this.playerTwo = new Player(false);
        this.playerOneTurn = true;
        this.repository = new TicTacToeRepository();
    }

    public boolean isPlayerOneTurn() {
        return playerOneTurn;
    }

    public void setPlayerOneTurn(boolean playerOneTurn) {
        this.playerOneTurn = playerOneTurn;
    }

    public int[] interpreter (String move) {
        int[] answer = new int[2];
        char firstChar = move.charAt(0);
        if (firstChar == 'A'){
            answer[1] = 0;
        }
        else if(firstChar == 'B'){
            answer[1] = 1;
        }
        else if(firstChar == 'C'){
            answer[1] = 2;
        }

        int integer = Character.getNumericValue(move.charAt(1)) - 1;
        answer[0] = integer;

    return answer;
    }

    public boolean validMove(int[] move){
        boolean b = this.repository.getGameBoard().getBoard()[move[0]][move[1]] == ' ';
        return b;
    }

    public void placePiece(int[] move, Player player){
        repository.getGameBoard().setPiece(move,player);
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }
}
