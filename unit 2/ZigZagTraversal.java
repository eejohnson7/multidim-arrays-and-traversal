/*
 * Focus on the essential maneuver of traversing and switching directions in a 2D matrix using Java. 
 * Implement the part of the logic where if we have reached the bottom or top of a column, we need to switch 
 * directions and move left. We are initializing our traversal from the bottom-right corner of the matrix, 
 * moving upwards first, then switching direction when the top or bottom is hit. 
 * 
 * The program should print the following when logging the returned result of the function: 12 8 4 3 7 11 10 6 2 1 5 9.
 */

public class ZigZagTraversal {
    public static int[] columnTraverse(int[][] matrix) {
        int rows = matrix.length; //3
        int cols = matrix[0].length; //4
        int row = rows - 1; //2
        int col = cols - 1;//3
        String direction = "up";
        int[] output = new int[rows * cols]; //12
        int index = 0;

        while (index < rows * cols) {
            output[index++] = matrix[row][col]; //[2][3], [1][3], [0][3], ||| [0][2], [1][2], [2, 2] ||| [2, 1] [1, 1] [0, 1] |||
            // TODO: Implement logic to change direction and move left when hitting the top or bottom of the column
            if (row == 0) {
                if (direction == "up") {
                    direction = "down";
                    if (col != 0) {
                        col--;
                    }
                } else {
                    row++;
                }
            } else if (row == matrix.length - 1 && direction == "down") {
                if (col != 0) {
                    direction = "up";
                    col--;
                } else {
                    row++;
                }              
            }
            else { // Otherwise, continue moving in the same direction
                if (direction == "up") {
                    row--;
                } else {
                    row++;
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int[] result = columnTraverse(matrix);
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
}
