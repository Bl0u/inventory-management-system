package Interfaces.AdministratorManagementServices;
import Classes.* ;
import Classes.Users.User;


public interface UserManagement {

    public boolean addCustomer (User user)     ;
    public boolean updateCustomer (User user)  ;
    public boolean deleteCustomer (User user)  ;
    public void handleCustomerManagement(int userChoice);
}
