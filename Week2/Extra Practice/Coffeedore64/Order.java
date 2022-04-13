import java.text.DecimalFormat;
import java.util.ArrayList;

public class Order {
    
    
    private String name;
    // This time do not include the total member variable, as we will be using a method for getting the total.
    // private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name){
        this.name = name;
        this.ready = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return this.items; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItem(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for(Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("Customer Name: %s\n", this.name);
        DecimalFormat df = new DecimalFormat("0.00");
        for(Item item : this.items){
            System.out.printf("%s - $%s\n", item.getName(), df.format(item.getPrice()));
        }
        System.out.printf("Total: $%s\n", this.getOrderTotal());
    }







}
