/*
 In this challenge, let's adjust our matrix traversal method! Originally, our method 
 involved traversing even-indexed columns upwards and odd-indexed columns downwards. 
 Your task is to reverse this pattern without adding new lines of code. Make the 
 necessary change in the condition within the loop so that even-indexed columns 
 are traversed downwards, and odd-indexed ones upwards. Let's enhance this pattern!
 */

public class TraverseMatrix {
    public static void printMatrixTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int col = cols - 1; col >= 0; --col) {
            if (col % 2 != 0) {
                for (int row = rows - 1; row >= 0; --row) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                for (int row = 0; row < rows; ++row) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        printMatrixTraversal(matrix);
    }
}
