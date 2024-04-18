public class Furniture {

    protected final String material;
    protected final String color;
    protected final int nailNumber;

    public Furniture(String material, String color, int nailNumber) {
        this.material = material;
        this.color = color;
        this.nailNumber = nailNumber;
    }

    void demo() {
        System.out.println(this);
    }

}
