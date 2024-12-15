package Classes.Products;
import UserClass.User;

public class Drinks extends Product {
    private boolean isAlcoholic ;
    private String storageCondition ;

    public Drinks(String name, String category, int quantity, int cost, User user) {
        super(name, category, cost);
    }


    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }
    public boolean getAlcoholic() {
        return this.isAlcoholic;
    }

    public void setStorageCondition(String storageCondition) {
        this.storageCondition = storageCondition;
    }
    public String getStorageCondition() {
        return storageCondition;
    }
}
