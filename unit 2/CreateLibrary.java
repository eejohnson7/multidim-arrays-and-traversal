/*
You've reached an exciting point in your programming journey, aspiring space explorer! Now it's your turn to apply your 
array manipulation skills in Java. Your mission is to write a function to simulate a zigzag traversal across a grid, 
imitating the way one would navigate a library's bookshelves. Begin from the bottom right and zigzag up and down each column. 
Specifically, start from the bottom-right corner, move upwards in the last column, then downwards in the previous column, 
alternating directions as you traverse each column.
*/

public class CreateLibrary {
    public static int[] zigzagTraverse(int[][] grid) {
        // TODO: Determine the number of rows and columns in 'grid'
        int rows = grid.length;
        int cols = grid[0].length;
        int row = rows - 1;
        int col = cols - 1;
        
        int[] traversalPath = new int[grid.length * grid[0].length];
        
        // TODO: Traverse 'grid' in a zigzag pattern starting from the bottom right
        final int UP = 0, DOWN = 1;
        int direction = UP;
        int i = 0;

        while (i < rows * cols) {
            traversalPath[i++] = grid[row][col];

            if ((row == 0 && direction == UP) || (row == rows - 1 && direction == DOWN)) {
                col--;
                direction = (direction == UP) ? DOWN : UP;
            } else {
                row += (direction == UP) ? -1 : 1;
            }
        }
        
        return traversalPath;
    }

    public static void main(String[] args) {
        // TODO: Define a 2x4 'grid' with unique numbers representing items
        int[][] grid = {
            {101, 102, 103, 104},
            {201, 202, 203, 204}
        };

        // TODO: Print the zigzag traversal path of items in 'grid'
    }
}
