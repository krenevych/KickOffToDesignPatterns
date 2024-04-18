public class TableMaker implements FurnitureMaker {
    @Override
    public Furniture createFurniture(String material, String color, int nailNumber) {
        return new Table(material, color, nailNumber);
    }
}
