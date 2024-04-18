public class ChairMaker implements FurnitureMaker {
    @Override
    public Furniture createFurniture(String material, String color, int nailNumber) {
        return new Chair(material, color, nailNumber);
    }
}
