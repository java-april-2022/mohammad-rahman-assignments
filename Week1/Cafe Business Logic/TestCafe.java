import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

public class TestCafe {
    public static void main(String[] args) {
        
    /* 
        You will need add 1 line to this file to create an instance 
        of the CafeUtil class. 
        Hint: it will need to correspond with the variable name used below..
    */
    
        CafeUtil appTest = new CafeUtil();



        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());
        System.out.printf("Purchases needed by week 12: %s \n\n", appTest.getStreakGoal(12));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        // Adding my own code here to format the OrderTotal value in 2 decimal places  as I have OCD
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("Order total: %s \n\n",df.format(appTest.getOrderTotal(lineItems)));
        

        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

        System.out.println("\n");
        System.out.println("----- Price Chart Test-----");
        appTest.printPriceChart("Brazilian Dark Roast", 9.50, 4);
        System.out.println("\n");
        System.out.println("----- Price Chart Test with Discount -----");
        appTest.printPriceChart("Brazilian Dark Roast", 9.50, 4, 0.5);
        

        System.out.println("\n");
        System.out.println("----- Overloaded Display Menu Test-----");
        ArrayList<Double> itemPrices = new ArrayList<Double>();
        itemPrices.add(1.5);
        itemPrices.add(3.5);
        itemPrices.add(4.5);
        itemPrices.add(3.5);
        appTest.displayMenu(menu, itemPrices);

        System.out.println("\n");
        System.out.println("----- Add Customer Test-----");
        ArrayList<String> customerDatabase = new ArrayList<String>();
        customerDatabase.add("Liz");
        customerDatabase.add("David");
        customerDatabase.add("Sally");
        customerDatabase.add("John");
        appTest.addCustomers(customerDatabase);
        
        // Just for my own learning, I'm checking to see if the ArrayList in the test class scope was updated even though the method did not actually return this ArrayList
        System.out.printf("Back in the test class, the database contains: %s", customerDatabase);
    }
}
