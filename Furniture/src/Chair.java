public class Chair extends Furniture {


    public Chair(String material, String color, int nailNumber) {
        super(material, color, nailNumber);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "matetial='" + material + '\'' +
                ", color='" + color + '\'' +
                ", nailNumber=" + nailNumber +
                '}';
    }

}
