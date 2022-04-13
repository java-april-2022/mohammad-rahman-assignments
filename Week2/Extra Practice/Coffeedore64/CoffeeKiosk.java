import java.util.ArrayList;

public class CoffeeKiosk {
    
    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public CoffeeKiosk(){}

    /*
    The addMenuItem method should create a new item object with the given name and price.
    Add the new Item object to the menu items array.
    The new menu item itself will also need to be assigned an index property. The value should be its position, its index, in the menu array.
    */

    public void addMenuItem(String menuItem, double itemPrice){
        Item newItem = new Item(menuItem, itemPrice);
        menu.add(newItem);
        newItem.setIndex(menu.indexOf(newItem));
    }

    /*
    Now with an array of items you can display the menu without needing separate arrays of names and prices! 
    The displayMenu method should display all of the items from the menu array like so:

    0 banana -- $2.00 
    1 coffee -- $1.50 
    2 latte -- $4.50 
    3 capuccino -- $3.00 
    4 muffin -- $4.00

    */
    
    public void displayMenu(){
        for(Item item : this.menu){
            System.out.printf("%s %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
        }
    }

    /*
    The newOrder method will take input from the user in the terminal to create a new order instance and add it to the orders array. We have given you some code to get you started.
    Tips: 
    The console input will be of type String, no matter they type. 
    You can use the built in String .equals method to do string comparison, rather than the == comparison operator.
    To cast the string to an integer, use the Integer.parseInt method
    */

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order order1 = new Order(name);
        displayMenu();

    	// Prompts the user to enter an item number
        
        // NOTE: I altered the code (taking some of my own codes from Week 1 core assignment) to make this loop more efficient

        String itemNumber;
        boolean more = true;
        
        while(more){

            System.out.println("Please enter a menu item index or Q to quit:");
            itemNumber = System.console().readLine();
            
            // Write a while loop to collect all user's order items
            if(!itemNumber.toLowerCase().equals("q")) {
                
                // Get the item object from the menu, and add the item to the order
                // Ask them to enter a new item index or q again, and take their input
                int i = Integer.parseInt(itemNumber);
                for(Item eachItem : menu){
                    if(eachItem.getIndex() == i){
                        order1.addItem(eachItem);
                    }
                }
            }
            else {
                more = false;
            }
        }
            // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        
        System.out.printf("Thank you, %s. Here are your order details:\n", order1.getName());
        double orderTotal = 0;
        for(Item eachItem : order1.getItems()){
            System.out.printf("%s - $%.2f\n", eachItem.getName(), eachItem.getPrice());
            orderTotal += eachItem.getPrice();
        }
        System.out.printf("Total: $%.2f", orderTotal);

    }

    // NINJA BONUS:  copied this code from solution for study reference only

    public void addMenuItemByInput(){
        String isCompleted = "y";
        while(isCompleted.equals("y")) {
            System.out.println("Please enter the name of the product:");
            String itemName = System.console().readLine();
            while(itemName.isEmpty()){
                System.out.println("Please enter a valid name");
                itemName = System.console().readLine();
            } 
            System.out.println("Please enter the price of the product:");
            String itemPrice = System.console().readLine();
            while(itemPrice.isEmpty()){
                System.out.println("Please enter a valid price");
                itemPrice = System.console().readLine();
            }
            double price =  Double.parseDouble(itemPrice);
            
            addMenuItem(itemName, price);
            System.out.println("Do you want to add another product? y/n");
            isCompleted = System.console().readLine().toLowerCase();
        }
    }

    



}
