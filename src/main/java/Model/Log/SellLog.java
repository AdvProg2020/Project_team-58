package Model.Log;

import Model.User.UserAccount;

public class SellLog extends Log{

    private double receivedMoney;
    private double discountBySale;
    private UserAccount buyer;
    private boolean isShipped;

    public SellLog(String id, String date, UserAccount owner, double receivedMoney, double discountBySale, UserAccount buyer) {
        super(id, date, owner);
        this.receivedMoney = receivedMoney;
        this.discountBySale = discountBySale;
        this.buyer = buyer;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public void shipped(){
        isShipped=true;
    }

    public UserAccount getBuyer() {
        return buyer;
    }

    public String getType() {
        return "Sell Log";
    }
}
