import java.text.DecimalFormat;
import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        CoffeeKiosk newKiosk = new CoffeeKiosk();

        newKiosk.addMenuItem("mocha", 3.5);
        newKiosk.addMenuItem("latte", 6.45);
        newKiosk.addMenuItem("drip coffee", 4.25);
        newKiosk.addMenuItem("cappuccino", 5.75);

        newKiosk.addMenuItemByInput();
        newKiosk.newOrder();
        


    }
}
