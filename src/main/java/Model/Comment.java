package Model;

public class Comment {
    private String productID;
    private String username;
    private String text;
    private String currentCondition;
    private boolean didCustomerBuyThisProduct;

    public Comment(String productID, String username, String text, boolean didCustomerBuyThisProduct){

        this.productID = productID;
        this.username = username;
        this.text = text;
        this.didCustomerBuyThisProduct = didCustomerBuyThisProduct;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }
}
