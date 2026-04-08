import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper",     "Passenger", 72));
        bogies.add(new Bogie("AC Chair",    "Passenger", 64));
        bogies.add(new Bogie("First Class", "Passenger", 48));
        bogies.add(new Bogie("Cargo A",     "Freight",   0));
        bogies.add(new Bogie("Cargo B",     "Freight",   0));
        bogies.add(new Bogie("Engine",      "Locomotive",0));

        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        System.out.println("Bogies grouped by type:");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }

    }
}