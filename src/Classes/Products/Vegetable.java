package Classes.Products;

import Classes.*;
import Classes.Users.Supplier;
import Classes.Users.User;
import Interfaces.AdministratorManagementServices.ProductManagement;

public class Vegetable extends Product{

    private String storageCondition ;

    public Vegetable(String name, String category, int quantity, int cost, User user) {
        super(name, category, cost, user);
    }


    public void setStorageCondition(String storageCondition) {
        this.storageCondition = storageCondition;
    }
    public String getStorageCondition() {
        return storageCondition;
    }
}
