package Classes.SupplierManagers;
import Classes.*;
import Classes.Products.Product;
import Interfaces.*;
import Interfaces.AdministratorManagementServices.ProductManagement;

public class SupplierProductManager implements ProductManagement {
    @Override
    public int setPrice(int price, Product product) {
        System.out.println("Supplier");
        return 0;
    }

    @Override
    public void updateProductName(int productId, String newName) {

    }

    @Override
    public void updateProductCategory(int productId, String newCategory) {

    }

    @Override
    public void updateProductQuantity(int productId, int newQuantity) {

    }

    @Override
    public void updateProductCostPrice(int productId, int newCostPrice) {

    }

    @Override
    public void updateProductReStockThreshold(int productId, int newThreshold) {

    }

    @Override
    public void updateProduct(int productID, Product product) {

    }

    @Override
    public void handleProductManagement(int productChoice) {

    }
}
