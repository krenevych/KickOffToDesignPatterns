public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();   // Магазин з продажу меблів

        // Створюємо асортимент меблів - 5 столів і 5 стільців
        for ( int i = 0; i < 5; i++){
            shop.createFurniture(Shop.Type.CHAIR);
            shop.createFurniture(Shop.Type.TABLE);
        }

        // Демонструємо меблі у салоні
        shop.demonstrateFurniture();

    }
}