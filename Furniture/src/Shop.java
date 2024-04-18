import java.util.ArrayList;
import java.util.List;

public class Shop {
    public enum Type {
        TABLE,
        CHAIR,
    }

    // Cписок стільців, що є в наявності в магазині
    private final List<Chair> chairs = new ArrayList<>();

    // Cписок столів, що є в наявності в магазині
    private final List<Table> tables = new ArrayList<>();

    // Сировина для виготовлення столів
    protected String material = "Wood";  // матеріал
    protected String color = "Crimson";  // фарба
    protected int nailNumber = 100;      // цвяхи, шурупи тощо

    // Демонструвати меблі в салоні
    void demonstrateFurniture(){
        chairs.forEach(Chair::demo);
        tables.forEach(Table::demo);
    }

    // Виготовити нові меблі за типом
    void createFurniture(Type type){
        if (type == Type.CHAIR){
            Chair chair = new Chair(material, color, nailNumber);
            chairs.add(chair);
        }else if (type == Type.TABLE){
            Table table = new Table(material, color, nailNumber);
            tables.add(table);
        }
    }

}
