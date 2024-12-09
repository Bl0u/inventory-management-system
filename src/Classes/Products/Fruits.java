package Classes.Products;
import Classes.*;
import Classes.Users.Supplier;
import Classes.Users.User;
import Interfaces.AdministratorManagementServices.ProductManagement;

public class Fruits extends Product {

    private String storageCondition ;

    public Fruits(String name, String category, int quantity, int cost, User user) {
        super(name, category, cost);
    }

    public void setStorageCondition(String storageCondition) {
        this.storageCondition = storageCondition;
    }
    public String getStorageCondition() {
        return storageCondition;
    }
}
