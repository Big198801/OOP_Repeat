import Products.BottleOfWater;
import Products.HotWater;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) {
        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(new Product("Mars", 50.00));
        itemMachine.addProduct(new Product("Twix", 30.00));
        itemMachine.addProduct(new Product("Bread", 20.0));
        itemMachine.addProduct(new Product("Chips", 40.00));
        itemMachine.addProduct(new BottleOfWater("Cola", 70.00, 500));
        itemMachine.addProduct(new HotWater("Tea", 45, 300, 60));

        for (Product prod :
                itemMachine.getAllProducts()) {
            System.out.println(prod.toString());
        }

    }
}
