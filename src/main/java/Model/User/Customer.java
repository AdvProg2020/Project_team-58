package Model.User;

import Model.DiscountCode;
import Model.Log.BuyLog;
import java.util.ArrayList;

public class Customer extends UserAccount {

    private ArrayList<DiscountCode> discountCodes;
    private ArrayList<BuyLog> buyLogs;
    private double wallet;

    public Customer(String username, String password, String firstName, String lastName, String emailAddress, String phoneNumber) {
        super(username, password, firstName, lastName, emailAddress, phoneNumber);
        discountCodes=new ArrayList<DiscountCode>();
        buyLogs=new ArrayList<BuyLog>();
    }
    @Override
    public String getUserAccountType() {
        return "Customer";
    }


}
