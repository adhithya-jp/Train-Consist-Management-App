import java.util.ArrayList;

public class TrainApp {

    public static void main(String[] args) {

        ArrayList<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("Bogies after insertion: " + bogies);

        bogies.remove("AC Chair");
        System.out.println("Bogies after removing AC Chair: " + bogies);

        System.out.println("Contains Sleeper: " + bogies.contains("Sleeper"));

        System.out.println("Final bogie list: " + bogies);

    }
}