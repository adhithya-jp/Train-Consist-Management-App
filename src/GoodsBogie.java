public class GoodsBogie {

    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
            throw new CargoSafetyException(
                    "Unsafe assignment: Petroleum cannot be carried in a Rectangular bogie."
            );
        }
        this.cargo = cargo;
        System.out.println("Cargo assigned: " + cargo + " to " + shape + " bogie.");
    }

    public String toString() {
        return shape + " bogie carrying " + cargo;
    }
}