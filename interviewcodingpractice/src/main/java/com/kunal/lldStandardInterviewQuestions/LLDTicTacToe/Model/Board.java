package com.kunal.lldStandardInterviewQuestions.LLDTicTacToe.Model;

import javafx.util.Pair;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Board {

    private int row;
    private int col;
    PlayingPiece[][] board;

    public Board(int row, int col) {
        this.row = row;
        this.col = col;
        board = new PlayingPiece[row][col];
    }

    public void printBoard() {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "  ");
                } else {
                    System.out.print("  ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells() {

        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == null) {
                    Pair<Integer, Integer> freeCell = new Pair<>(i, j);
                    freeCells.add(freeCell);
                }
            }
        }
        return freeCells;
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if (board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }
}