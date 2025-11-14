/*
 * Your next challenge is to put your knowledge of matrices into practice in Java. Your task is to complete the Java 
 * function named reflectOverSecondaryDiagonal. This function will accept a 2D int array representing a square matrix 
 * as an input and return another 2D int array that is the result of reflecting the original matrix over its secondary diagonal.

The secondary diagonal is defined as the diagonal line that starts from the upper-right corner and ends at the bottom-left 
corner of a square matrix. For example, in a 3x3 matrix, the secondary diagonal elements are matrix[0][2], matrix[1][1], and 
matrix[2][0].

By reflecting a matrix over the secondary diagonal, you should effectively swap elements symmetrically with respect to this 
diagonal. The elements on the secondary diagonal will remain unchanged.
 */

import java.util.Arrays;

public class SecondaryDiagonal {
    public static int[][] reflectOverSecondaryDiagonal(int[][] matrix) {
        int size = matrix.length;
        int[][] newMatrix = new int[size][size];
        for (int i = 0; i < size; ++i) {
            // TODO: Complete the code to obtain the reflected square matrix in newMatrix.
            for (int j = 0; j < size; j++) {
                newMatrix[size - 1 - j][size - 1 - i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        // Example square matrix to reflect over the secondary diagonal
        int[][] squareMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] goalMatrix = {
            {9, 6, 3},
            {8, 5, 2},
            {7, 4, 1}
        };

        // TODO: Call the function on squareMatrix and store the result in transformedMatrix.
        // Print the transformed matrix.
        int[][] transformedMatrix = reflectOverSecondaryDiagonal(squareMatrix);
        for (int[] row : transformedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
