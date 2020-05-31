package Controller;

import Model.User.UserAccount;

public class Login {
    private static UserAccount loggedInUser;
    private static UserManager userManager;

    public static UserAccount getLoggedInUser() {
        return loggedInUser;
    }
    public static String login(String username,String password){
        userManager=new UserManager();
        if(!userManager.isThereUserWithUsername(username)) return "Wrong Username";
        else{
            if(!userManager.doesUserPassMatch(username,password)) return "Wrong Password";
                else {
                    loggedInUser=userManager.getUserByUsername(username);
            }
        }
        return "Login Successful";
    }
}
