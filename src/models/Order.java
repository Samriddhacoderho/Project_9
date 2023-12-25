package models;
import java.util.List;

public class Order {
    int id;
    List<Item> items;

    public Order(int id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void CustomFunc(){
        int hereid=this.id;
        double total=0.0;
        List<Item> hereitem=this.items;

        System.out.println("**SatyalBazar**");
        System.out.println("\n\n**Order Slip**\n\n");

        for(Item x:hereitem){
            System.out.println(x.getProduct_id()+"******"+x.getProduct_name()+"******"+x.getProduct_price());
            total=total+x.getProduct_price();
        }
        System.out.println("Total Price:Nrs."+total);
    }
}
