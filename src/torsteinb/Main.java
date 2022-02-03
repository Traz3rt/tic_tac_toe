package torsteinb;

import torsteinb.controller.ConsoleCommunication;
import torsteinb.controller.TicTacToeController;

public class Main {

    public static void main(String[] args) {
        TicTacToeController controller = new TicTacToeController();
        ConsoleCommunication consoleCom = new ConsoleCommunication(controller);

    }
}
