package com.Games;
	import java.util.Scanner;

	public class TicTacToe {
	    static char[][] board = {
	            {' ', ' ', ' '},
	            {' ', ' ', ' '},
	            {' ', ' ', ' '}
	    };
	    
	    static char currentPlayer = 'X';

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean gameWon = false;

	        while (!gameWon && !isBoardFull()) {
	            printBoard();
	            System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");
	            int row = scanner.nextInt();
	            int col = scanner.nextInt();

	            if (isValidMove(row, col)) {
	                board[row][col] = currentPlayer;
	                gameWon = checkWin();

	                if (gameWon) {
	                    printBoard();
	                    System.out.println("Player " + currentPlayer + " wins!");
	                } else {
	                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player
	                }
	            } else {
	                System.out.println("Invalid move! Try again.");
	            }
	        }

	        if (!gameWon) {
	            printBoard();
	            System.out.println("It's a draw!");
	        }
	        scanner.close();
	    }

	    static void printBoard() {
	        System.out.println("-------------");
	        for (char[] row : board) {
	            System.out.print("| ");
	            for (char cell : row) {
	                System.out.print(cell + " | ");
	            }
	            System.out.println("\n-------------");
	        }
	    }

	    static boolean isValidMove(int row, int col) {
	        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
	    }

	    static boolean checkWin() {
	        // Check rows and columns
	        for (int i = 0; i < 3; i++) {
	            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
	                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
	                return true;
	            }
	        }

	        // Check diagonals
	        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
	               (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
	    }

	    static boolean isBoardFull() {
	        for (char[] row : board) {
	            for (char cell : row) {
	                if (cell == ' ') return false;
	            }
	        }
	        return true;
	    }
	}
