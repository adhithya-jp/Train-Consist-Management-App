public class TrainApp {

    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG310", "BG402", "BG567", "BG689"};

        System.out.println("=== Binary Search for Bogie ID ===");

        String[] searchKeys = {"BG402", "BG999"};

        for (String key : searchKeys) {

            int low   = 0;
            int high  = bogieIds.length - 1;
            boolean found = false;

            while (low <= high) {
                int mid = (low + high) / 2;
                int result = key.compareTo(bogieIds[mid]);

                if (result == 0) {
                    System.out.println("Bogie " + key + " found at position " + mid + ".");
                    found = true;
                    break;
                } else if (result > 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (!found) {
                System.out.println("Bogie " + key + " not found in consist.");
            }
        }

    }
}