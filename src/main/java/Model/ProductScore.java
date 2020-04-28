package Model;

import Model.User.Customer;


public class ProductScore {
    private int score;
    private Product product;
    private Customer customer;

    public ProductScore(int score, Product product, Customer customer) {
        this.score = score;
        this.product = product;
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getScore() {
        return score;
    }
}
