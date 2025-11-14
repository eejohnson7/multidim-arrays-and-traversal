/*
 * Now it's time to apply what you've learned about traversing through adjacent cells in a 2D array in Java. Similar to our 
 * previous example, you will create a function that makes a trek through a 2D array (int[][] grid) representing elevation 
 * levels. Starting from a specified point, your function should continue to move to the adjacent cell having a higher 
 * elevation. Fill in the missing parts to complete the function that determines the path of the hike.
 */

package unit_5;

import java.util.ArrayList;
import java.util.List;

public class TrekPath {
    // The trekPath function should go here
    // TODO: Define the trekPath function that takes the elevationMap, startRow, and startCol as parameters.
    public List<Integer> trekPath(int[][] elevationMap, int startRow /* 1 */, int startCol /* 1 */) {
        // TODO: Initialize the path with the starting position's elevation.
        List<Integer> path = new ArrayList<>();
        path.add(elevationMap[startRow][startCol]);
        
        int rows = elevationMap.length; // 3
        int cols = elevationMap[0].length; // 3
        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        // TODO: Implement the loop to find the path through higher elevations.
        while (true) {
            int r = -1;
            int c = -1;
            int currMax = -1;
            
            for (int[] dir : directions) {
                int newRow = startRow + dir[0]; // 0 2 1
                int newCol = startCol + dir[1]; // 1 1 0
                
                if (newRow < 0 ||
                    newRow >= rows ||
                    newCol < 0 ||
                    newCol >= cols
                ) {
                    continue;
                }
                
                if (elevationMap[newRow][newCol] > currMax) {
                    r = newRow;
                    c = newCol;
                    currMax = elevationMap[newRow][newCol];
                }
                
            }
            
            if (currMax <= elevationMap[startRow][startCol]) {
                break;
            }
            
            startRow = r;
            startCol = c;
            
            path.add(currMax);
        }
        
        return path;
    }
    
    public static void main(String[] args) {
        int[][] mountain = {
            {1, 2, 3},
            {2, 3, 5},
            {3, 4, 6}
        };
        // {3, 5, 6}
        TrekPath sol = new TrekPath();
        List<Integer> result = sol.trekPath(mountain, 1, 1);
        for (int height : result) {
            System.out.print(height + " ");
        }
    }
}
