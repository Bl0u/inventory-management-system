package Interfaces.AdministratorManagementServices;

import Classes.* ;
import Classes.Products.Product;


import java.security.PublicKey;
import java.time.LocalDate;

public interface ProductManagement {

    public int setPrice(int price, Product product) ;
    public void updateProductName(int productId, String newName);
    public void updateProductCategory(int productId, String newCategory);
    public void updateProductQuantity(int productId, int newQuantity);
    public void updateProductCostPrice(int productId, int newCostPrice);
    public void updateProductReStockThreshold(int productId, int newThreshold);
    public void updateProduct(int productID, Product product) ;
    public void handleProductManagement(int productChoice);

}