package torsteinb.controller;

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
        System.out.println("Do you want to play a game of chess? Y/N:");
        String answer = waitForInput();
        if(answer.equals("Y")) {
            controller.startGame();
            controller.printBoard();
            nextMove();
        }
        else{
            System.out.println("Why not, are you scared? ");
            controller.startGame();
        }
    }

    private void nextMove(){

    }


}