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

    public void storeDB() {
        System.out.println(" Supplier storeDB");
    }

    @Override
    public void deleteDB(User user) {

        System.out.println(" Supplier deleteDP");
    }

    @Override
    public void updateDB(User user) {

        System.out.println(" Supplier updateDB");
    }

    @Override
    public void readDB(User user) {

        System.out.println(" Supplier readDB");
    }

    @Override
    public UserType getUserType() {
        return  userType;
    }


}
