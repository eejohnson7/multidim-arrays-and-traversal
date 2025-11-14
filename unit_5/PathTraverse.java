/*
 * Immerse yourself in the adventure of mountain trekking in a virtual world through coding. Your quest is to craft a 
 * Java function named pathTraverse that guides you through a matrix, always advancing to an adjacent cell with a higher 
 * value. Embark on this challenging journey with the provided starter code and fulfill the quest by completing the TODO 
 * blocks. Along the way, you will hone your skills in navigating two-dimensional arrays and maneuvering through them with 
 * precision. Set forth, code warrior, and tread carefully on this mountain trail!
 */

package unit_5;

import java.util.ArrayList;
import java.util.List;

public class PathTraverse {
    
    // TODO: Define the pathTraverse function which takes a mountain matrix and the current position (row, column) as parameters.
    // The function should return an ArrayList of int arrays representing the coordinates of the path taken,
    // starting from the initial position and moving to each higher adjacent cell.
    public static List<List<Integer>> pathTraverse(int[][] mountain, int currentRow, int currentCol) {
        List<List<Integer>> path = new ArrayList<>();
        path.add(List.of(currentRow, currentCol));
        
        int rows = mountain.length;
        int cols = mountain[0].length;
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };
        int elevation = mountain[currentRow][currentCol];
        
        while (true) {
            int nextRow = -1;
            int nextCol = -1;
            
            for (int[] dir : directions) {
                int newRow = currentRow + dir[0];
                int newCol = currentCol + dir[1];
                
                if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols) { 
                    continue; 
                }
                
                if (mountain[newRow][newCol] > elevation) {
                    elevation = mountain[newRow][newCol];
                    nextRow = newRow;
                    nextCol = newCol;
                }
            }
            
            if (elevation == mountain[currentRow][currentCol]) {
                break;
            }
            
            currentRow = nextRow;
            currentCol = nextCol;
            
            path.add(List.of(nextRow, nextCol));
        }
        
        return path;
    }

    public static void main(String[] args) {
        // TODO: Create a matrix named 'mountain' representing ascending values, akin to the increasing elevation while hiking up a mountain.
        int[][] mountain = {
            {1, 2, 3},
            {3, 7, 8},
            {5, 2, 9}
        };
        
        /*
        [0, 0]
        [1, 0]
        [1, 1]
        [1, 2]
        [2, 2]
        */

        // TODO: Set the starting position on the mountain using an array to store the row and column index.
        int[] start = {0, 0};

        // TODO: Call the pathTraverse function to find the path from the starting point.
        List<List<Integer>> path = pathTraverse(mountain, start[0], start[1]);

        // TODO: Output the coordinates of the path taken from the starting point.
        for (List<Integer> coordinate : path) {
            System.out.println(coordinate.toString());
        }
    }
}
