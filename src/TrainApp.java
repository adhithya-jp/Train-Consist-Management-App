import java.util.LinkedList;

public class TrainApp {

    public static void main(String[] args) {

        LinkedList<String> consist = new LinkedList<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial consist: " + consist);

        consist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + consist);

        consist.removeFirst();
        System.out.println("After removing first bogie: " + consist);

        consist.removeLast();
        System.out.println("After removing last bogie: " + consist);

        System.out.println("Final train consist: " + consist);

    }
}