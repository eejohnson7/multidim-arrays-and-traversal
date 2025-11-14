package unit_4;

/*
Modify the existing findPositions method so that it now identifies potential positions for a new game piece based only on the 
ability to move left or right on the board. We're narrowing down our criteria to only consider horizontal movement, still 
within the paradigm of exploring 2D arrays. Update the code to reflect this change and observe the altered outcome.
 */

import java.util.ArrayList;
import java.util.List;

public class HorizontalPositions {
        private static boolean isEmptyNeighbor(char[][] board, int x, int y) {
        int rows = board.length;
        int cols = board[0].length;

        // Check that (x, y) is within board boundaries
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            return board[x][y] == 'E';
        }
        return false;
    }

    public static List<int[]> findPositions(char[][] board) {
        List<int[]> positions = new ArrayList<>();
        int rows = board.length;
        int cols = board[0].length;

        // TODO: Modify the code to check for empty spot with an empty neighbor to the left and right only
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'E') {
                    // TODO: Update the condition to check only horizontal neighbors
                    if (isEmptyNeighbor(board, i, j - 1) || isEmptyNeighbor(board, i, j + 1)) {
                        positions.add(new int[]{i, j});
                    }
                }
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'P', 'E', 'E', 'P'},
                {'E', 'P', 'E', 'P'},
                {'P', 'E', 'P', 'P'},
                {'P', 'E', 'P', 'E'}
        };
        
        // [0][1] & [0][2]

        List<int[]> positions = findPositions(board);

        for (int[] pos : positions) {
            System.out.println("(" + pos[0] + ", " + pos[1] + ")");
        }
    }
}
