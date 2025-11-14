/*
Your coding quest continues with this challenge: Write a Java function named countSubmatricesWithE that calculates how many 
3x3 submatrices in a given 2D array of characters have 'E's in all four corners. Each 3x3 submatrix can be seen as a small 
square within the larger grid.

Then, create a board in the main method, call the function, and print the result.

Can you harness your knowledge to tackle this problem?
*/

package unit_4;

public class CountSubmatrices {
    public static int countSubmatricesWithE(char[][] board) {
        // TODO: Initialize a count variable to keep track of 3x3 submatrices with 'E's in all four corners
        int count = 0;

        // TODO: Use a nested loop to go through each element that can be the top-left corner of a 3x3 submatrix
        for (int i = 0; i < board.length - 2; i++) {
            for (int j = 0; j < board[0].length - 2; j++) {
                // TODO: Check if the current 3x3 submatrix has 'E's in all four corners
                // If it does, increment the count
                if (board[i][j] == 'E' &&
                    board[i + 2][j] == 'E' &&
                    board[i][j + 2] == 'E' &&
                    board[i + 2][j + 2] == 'E'
                ) {
                    count++;
                }                
            }
        }

        // TODO: Return the count of submatrices with 'E's in all four corners
        return count;
    }

    public static void main(String[] args) {
        // TODO: Define a 2D array 'board' with some 'E's and 'P's, representing empty and piece positions respectively
        char[][] board = {
            {'E', 'P', 'E', 'E'},
            {'P', 'E', 'P', 'E'},
            {'E', 'E', 'E', 'P'},
            {'P', 'P', 'E', 'E'}
        };
        
        char[][] submatrices0 = {
            {'E', 'P', 'E'},
            {'P', 'E', 'P'},
            {'E', 'E', 'E'}
        };
        
        char[][] submatrices1 = {
            {'P', 'E', 'E'},
            {'E', 'P', 'E'},
            {'E', 'E', 'P'}
        };
        
        char[][] submatrices2 = {
            {'P', 'E', 'P'},
            {'E', 'E', 'E'},
            {'P', 'P', 'E'}
        };
        
        char[][] submatrices3 = {
            {'E', 'P', 'E'},
            {'E', 'E', 'P'},
            {'P', 'E', 'E'}
        };

        // TODO: Call the function to count the submatrices and output the result
        System.out.println(countSubmatricesWithE(board));
    }
}
