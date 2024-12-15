package Administrator.AdminManagers;

import Classes.Products.Product;
import Administrator.AdministratorManagementServices.ProductManagement;

public class ProductManager  implements ProductManagement {

    @Override
    public int setPrice(int price, Product product) {
        System.out.println("Admin");
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

    public void handleProductManagement(int productChoice) {

    }
}
