import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this.name = "Guest";
        this.items =  new ArrayList<Item>();
    }
    public Order(String name){
        this.name = name;
        this.items =  new ArrayList<Item>();
    }
    public String getName(){
        return this.name;
    }
    public boolean getReady(){
        return this.ready;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public void addItem(Item item){
        items.add(item);
        //Hint: How do you get the price of a given item instance from outside the Item class?
    }
    public String getStatusMessage(){
        // System.out.println("Getting status...");
        if(this.ready){
            return String.format("Your order is ready, %s", this.name);
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }
    public void display(){
        System.out.println("\n<----ORDER---->");
        System.out.printf("Customer name: %s\n",this.name);
        for(Item item : items){
            System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n",getOrderTotal());
    }

}
