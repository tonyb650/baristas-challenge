public class TestOrders {
    public static void main(String[] args){

        Item item1 = new Item("coffee",3.00);
        Item item2 = new Item("mocha",5.50);
        Item item3 = new Item("latte",4.25);
        Item item4 = new Item("capuccino",4.00);
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");
        Order order6 = new Order("Sam");
        System.out.println(order4);
        order1.addItem(item1);
        order2.addItem(item3);
        order2.addItem(item2);
        order3.addItem(item3);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item2);
        order4.addItem(item2);
        order5.addItem(item3);
        order6.addItem(item4);
        System.out.println(order1.getOrderTotal());
        order1.setReady(true);
        order3.setReady(true);
        order5.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());
        System.out.println(order6.getStatusMessage());
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        order6.display();
    }
}
