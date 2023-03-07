package com.magnuszakariassen.architecture.readability.refactored;

import java.util.ArrayList;

public class Game {

    private static final int BOARD_WIDTH = 7;
    private static final int BOARD_LENGTH = 7;
    private static final int BLACK = 1;
    private static final int WHITE = 0;

    public static void main(String[] args) {
        var board = createChessBoard();
    }

    public static ArrayList<ArrayList<Integer>> createChessBoard(){
        ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();

        for(int row = 0; row<= BOARD_WIDTH; row++) {
            ArrayList<Integer> boardRow = new ArrayList<>();

            for (int column = 0; column<= BOARD_LENGTH; column++) {
                boolean isBlackSquare = isSquareOnEvenDiagonal(row, column);
                if (isBlackSquare) {
                        boardRow.add(BLACK);
                    } else {
                        boardRow.add(WHITE);
                    }

            }
            System.out.println(boardRow);
            board.add(boardRow);
        }
        return board;
    }

    private static boolean isSquareOnEvenDiagonal(int row, int column) {
        return (row - column) % 2 == 0;
    }
}
