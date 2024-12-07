package Classes.Users;

import Classes.*;
import Classes.SupplierManagers.*;
import Classes.Users.User;
import Interfaces.*;


import Classes.enums.UserType;
import Interfaces.AdministratorManagementServices.ProductManagement;

public class Supplier extends User  {
    UserType userType = UserType.SUPPLIER ;
    public SupplierProductManager supplierProductManager = new SupplierProductManager();
    public SupplierStockManager supplierStockManager = new SupplierStockManager();
    public Supplier(String name, String email){
        super(name, email, UserType.SUPPLIER) ;

    }

    public Supplier() {

    }

    @Override
    public ProductManagement getProductManagementInterface() {
        return supplierProductManager;
    }

    @Override
    public UserType getUserType() {
        return  userType;
    }


}
