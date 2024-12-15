package Classes.Products;
import User.user;

public class Fruits extends Product {

    private String storageCondition ;

    public Fruits(String name, String category, int quantity, int cost, user user) {
        super(name, category, cost);
    }

    public void setStorageCondition(String storageCondition) {
        this.storageCondition = storageCondition;
    }
    public String getStorageCondition() {
        return storageCondition;
    }
}
