/*
 * Time to apply what you've learned about transposing matrices! Imagine you are assisting in redesigning the seating 
 * arrangement of a restaurant to accommodate guests better. Your task is to write Java code from scratch to take an initial 
 * seating arrangement (a 2D array) and transpose it. Remember, transposing switches the rows and columns, creating a new 
 * perspective on seating.
 */

import java.util.Arrays;

class TransposeSeating {

    // TODO: Define a function 'transposeSeating' that takes a 2D array 'arrangement' as its parameter.
    public static int[][] transposeSeating(int[][] seatingBefore) {
        int rows = seatingBefore.length;
        int cols = seatingBefore[0].length;
        int[][] seatingAfter = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seatingAfter[j][i] = seatingBefore[i][j];
            }
        }
        return seatingAfter;
    }

    public static void main(String[] args) {
        // Restaurant seating before transposition (rows)
        int[][] seatingBefore = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        
        int[][] goalSeating = {
            {1, 3, 5},
            {2, 4, 6}
        };

        // TODO: Call the 'transposeSeating' function with 'seatingBefore' and print the result to see the new seating arrangement.
        int[][] seatingAfter = transposeSeating(seatingBefore);
        for (int[] row : seatingAfter) {
            System.out.println(Arrays.toString(row));
        } 
    }
}