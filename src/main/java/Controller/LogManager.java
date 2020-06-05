package Controller;
import Model.Log.Log;
import Model.Log.SellLog;
import Model.User.UserAccount;

import java.util.ArrayList;
import java.util.Random;

public class LogManager {
    private ArrayList<Log>allLogs;

    public LogManager() {
        allLogs = new ArrayList<Log>();
    }

    public void createSellLog(String date, double receivedMoney, double discountBySale, UserAccount buyer){
        allLogs.add(new SellLog(idGenerator(date,"Sell Log"),date,null,receivedMoney,  discountBySale, buyer));

    }
    public void createByLog(String date,double paidMoney,double discountByCode){}
    public String idGenerator(String date, String logType){
        String prefix;
        if(logType.equals("Sell Log"))
            prefix="SL";
        else
            prefix="BL";
        Random random=new Random();
        int rand = random.nextInt(8999) + 1000;
        return prefix + date + rand;
    }
    public String getLogType(Log log){
        return log.getType();
    }

}
