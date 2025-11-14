/*
 * In our hiking trail navigation exercise, you were presented with the code to find the next uphill value. This time, 
 * enhance your function by considering diagonal moves to capture the richness of possible paths. Modify the directions 
 * list to include diagonal directions in addition to the current cardinal directions. Ready to expand your path-finding 
 * capabilities?
 */

package unit_5;

public class NextUphill {
    public static Integer findNextUphill(int[][] grid, int row, int col) {
        // Up, down, left, right
        int[][] directions = { 
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}, 
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1} 
        };
        int nextVal = grid[row][col];
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            
            if (newRow >= 0 && // top row or down
                newRow < grid.length && // bottom row or up
                newCol >= 0 && // left column or right 
                newCol < grid[0].length // right column or left
                && grid[newRow][newCol] > nextVal // uphill
            ) {
                nextVal = grid[newRow][newCol];
            }
        }
        return nextVal != grid[row][col] ? nextVal : null;
    }

    public static void main(String[] args) {
        int[][] trailGrid = {
            {1, 2, 3},
            {6, 5, 8},
            {7, 4, 9}
        };
        int startRow = 1, startCol = 1;
        // Prints the value uphill from the start position or null if there's no uphill
        System.out.println(findNextUphill(trailGrid, startRow, startCol));
    }
}
