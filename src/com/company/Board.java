package com.company;

import java.util.Arrays;

public class Board {
    private char[][] boardArray;

    public Board(){
        boardArray = new char[3][3]; //3 row, 3 column

    }

    public char[][] getBoard(){
        return boardArray;
    }

    public void printBoardToConsole(){
        for (char [] row: boardArray) {
            System.out.println(Arrays.toString(row));
        }
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + Arrays.toString(boardArray) +
                '}';
    }
}
