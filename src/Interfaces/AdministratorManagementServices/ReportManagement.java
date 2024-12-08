package Interfaces.AdministratorManagementServices;

import Classes.*;
import Classes.Users.Customer;
import Classes.Products.Product;
import Classes.Users.Customer;
import Classes.Users.Supplier;

public interface ReportManagement {

    public boolean reportProduct(Product product) ;
    public boolean reportCustomer(Customer customer) ;
    public boolean reportSupplier(Supplier supplier) ;

    public boolean reportSales() ;
    public boolean reportLowStockItems() ;
    public void handleReportGeneration(int reportChoice);
    /*
    1. Reporting Functions:
   - reportItems(int itemId): Returns all orders for this item, total sold, and total cost.
   - reportCustomer(int customerId): Returns all information about the customer.
   - reportSuppliers(int supplierId): Returns all information about the supplier.
   - reportSales(): Returns total quantity sold and revenue for each item, total profit.
   - reportLowStockItems(): Returns items with low stock levels.

     */
}
