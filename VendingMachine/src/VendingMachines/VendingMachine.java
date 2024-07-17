package VendingMachines;

import Products.Product;

import java.awt.*;
import java.util.ArrayList;

public class VendingMachine {
    private int volume;
    private List<Product> products;
    private List<String> workLog;

    public  VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}
