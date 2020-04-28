package Model;

import java.util.ArrayList;

public class OffSale {
    private String startTime;
    private String endTime;
    private int offPercentage;
    private String currentCondition;
    private ArrayList<Product> includedProducts;


    public OffSale(String startTime, String endTime, int offPercentage) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.offPercentage = offPercentage;
        includedProducts=new ArrayList<Product>();
    }

    public ArrayList<Product> getIncludedProducts() {
        return includedProducts;
    }

    public void addProduct(Product product){
        includedProducts.add(product);
    }

    public int getOffPercentage() {
        return offPercentage;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }
}
