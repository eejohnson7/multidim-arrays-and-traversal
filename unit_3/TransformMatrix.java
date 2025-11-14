/*
 * Your task is to write a Java function named transformMatrix that will take a 2D array of integers (representing a matrix) 
 * as input and return another 2D array which is the transposed version of the input matrix. To transpose a matrix means to 
 * flip it over its diagonal, turning its rows into columns and columns into rows.
 */

import java.util.Arrays;

public class TransformMatrix {
    public static int[][] transformMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = rows > 0 ? matrix[0].length : 0;
        int[][] transposed = new int[cols][rows];

        // TODO: Complete the transposition process by filling in the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] original_matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] goal_matrix = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        // TODO: Call transformMatrix with original_matrix and store the result in a variable
        int[][] result = transformMatrix(original_matrix);
        
        // TODO: Print out the transposed matrix
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        
    }
}
