public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();   // Магазин з продажу меблів

        FurnitureMaker chairMaker = new ChairMaker();
        TableMaker tableMaker = new TableMaker();
        // Створюємо асортимент меблів - 5 столів і 5 стільців
        for ( int i = 0; i < 5; i++){
            shop.createFurniture(chairMaker);
            shop.createFurniture(tableMaker);
        }

        // Демонструємо меблі у салоні
        shop.demonstrateFurniture();

    }
}