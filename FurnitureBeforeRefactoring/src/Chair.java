public class Chair {

    private final String material;
    private final String color;
    private final int nailNumber;

    public Chair(String material, String color, int nailNumber) {
        this.material = material;
        this.color = color;
        this.nailNumber = nailNumber;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", nailNumber=" + nailNumber +
                '}';
    }

    public void demo() {
        System.out.println(this);
    }
}
