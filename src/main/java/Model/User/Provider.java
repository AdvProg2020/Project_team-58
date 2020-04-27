package Model.User;

import Model.Log.SellLog;
import Model.OffSale;
import Model.Product;
import java.util.ArrayList;

public class Provider extends UserAccount{

    private String companyName;
    private ArrayList<SellLog> sellLogs;
    private ArrayList<Product> currentProducts;
    private ArrayList<OffSale> currentOffSales;
    private boolean isActivated;

    public Provider(String username, String password, String firstName, String lastName, String emailAddress, String phoneNumber,String companyName) {
        super(username, password, firstName, lastName, emailAddress, phoneNumber);
        this.companyName=companyName;
        sellLogs=new ArrayList<SellLog>();
        currentOffSales=new ArrayList<OffSale>();
        currentProducts=new ArrayList<Product>();
    }

    @Override
    public String getUserAccountType() {
        return "Provider";
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void activate() {
        isActivated = true;
    }
}
