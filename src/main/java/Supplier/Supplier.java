package Supplier;

import Classes.SupplierManagers.*;


import Classes.enums.UserType;
import UserClass.User;

public class Supplier extends User {
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
    public void storeDB(User user) {
        System.out.println("Store supplier");
    }


    @Override
    public UserType getUserType() {
        return  userType;
    }


}
