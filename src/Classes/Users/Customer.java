package Classes.Users;
import Classes.*;
import Classes.enums.UserType;
import Classes.enums.WorkFlow;
import Interfaces.*;
import Interfaces.AdministratorManagementServices.ProductManagement;

import java.util.Scanner;

public class Customer extends User {
    UserType userType = UserType.CUSTOMER ;

    @Override
    public ProductManagement getProductManagementInterface() {
        return null;
    }

    @Override
    public UserType getUserType() {
        return userType;
    }

}
