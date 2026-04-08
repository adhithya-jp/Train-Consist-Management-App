import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Exception Handling During Search Operations ===");

        // Test 1 - empty consist
        List<String> emptyConsist = new ArrayList<>();
        System.out.println("Test 1: Searching on empty consist");
        try {
            searchBogie(emptyConsist, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Test 2 - consist with bogies, bogie found
        List<String> consist = new ArrayList<>();
        consist.add("BG101");
        consist.add("BG205");
        consist.add("BG310");
        System.out.println("Test 2: Searching on populated consist");
        try {
            searchBogie(consist, "BG205");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Test 3 - consist with bogies, bogie not found
        System.out.println("Test 3: Searching for non-existent bogie");
        try {
            searchBogie(consist, "BG999");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void searchBogie(List<String> consist, String key) {
        if (consist.isEmpty()) {
            throw new IllegalStateException(
                    "Cannot search. Train consist is empty. Add bogies before searching."
            );
        }

        for (String id : consist) {
            if (id.equals(key)) {
                System.out.println("Bogie " + key + " found in consist.");
                return;
            }
        }

        System.out.println("Bogie " + key + " not found in consist.");
    }
}