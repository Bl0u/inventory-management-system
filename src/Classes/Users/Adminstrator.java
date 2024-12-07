package Classes.Users;

import Classes.*;
import Classes.AdminManagers.ProductManager;
import Classes.InterfaceManagers.AdministratorInterfaceManager;
import Classes.Users.User;
import Classes.enums.UserType;

import Interfaces.*;
import Interfaces.AdministratorManagementServices.ProductManagement;
import Interfaces.InterfaceManagement.AdministratorInterfaceManagement;

public class Adminstrator extends User {
    UserType userType = UserType.ADMIN ;
    public AdministratorInterfaceManager administratorInterfaceManager =
            new AdministratorInterfaceManager();
    ProductManager productManager = new ProductManager();
    public Adminstrator(String name, String email) {
        super(name, email, UserType.ADMIN);
    }

    public Adminstrator() {

    }

    @Override
    public ProductManagement getProductManagementInterface() {
        return productManager;
    }

    @Override
    public UserType getUserType() {
        return userType;
    }

    public AdministratorInterfaceManagement adminInterface(){
        return this.administratorInterfaceManager;
    }



}
