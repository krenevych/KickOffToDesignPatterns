public class Chair {

    private final String material;
    private final String color;
    private final int nailNumber;

    public Chair(String matetial, String color, int nailNumber) {
        this.material = matetial;
        this.color = color;
        this.nailNumber = nailNumber;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "matetial='" + material + '\'' +
                ", color='" + color + '\'' +
                ", nailNumber=" + nailNumber +
                '}';
    }

    void demo() {
        System.out.println(this);
    }
}
