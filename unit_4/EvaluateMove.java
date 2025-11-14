/*
 * Congratulations on your progress with the chessboard exercise! Your next challenge is to analyze a chessboard and 
 * determine the valid positions for placing new pieces. The goal is to ensure that each new piece is placed in a manner 
 * that allows it to make its next move effectively. Specifically, you need to find empty cells ('E') on the chessboard that 
 * have at least one neighboring cell (vertically or horizontally) that is also empty. Your task is to write a function that 
 * checks if a given position on the chessboard is valid for a new piece, based on this criterion. You will then use this 
 * function to identify all valid move positions and display them. Are you ready to put your coding skills to the test and 
 * achieve victory?
 */

package unit_4;

public class EvaluateMove {
        public static boolean evaluateMove(char[][] board, int row, int col) {
        // TODO: Check if a move to the given cell is possible; write a condition to check if the cell is empty.
        if (board[row][col] != 'E') {
            return false;
        }
        // TODO: Check if at least one neighboring cell is empty (not diagonally).
        if (row > 0 && board[row - 1][col] == 'E' ||
            row < board.length - 1 && board[row + 1][col] == 'E' ||
            col > 0 && board[row][col - 1] == 'E' ||
            col < board[0].length - 1 && board[row][col + 1] == 'E'
        ) { 
            return true;
        }

        return false; // Placeholder return statement
    }

    public static void main(String[] args) {
        // Assuming a constant 2D array representing a board
        char[][] board = {
            {'P', 'E', 'E', 'P'},
            {'E', 'P', 'E', 'P'},
            {'P', 'E', 'P', 'P'},
            {'P', 'E', 'P', 'E'}
        };
        
        /*
        [0, 1]
        [0, 2]
        [1, 2]
        [2, 1]
        [3, 1]
        */

        // TODO: Write a loop or loops to find all valid move positions and display them.
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (evaluateMove(board, i, j)) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
