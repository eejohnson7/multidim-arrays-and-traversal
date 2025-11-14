class Solution {
    public static void main(String[] args) {
        // Creating a 2D array representing an apartment building
        String[][] building = {
            {"1A", "1B", "1C"},
            {"2A", "2B", "2C"},
            {"3A", "3B", "3C"}
        };

        // TODO: Complete the code to print the apartment codes of the ground floor only.
        for (int i = 0; i < building[0].length; i++) {
            System.out.println(building[0][i]);
        }
    }
}