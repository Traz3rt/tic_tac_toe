package torsteinb.model;

import java.util.Arrays;

public class Board {
    private char[][] boardArray;

    public Board(){
        this.boardArray = new char[3][3]; //3 row, 3 column

        for (char[] row: this.boardArray ) {
            row[0] = ' ';
            row[1] = ' ';
            row[2] = ' ';
        }
    }

    public char[][] getBoard(){
        return boardArray;
    }

    public void setPiece(int[] move ,Player player) {
        this.boardArray[move[0]][move[1]] = player.getPlayerChar();
    }

    public void printBoardToConsole(){
        int i = 1;

        for (char [] row: boardArray) {
            System.out.println(i + " " + Arrays.toString(row));
            i ++;
        }
        System.out.println("   A  B  C");
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + Arrays.toString(boardArray) +
                '}';
    }
}
