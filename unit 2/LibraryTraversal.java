/*
 * In the realm of digital libraries, a quest has been laid before you! 
 * You are given a two-dimensional array representing a library's bookshelf layout. 
 * Your mission is to traverse these shelves starting from the bottom right corner, 
 * zigzagging your way through each book, visiting every location. Zigzagging means 
 * moving upwards through the rows until you hit the top, then moving one column to the 
 * left and switching direction to move downwards through the rows, repeating this pattern. 
 * But beware, a bug has disrupted the proper traversal path. Your task is to detect the 
 * bug and repair it to ensure the seamless traversal of the library's collection. 
 * Embark on this adventure and may order be restored!
 */

import java.util.ArrayList;

public class LibraryTraversal {
    public static void main(String[] args) {
        int[][] library = {
            {1, 3, 5, 7},
            {2, 4, 6, 8},
            {9, 11, 13, 15}
        };

        // Starting from the bottom right corner of the bookshelf
        int row = library.length - 1; //2
        int col = library[0].length - 1; //3
        boolean goingUp = true;

        ArrayList<Integer> result = new ArrayList<>();

        while (col >= 0) {
            result.add(library[row][col]); // [2][3], [1][3], [0][3], [0][2], [1][2], [2][2], [2][3]
            if (goingUp) {
                if (row == 0) {
                    goingUp = false;
                    col -= 1;
                } else {
                    row -= 1;
                }
            } else {
                if (row == library.length - 1) {
                    goingUp = true;
                    col /*+*/-= 1;
                } else {
                    row += 1;
                }
            }
        }

        System.out.println(result);
    }
}
