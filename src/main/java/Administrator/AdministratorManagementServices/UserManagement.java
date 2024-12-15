package Administrator.AdministratorManagementServices;
import User.user;


public interface UserManagement {

    public boolean addCustomer (user user)     ;
    public boolean updateCustomer (user user)  ;
    public boolean deleteCustomer (user user)  ;
    public void handleCustomerManagement(int userChoice);
}
