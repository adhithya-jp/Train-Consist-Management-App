import java.util.HashMap;
import java.util.Map;

public class TrainApp {

    public static void main(String[] args) {

        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 64);
        bogieCapacity.put("First Class", 48);

        System.out.println("Bogie Capacity Map:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue() + " seats");
        }

    }
}