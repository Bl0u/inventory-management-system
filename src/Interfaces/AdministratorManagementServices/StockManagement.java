
package Interfaces.AdministratorManagementServices;

import Classes.*;
import Classes.Products.Product;
import Classes.Users.User;


import java.time.LocalDate;
public interface StockManagement {

    public void addProductToTheStock() ;
    public void deleteProductFromTheStock();
    public void printAllStock() ;
    public void reStockProduct() ;
    /*
    int productID, String name, int quantity, int costPrice,
                                  int reStockThreashold
    */
    public void searchProductInTheStock(int id) ;
    public void searchProductInTheStock(String name) ;
    public void storeProductInDB(Product product);

    // Method to handle stock management actions
    public void handleStockManagement(int stockChoice);

    /*

     */
}
