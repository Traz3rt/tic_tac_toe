package torsteinb.model;

public class Player {
    private char playerChar;

    public Player(boolean playerOne){
        if(playerOne){
            playerChar = 'O';
        }
        else{
            playerChar = 'X';
        }

    }

    public char getPlayerChar() {
        return playerChar;
    }
}
