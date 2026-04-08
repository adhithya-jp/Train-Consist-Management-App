import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate - will be ignored

        System.out.println("Unique Bogie IDs: " + bogieIds);
        System.out.println("Total unique bogies: " + bogieIds.size());

    }
}