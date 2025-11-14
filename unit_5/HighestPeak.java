/*
 * In your latest digital mountain exploration project, you have written a program in Java to identify the highest peak 
 * reachable from a starting point on a mountain. However, it appears there is an issue with the code, as it is not always 
 * returning the correct altitude of the highest peak reachable. Can you spot and fix the issue to ensure the digital 
 * exploration is successful?
 */

package unit_5;

public class HighestPeak {
    public static int findPeakAltitude(int[][] grid, int startRow /* 0 */, int startCol /* 1 */) {
        int rows = grid.length; // 3
        int cols = grid[0].length; // 3
        int altitude = grid[startRow][startCol]; // 2
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        while (true) {
            int nextRow = -1;
            int nextCol = -1;
            
            for (int[] dir : directions) {
                int newRow = startRow + dir[0]; // -1 0
                int newCol = startCol + dir[1]; // 1 2
                
                if (newRow >= 0 && 
                    newRow < rows && 
                    newCol >= 0 && 
                    newCol < cols && 
                    grid[newRow][newCol] > altitude
                ) {
                    altitude = grid[newRow][newCol];
                    nextRow = newRow;
                    nextCol = newCol;
                }
            }
            
            if (altitude == grid[startRow][startCol]) {
                break;
            }
            
            startRow = nextRow;
            startCol = nextCol;
        }
        
        return altitude;
    }

    public static void main(String[] args) {
        int[][] mountain = {
            {1, 2, 3},
            {2, 5, 7},
            {4, 6, 9}
        };

        System.out.println(findPeakAltitude(mountain, 0, 1));  // Should print the altitude of the highest peak reachable
    }
}
