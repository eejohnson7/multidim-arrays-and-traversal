package unit_4;

/*
 * A spatial anomaly has affected our robotic chessboard scanners! They are incorrectly reporting the viable landing positions 
 * for our chess pieces. The current Java program is not identifying the correct spots where a piece could potentially move on 
 * its first turn. We need your expertise to debug and rectify the code. Your mission is to find the positions of empty 
 * cells ('E') that are adjacent to at least one other empty cell on a 2D chessboard, without considering diagonal neighbors. 
 * It's time to roll up your sleeves and ensure a smooth journey on the grid!
 */

import java.util.ArrayList;
import java.util.List;

public class DebugChess {
        public static List<int[]> findPositions(char[][] board) {
        List<int[]> positions = new ArrayList<>();

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'E') {
                    if ((i > 0 && board[i - 1][j] == 'E') ||
                        (i < rows - 1 && board[i + 1][j] == 'E') ||
                        (j > 0 && board[i][j - 1] == 'E') ||
                        (j < cols - 1 && board[i][j + 1] == 'E')) {
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
        
        /*
         [0, 1]
         [0, 2] 
         [1, 2]
         [2, 1]
         [3, 1]
        */
        
        List<int[]> positions = findPositions(board);

        for (int[] pos : positions) {
            System.out.println("(" + pos[0] + ", " + pos[1] + ")");
        }
    }
    
}
