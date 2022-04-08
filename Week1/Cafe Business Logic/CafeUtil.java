import java.util.ArrayList;
import java.text.DecimalFormat;

public class CafeUtil {
    
    /*

        METHOD 1: Instructions

        int getStreakGoal()

        Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before. To calculate how many drinks they need after 10 weeks, write a method that sums together every consecutive integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3.. and so on up to 10 and return the result.

        Test your code before moving on! Don't forget to make an instance of your CafeUtil class to use in the test file. The number printed should be 55.

        Ninja Bonus:  Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.


    */

    public int getStreakGoal() {
        int sum = 0;
        for(int x = 1; x < 11; x++) {
            sum += x;
        }
        return sum;
    }


    // Ninja Bonus:  Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for(int x = 1; x <= numWeeks; x++) {
            sum += x;
        }
        return sum;
    }

    /*
        METHOD 2: Instructions

        double getOrderTotal(double[] prices)

        Given an array of item prices from an order, sum all of the prices in the array and return the total. 

        Don't forget to test your code! Find the lines of test code for this method in TestCafe.java and uncomment it before you compile and run.


    */

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for(int x = 0; x < prices.length; x++) {
            total += prices[x];
        }
        return total;
    }


    /*
        METHOD 3: Instructions

        void displayMenu(ArrayList<String> menuItems)

        Given an ArrayList of menu items (strings), print out each index and menu item. 

        Sample output given an  ArrayList with the items "drip coffee",  "cappuccino",  "latte" and  "mocha"

    */

    public void displayMenu(ArrayList<String> menuItems) {
        for(int x = 0; x < menuItems.size(); x++) {
            // System.out.println(x + " " + menuItems.get(x));
            System.out.printf("%s %s \n", x, menuItems.get(x));
        }
    }

    /*
        METHOD 4: 

        addCustomer(ArrayList<String> customers)

        Inside this method:

        Print this string to the console: "Please enter your name:"
        Then add this line of code to get user input from the terminal and store it in the variable  userName: 
        String userName = System.console().readLine();copy
        Next print the userName to the console, saying "Hello, [user name here]!"
        Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
        Then, add the customer's name to the given customers list. And print the list.
        No need to return anything.

    */

    public void addCustomer(ArrayList<String> customers) {
        System.out.printf("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! \n", userName);
        System.out.printf("There are %s people in front of you. \n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

    /*
        NINJA BONUS #1:

        void printPriceChart(String product, double price, int maxQuantity)

        Given a product, price and a maxQuantity, create a method that prints the cost for buying 1, then the price for buying 2, then for 3.. and so on, up to the max. For example, if the product is "Columbian Coffee Grounds" with a price of 15.0 and maxQuantity of 3, you should print:

        Columbian Coffee Grounds
        1 - $15.00
        2 - $30.00
        3 - $45.00

        Tip: You can use the escape character \n within your string for line breaks.

        Sensei bonus:  Format the prices as currency. Hint: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

        Senpai Bonus: Take $0.50 more off of the original price every time the quantity increases. Example: Given a $2.00 price and 4 max, where the prices would normally be $2, $4, $6 and $8, the discount would yield $2, $3.50, $5, and $6.50, progressively taking off $0.50, then $1, then $1.50 from the group tag price:

        1 - $2.00
        2 - $3.50 
        3 - $5.00 
        4 - $6.50

    */

    public void printPriceChart(String product, double price, int maxQuantity) {
       System.out.println(product);
       // SENSEI BONUS - decimal/currency format
       DecimalFormat df = new DecimalFormat("0.00");
       for(int x = 1; x <= maxQuantity; x++) {
           System.out.printf("%s - $%s\n", x, df.format((price * x))); 
       }
    }

    // SENPAI BONUS - WITH DISCOUNT
     public void printPriceChart(String product, double price, int maxQuantity, double discount) {
       System.out.println(product);
       DecimalFormat df = new DecimalFormat("0.00");
       for(int x = 1; x <= maxQuantity; x++) {
           System.out.printf("%s - $%s\n", x, df.format((price * x) - ((x - 1) * discount))); 
       }
    }


    /*
        NINJA BONUS #2:

        boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)

        Let's overload the display menu! Given 2 arrays, an ArrayList of menu items (strings, and an ArrayList of prices (doubles) print a menu! 

        However, first check:  if the arrays are not the same size, immediately return false.

        To print the menu, iterate from 0 to the last index. Each time through, print on the same line:

        a.) The index, b.) The menu item at that index, and c.) The price at that index. 
        Finally, return true.

        Sample output:

        0 drip coffee -- $1.50
        1 cappucino -- $3.50
        2 latte -- $4.50
        3 mocha -- $3.50 
    */
    

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        
        if(menuItems.size() != prices.size()) return false;

        DecimalFormat df = new DecimalFormat("0.00");

        for(int x = 0; x < menuItems.size(); x++) {
            System.out.printf("%s %s -- $%s\n", x, menuItems.get(x), df.format(prices.get(x)));
        }
        return true;
    }


    /*
        SENSEI BONUS:

        Make a method addCustomers where a barista can enter multiple customers. Hint: You can use a while loop and ask the user to type "q" when they are finished entering names.

    */

    public void addCustomers(ArrayList<String> customers) {
        //ArrayList<String> customers = new ArrayList<String>();
        String customerName;
        boolean more = true;
        while(more) {
            System.out.printf("Please enter customer name (or press Q to quit): ");
            customerName = System.console().readLine();
            if(customerName.toLowerCase().equals("q")) {
                more = false;
                System.out.printf("Here is a list of all your customers: %s\n", customers);
                return;
            }
            customers.add(customerName);
            System.out.printf("%s has been added to the database: %s\n", customerName, customers);
        }
        
    }
}