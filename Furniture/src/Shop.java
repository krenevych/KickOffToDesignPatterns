import java.util.ArrayList;
import java.util.List;

public class Shop {

    public enum Type {  // Типи меблів, що може надавати
        TABLE,
        CHAIR,
    }

    // Сировина для виготовлення меблів
    private String material = "Wood";  // матеріал
    private String color = "Crimson";  // фарба
    private int nails = 100;           // цвяхи, шурупи тощо

    // Cписок стільців, що є в наявності в магазині
    private final List<Chair> chairs = new ArrayList<>();

    // Cписок столів, що є в наявності в магазині
    private final List<Table> tables = new ArrayList<>();

    // Демонструвати меблі в салоні
    void demonstrateFurniture(){
        chairs.forEach(Chair::demo);
        tables.forEach(Table::demo);
    }

    // Виготовити нові меблі за типом
    void createFurniture(Type type){
        if (type == Type.CHAIR){
            Chair chair = new Chair(material, color, nails);
            chairs.add(chair);
        }else if (type == Type.TABLE){
            Table table = new Table(material, color, nails);
            tables.add(table);
        }
    }

}
