package torsteinb.controller;

import torsteinb.model.Player;

import java.util.Scanner;

public class ConsoleCommunication {
    private TicTacToeController controller;
    private Scanner scannerObj;


    public ConsoleCommunication(TicTacToeController controller) {
        this.controller = controller;
        this.scannerObj = new Scanner(System.in); // Create a Scanner object
        startGame();
    }


    private String waitForInput(){
        return scannerObj.nextLine();
    }


    private void startGame(){
        System.out.println("Do you want to play a game of Tic-Tac-Toe? Y/N:");
        String answer = waitForInput();
        if(answer.equals("Y")) {
            controller.startGame();
            nextMove();
        }
        else{
            System.out.println("You have no choice =)");
            controller.startGame();
            nextMove();
        }
    }

    private void nextMove(){
        controller.printBoard();
        int[] moveArray;
        String currentMove;
        if(controller.isPlayerOneTurn()){
            System.out.println("Player One, make your move: ");
        }
        else {
            System.out.println("Player Two, make your move: ");
        }
        currentMove = waitForInput();
        moveArray = controller.interpreter(currentMove);
        validateMove(moveArray);
    }

    private void validateMove(int[] moveArray){

        if(controller.validMove(moveArray)){
            if(controller.isPlayerOneTurn()) {
                controller.placePiece(moveArray, controller.getPlayerOne());
                controller.setPlayerOneTurn(false);
            }
            else{
                controller.placePiece(moveArray, controller.getPlayerTwo());
                controller.setPlayerOneTurn(true);
            }
        }
        else{
            System.out.println("That's not a valid move. Try again");
        }
    nextMove();
    }


}