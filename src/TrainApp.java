import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper",     72));
        bogies.add(new Bogie("AC Chair",    64));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("Cargo A",      0));
        bogies.add(new Bogie("Cargo B",      0));

        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Bogies in train:");
        for (Bogie b : bogies) {
            System.out.println("  " + b);
        }

        System.out.println("Total seating capacity: " + totalSeats);

    }
}