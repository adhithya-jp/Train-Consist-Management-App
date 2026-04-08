import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Flat",        "Steel"));
        bogies.add(new GoodsBogie("Covered",     "Grain"));

        System.out.println("=== Safety Compliance Check ===");
        for (GoodsBogie b : bogies) {
            System.out.println("  " + b);
        }

        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true;
                });

        System.out.println("Train safety compliant: " + isSafe);

        // Test with a failing case
        List<GoodsBogie> unsafeBogies = new ArrayList<>();
        unsafeBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        unsafeBogies.add(new GoodsBogie("Cylindrical", "Chemicals")); // violation
        unsafeBogies.add(new GoodsBogie("Flat",        "Steel"));

        boolean isUnsafe = unsafeBogies.stream()
                .allMatch(b -> {
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true;
                });

        System.out.println("Unsafe train safety compliant: " + isUnsafe);

    }
}