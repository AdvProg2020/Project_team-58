package Model.Log;

import Model.User.UserAccount;
import java.util.ArrayList;

public class BuyLog extends Log {

    private double paidMoney;
    private double discountByCode;
    private ArrayList<UserAccount> sellers;
    private boolean isDelivered;

    public BuyLog(String id, String date, UserAccount owner, double paidMoney, double discountByCode) {
        super(id, date, owner);
        this.paidMoney = paidMoney;
        this.discountByCode = discountByCode;
        this.sellers = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getSellers() {
        return sellers;
    }

    public void addSellers(UserAccount seller){
        sellers.add(seller);
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void delivered(){
        isDelivered=true;
    }
}
