/*
 * On a smaller game board in Java, identify whether an element in a specific position is adjacent to at least one empty cell. 
 * Adjacent cells include only the cells directly up, down, left, or right, not diagonally. You don't need to concern yourself 
 * if the current position is empty or contains a piece. Write the function isPositionStrategic to check for any adjacent 
 * empty spots for the given row and col.

 * Then, use the function to check whether the position (0, 1) is strategic in the board given in the main function. Don't 
 * forget to print the result.
 */

package unit_4;

public class IsPositionStrategic {
    private static boolean isPositionStrategic(char[][] board, int row, int col) {
        return ((row > 0 && board[row - 1][col] == 'E') ||
                // TODO: Complete the remaining conditions for down, left, and right
                (row < board.length - 1 && board[row + 1][col] == 'E') ||
                (col > 0 && board[row][col - 1] == 'E') ||
                (col < board[0].length - 1 && board[row][col + 1] == 'E')
                );
    }

    public static void main(String[] args) {
        // Board game configuration: 'E' for empty, 'P' for piece
        char[][] gameBoard = {
            {'E', 'P'},
            {'P', 'E'}
        };
        
        // [0, 1], [1, 0]
        
        // TODO: Check if position (0, 1) is strategic and print the result
        if (isPositionStrategic(gameBoard, 0, 1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
