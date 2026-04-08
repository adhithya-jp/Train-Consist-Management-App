import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainApp {

    public static void main(String[] args) {

        // Train ID validation
        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");

        String[] trainIds = {"TRN-1234", "TRN-99", "TRN-5678", "ABC-1234"};

        System.out.println("=== Train ID Validation ===");
        for (String id : trainIds) {
            Matcher matcher = trainIdPattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("  " + id + " -> Valid");
            } else {
                System.out.println("  " + id + " -> Invalid");
            }
        }

        // Cargo Code validation
        Pattern cargoPattern = Pattern.compile("CGO-[A-Z]{2}");

        String[] cargoCodes = {"CGO-AB", "CGO-XY", "CGO-123", "PET-AB"};

        System.out.println("=== Cargo Code Validation ===");
        for (String code : cargoCodes) {
            Matcher matcher = cargoPattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("  " + code + " -> Valid");
            } else {
                System.out.println("  " + code + " -> Invalid");
            }
        }

    }
}