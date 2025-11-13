class Solution {
    public static void main(String[] args) {
        String[][] apartmentBuilding = {
            {"Apt 101", "Apt 102", "Apt 103"},
            {"Apt 201", "Apt 202", "Apt 203"},
            {"Apt 301", "Apt 302", "Apt 303"}
        };

        // TODO: Update "Apt 202" to "Renovated Apt 202" in `apartmentBuilding`
        apartmentBuilding[1][1] = "Renovated Apt 202";

        // Print all the apartments after the renovation update
        for (int i = 0; i < apartmentBuilding.length; i++) {
            for (int j = 0; j < apartmentBuilding[i].length; j++) {
                System.out.print(apartmentBuilding[i][j] + ", ");
            }
            System.out.println();  // Move to the next floor
        }
    }
}
