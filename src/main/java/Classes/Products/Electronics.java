package Classes.Products;
import UserClass.User;

public class Electronics extends Product {
    private int powerConsumption ;

    public Electronics(String name, String category, int quantity, int cost, User user) {
        super(name, category, cost);
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
    public int getPowerConsumption() {
        return powerConsumption;
    }
}
