import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "Cargo", "Engine", "Pantry Car"};

        System.out.println("=== Sort Bogie Names Using Arrays.sort() ===");

        System.out.println("Before sorting: " + Arrays.toString(bogieNames));

        Arrays.sort(bogieNames);

        System.out.println("After sorting:  " + Arrays.toString(bogieNames));

    }
}