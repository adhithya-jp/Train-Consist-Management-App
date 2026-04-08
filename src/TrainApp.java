public class TrainApp {

    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG310", "BG402", "BG567", "BG689"};

        System.out.println("=== Linear Search for Bogie ID ===");

        String[] searchKeys = {"BG310", "BG999"};

        for (String key : searchKeys) {
            boolean found = false;
            int foundIndex = -1;

            for (int i = 0; i < bogieIds.length; i++) {
                if (bogieIds[i].equals(key)) {
                    found = true;
                    foundIndex = i;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie " + key + " found at position " + foundIndex + ".");
            } else {
                System.out.println("Bogie " + key + " not found in consist.");
            }
        }

    }
}