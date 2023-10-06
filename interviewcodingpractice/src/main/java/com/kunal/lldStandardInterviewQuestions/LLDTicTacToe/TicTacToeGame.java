package com.kunal.lldStandardInterviewQuestions.LLDTicTacToe;

import com.kunal.lldStandardInterviewQuestions.LLDTicTacToe.Model.*;

import javafx.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {

        players = new LinkedList<>();

        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", 1L, crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", 2L, noughtsPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3, 3);
    }

    public String startGame() {

        boolean noWinner = true;
        while (noWinner) {

            //take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();

            //get the free space from the board
            List<Pair<Integer, Integer>> freeCells = gameBoard.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            //read the user input
            System.out.println("Player:" + playerTurn.getName() + " Enter row,column: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);

            boolean isPieceAdded = gameBoard.addPiece(inputRow, inputCol, playerTurn.getPlayingPiece());
            if (!isPieceAdded) {
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputCol, playerTurn.getPlayingPiece().pieceType);
            if (winner) {
                return playerTurn.getName();
            }
        }
        return "Tie";
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.getRow();i++) {
            if(gameBoard.getBoard()[row][i] == null || gameBoard.getBoard()[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in coloumn
        for(int i=0;i<gameBoard.getCol();i++) {
            if(gameBoard.getBoard()[i][col] == null || gameBoard.getBoard()[i][col].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.getRow() && j<gameBoard.getCol();i++,j++) {
            if (gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.getCol()-1; i<gameBoard.getRow() && j<gameBoard.getCol();i++,j--) {
            if (gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}