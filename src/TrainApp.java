public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Handle Invalid Bogie Capacity ===");

        // Valid bogie
        try {
            PassengerBogie validBogie = new PassengerBogie("Sleeper", 72);
            System.out.println("Bogie created successfully: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Invalid bogie - zero capacity
        try {
            PassengerBogie zeroBogie = new PassengerBogie("AC Chair", 0);
            System.out.println("Bogie created successfully: " + zeroBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Invalid bogie - negative capacity
        try {
            PassengerBogie negativeBogie = new PassengerBogie("First Class", -10);
            System.out.println("Bogie created successfully: " + negativeBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}