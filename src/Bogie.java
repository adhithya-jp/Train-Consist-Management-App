public class Bogie {

    String name;
    String type;
    int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (capacity: " + capacity + ")";
    }
}