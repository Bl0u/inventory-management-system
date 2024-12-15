package Classes.Users;
import Classes.enums.UserType;
import Administrator.AdministratorManagementServices.ProductManagement;
import User.user;

public class Customer extends user {
    UserType userType = UserType.CUSTOMER ;

    @Override
    public ProductManagement getProductManagementInterface() {
        return null;
    }

    @Override
    public UserType getUserType() {
        return userType;
    }
    public Customer(int id){}
    public Customer(String name, String email){}
    public Customer(int id, String name, String email){}
    public Customer (){}
}
