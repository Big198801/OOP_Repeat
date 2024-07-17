package Products;

import java.security.PublicKey;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Product(String name){
        this.name = name;
    }

    public void setPrice(Double value){
        if (value <= 0){
            throw new IllegalStateException(String.format("Цена указана неверно %.2f", value));
        }
        this.price = value;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
