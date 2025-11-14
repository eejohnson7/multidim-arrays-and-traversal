/*
 * Your task is to create a function that performs a vertical traverse on a 2D matrix (represented as an int[][] array) 
 * starting from the bottom right corner. The function should start from the bottom-right cell (the last element of the 
 * last row), move vertically upwards to the top (the top row is the row with index 0), then move one column to the left 
 * and continue the process until all columns have been traversed. 
 * The function should return a list containing the values of the matrix elements in the order they were visited.
 */

import java.util.ArrayList;
import java.util.List;

class VerticalTraversal {
    public static List<Integer> verticalTraverse(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        
        // TODO: Append each element's value to the result list by following the vertical pattern.
        int index = 0;
        int row = rows - 1;
        int col = cols - 1;
        String direction = "up";
        
        while (index < rows * cols) {
            result.add(matrix[row][col]);
            
            if (row == matrix.length - 1 && direction == "down") {
                if (col != 0) {
                    col--;
                    direction = "up";                    
                }
            } else if (row == 0 && direction == "up") {
                if (col != 0) {
                    col--;
                    direction = "down";
                }
                
            } else {
                if (direction == "up") {
                    row--;
                } else {
                    row++;
                }
            }
            
            index++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        List<Integer> traversal = verticalTraverse(data);
        for (int num : traversal) {
            System.out.print(num + " ");
        }
    }
}
