package VendingMachines;

import Products.Product;

import java.util.List;
import java.util.ArrayList;

public class VendingMachine {
    private int volume;
    private List<Product> products;
    private List<String> workLog;

    public  VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<>();
        workLog = new ArrayList<>();
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
    public void addSales(String line){
        workLog.add(line);
    }

    public Product getProductByName(String name){
        for (Product prod: products
             ) {
            if (prod.getName().contains(name)){
                return prod;
            }
        }return null;
    }

   public void getAllProducts(){
       for (Product pr: products
            ) {
           System.out.println(pr.toString());
       }
   }
}
