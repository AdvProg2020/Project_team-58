package Model;

import java.util.ArrayList;
import java.util.HashSet;

public class Category {
    private String name;
    private ArrayList<Product> products;
    private HashSet<String> specificAttributes;

    public Category(String name){

        this.name = name;
        products=new ArrayList<Product>();
        specificAttributes=new HashSet<String>();
    }

    public String getName() {
        return name;
    }

    public HashSet<String> getSpecificAttributes() {
        return specificAttributes;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProducts(Product product) {
        products.add(product);
    }

    public void addSpecificAttributes(String specificAttribute) {
        specificAttributes.add(specificAttribute);
    }
}
