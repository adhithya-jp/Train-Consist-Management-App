public class PassengerBogie {

    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Invalid capacity: " + capacity + " for bogie: " + name +
                            ". Capacity must be greater than zero."
            );
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (capacity: " + capacity + ")";
    }
}