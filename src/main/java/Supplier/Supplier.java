package Supplier;

import Classes.SupplierManagers.*;


import Classes.enums.UserType;
import Administrator.AdministratorManagementServices.ProductManagement;
import User.user;

public class Supplier extends user {
    UserType userType = UserType.SUPPLIER ;
    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }



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
