import java.util.ArrayList;
import java.util.List;

public class Shop {

    // Сировина для виготовлення меблів
    private String material = "Wood";  // матеріал
    private String color = "Crimson";  // фарба
    private int nails = 100;           // цвяхи, шурупи тощо

    // Список стільців, що є в наявності в магазині
    private final List<Furniture> furnitureList = new ArrayList<>();

    // Демонструвати меблі в салоні
    void demonstrateFurniture(){
        furnitureList.forEach(Furniture::demo);
    }

    // Виготовити нові меблі за типом
    void createFurniture(FurnitureMaker furnitureMaker){
        Furniture furniture = furnitureMaker.createFurniture(material, color, nails);
        furnitureList.add(furniture);
    }

}
