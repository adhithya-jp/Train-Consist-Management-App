import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Bogie-" + i, i % 100));
        }

        // Loop-based filtering
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // Stream-based filtering
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // Results
        System.out.println("=== Performance Comparison ===");
        System.out.println("Total bogies tested     : " + bogies.size());
        System.out.println("Loop filtered count     : " + loopResult.size());
        System.out.println("Stream filtered count   : " + streamResult.size());
        System.out.println("Loop execution time     : " + loopTime + " ns");
        System.out.println("Stream execution time   : " + streamTime + " ns");

        if (loopTime < streamTime) {
            System.out.println("Winner: Loop-based filtering was faster.");
        } else {
            System.out.println("Winner: Stream-based filtering was faster.");
        }

    }
}