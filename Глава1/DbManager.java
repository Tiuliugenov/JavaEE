package Servlets.db;
import java.util.ArrayList;
public class DbManager {
//    public static ArrayList<Items>items=new ArrayList<>();
//    private static long id = 5L;
//    static {
//        items.add(new Items(1L, "Iphone", 400000, 40));
//        items.add(new Items(2L, "Nokia", 30000, 20));
//        items.add(new Items(3L, "LG", 55000, 5));
//        items.add(new Items(4L, "Samsung", 50000, 75));
//    }
//    public static void addItem (Items item){
//        item.setId(id);
//        items.add(item);
//        id++;
//    }
//    public static ArrayList<Items> getItems(){
//        return items;
//    }
    public static ArrayList<Footballer>footballers=new ArrayList<>();
    private static long id = 0L;
    public static void  addFootballer(Footballer footballer) {
        footballer.setId(id);
        footballers.add(footballer);
        id++;
    }public static ArrayList<Footballer> getFootballers(){
        return footballers;
    }
}

