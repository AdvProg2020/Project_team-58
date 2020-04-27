package Model.User;

public class Manager extends UserAccount {

    public Manager(String username, String password, String firstName, String lastName, String emailAddress, String phoneNumber) {
        super(username, password, firstName, lastName, emailAddress, phoneNumber);
    }

    @Override
    public String getUserAccountType() {
        return "Manager";
    }
}
