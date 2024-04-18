public class SofaMaker implements FurnitureMaker {
    @Override
    public Furniture createFurniture(String material, String color, int nailNumber) {
        return new Sofa(material, color, nailNumber);
    }
}
