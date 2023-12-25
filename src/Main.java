import models.Item;
import models.Order;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Item item_1=new Item(1,"Book",560.3);
        Item item_2=new Item(2,"Pen",60.7);
        Item item_3=new Item(3,"Table",5600.3);
        Item item_4=new Item(4,"Copy",600.00);
        Item item_5=new Item(5,"Bag",1200.00);
        Item item_6=new Item(6,"Chair",2100.00);
        Item item_7=new Item(7,"TV",120000.00);
        Item item_8=new Item(8,"Washing Machine",80000.00);
        Item item_9=new Item(9,"Alarm Clock",200.00);


        List<Item> items_firstorder=new ArrayList<>();
        List<Item> items_secondorder=new ArrayList<>();
        List<Item> items_thirdorder=new ArrayList<>();

        items_firstorder.add(item_1);
        items_firstorder.add(item_2);
        items_firstorder.add(item_3);

        items_secondorder.add(item_4);
        items_secondorder.add(item_5);
        items_secondorder.add(item_6);

        items_thirdorder.add(item_7);
        items_thirdorder.add(item_8);
        items_thirdorder.add(item_9);

        Order first_order=new Order(1,  items_firstorder);
        Order second_order=new Order(2,  items_secondorder);
        Order third_order=new Order(3,  items_thirdorder);

        first_order.CustomFunc();
        second_order.CustomFunc();
        third_order.CustomFunc();

    }
}