import java.util.Arrays;

public class AddNewRowMultiDimArray {
    public static void main(String[] args) {
        // Initializing a 2D array that represents an apartment building
        String[][] apartments = {
            {"Apt 101", "Apt 102"},
            {"Apt 201", "Apt 202"}
        };

        // Adding a new floor to the apartment building
        apartments = addNewFloor(apartments, new String[]{"Apt 301", "Apt 302"});

        // TODO: Make a walk visiting each apartment on every floor of the updated building.
        for (String[] floor : apartments) {
            for (String apt : floor) {
                System.out.println(apt);
            }
        }
    }

    // TODO: Add a method `addNewFloor` to add a new floor with apartments to our 'apartment building'.
    public static String[][] addNewFloor(String[][] apartments, String[] newFloor) {
        String[][] renovatedApts = new String[apartments.length + 1][newFloor.length];
        
        for (int i = 0; i < apartments.length; i++) {
            renovatedApts[i] = Arrays.copyOf(apartments[i], apartments[i].length);
        }
        renovatedApts[renovatedApts.length - 1] = newFloor;
        
        return renovatedApts;
    }    
}
