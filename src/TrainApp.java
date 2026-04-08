import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 64));
        bogies.add(new Bogie("First Class", 48));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Bogies sorted by capacity:");
        for (Bogie b : bogies) {
            System.out.println("  " + b);
        }

    }
}