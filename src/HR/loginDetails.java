package HR;

import java.util.ArrayList;

public class loginDetails {


    public enum UserType {
        EMPLOYEE,
        HR,
        MANAGER;
    }



    private String userName;
    private String userPassword;
    private String userType;
    private int userId;

    public loginDetails(String name, String password, String type, int id) {
        userName = name;
        userPassword = password;
        userType = type;
        userId = id;

// 1 = Employee
// 2 = HR
// 3 = HR Manager
    }

    public boolean checkDetails(int id, String password, String type) {

        return (id == this.userId && this.userPassword.equals(password) && this.userType.equals(type));

    }


}
