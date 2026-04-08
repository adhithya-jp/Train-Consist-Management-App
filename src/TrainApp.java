public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Safe Cargo Assignment ===");

        // Valid assignment
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        try {
            cylindrical.assignCargo("Petroleum");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed for Cylindrical bogie.");
        }

        System.out.println();

        // Invalid assignment
        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        try {
            rectangular.assignCargo("Petroleum");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed for Rectangular bogie.");
        }

        System.out.println();

        // Valid assignment on rectangular
        GoodsBogie rectangular2 = new GoodsBogie("Rectangular");
        try {
            rectangular2.assignCargo("Grain");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed for Rectangular bogie.");
        }

    }
}