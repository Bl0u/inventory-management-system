
package Interfaces.AdministratorManagementServices;

import Classes.*;
import Classes.Products.Product;
import Classes.Users.User;


import java.time.LocalDate;
public interface StockManagement {

    public void addProduct(User user) ;
    public void deleteProduct() ;
    public void printAllStock() ;
    public void reStockProduct(int productID, String name, int quantity, int costPrice,
                                  int reStockThreashold) ;
    public void searchProduct(int id) ;
    public void searchProduct(String name) ;
    public void storeProductINDB(Product product);


    /*

     */
}
