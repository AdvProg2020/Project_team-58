package Model;

import Model.User.Customer;

import java.util.ArrayList;
import java.util.Random;

public class DiscountCode {

    private String code;
    private String startTime;
    private String endTime;
    private int offPercentage;
    private int numberOfCharges;
    private ArrayList<Customer> customers;

    public DiscountCode(String startTime, String endTime, int offPercentage, int numberOfCharges){
        this.startTime = startTime;
        this.endTime = endTime;
        this.offPercentage = offPercentage;
        this.numberOfCharges = numberOfCharges;
        customers=new ArrayList<Customer>();
        this.code=this.generateCode();
    }

    private String generateCode(){
        Random random=new Random();
        return "c" + numberOfCharges + 'p' + offPercentage + random.nextInt(offPercentage * numberOfCharges * 100);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
        customer.addDiscountCode(this);
    }

    public String getCode() {
        return code;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}
