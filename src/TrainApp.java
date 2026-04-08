public class TrainApp {

    public static void main(String[] args) {

        int[] capacities = {72, 48, 110, 64, 36, 90};

        System.out.println("=== Sort Passenger Bogies by Capacity ===");

        System.out.print("Before sorting: ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Bubble sort
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp        = capacities[j];
                    capacities[j]   = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.print("After sorting:  ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        System.out.println();

    }
}