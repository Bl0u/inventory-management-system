package Classes.AdminManagers;


import Classes.* ;
import Classes.Users.User;


import Interfaces.* ;
import Interfaces.AdministratorManagementServices.UserManagement;

public class CustomerManager  implements UserManagement {


    @Override
    public boolean addCustomer(User user) {
        return false;
    }

    @Override
    public boolean updateCustomer(User user) {
        return false;
    }

    @Override
    public boolean deleteCustomer(User user) {
        return false;
    }
}
