package Model.Log;

import Model.Product;
import Model.User.UserAccount;

import java.util.ArrayList;

public abstract class Log {
    private String id;
    private String date;
    private UserAccount owner;
    private ArrayList<Product> productList;

    public Log(String id,String date,UserAccount owner){
        this.id = id;
        this.date = date;
        this.owner = owner;
        productList=new ArrayList<Product>();
    }

    public UserAccount getOwner() {
        return owner;
    }

    public String getDate() {
        return date;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public abstract String getType(Log log);
}
