package Controller;

import Model.Log.Log;
import Model.User.UserAccount;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class UserManager {
    private ArrayList<UserAccount> allAccounts;

    public UserManager() {
        allAccounts = new ArrayList<UserAccount>();
    }

    public boolean doesUserPassMatch(String userName, String passWord) {
        getUserByUserName(userName);
        if (passWord.equals(getUserByUserName(userName).getPassword())) {
            return true;
        }
        return false;
    }

    public void changePersonalInfo(UserAccount userAccount) {

    }

    public HashMap<String, String> getPersonalInfo(UserAccount userAccount) {
        HashMap<String, String> getPersonalInfo = new HashMap<String, String>();
        getPersonalInfo.put("userName", userAccount.getUsername());
        getPersonalInfo.put("lastName", userAccount.getUsername());
        getPersonalInfo.put("firsName", userAccount.getUsername());
        return getPersonalInfo;
    }

    public UserAccount getUserByUserName(String userName) {
        for (UserAccount allAccount : allAccounts) {
            if (userName.equals(allAccount.getUsername()))
                return allAccount;
        }
        return null;
    }


    public String getUserType(UserAccount userAccount) {
        return (userAccount.getUserAccountType());
    }

    public void removeUser(String userName) {
        allAccounts.remove(getUserByUserName(userName));
    }

    public boolean isThereUserWithUsername(String userName) {
        if (getUserByUserName(userName) == null) {
            return false;
        }
        return true;
    }
}