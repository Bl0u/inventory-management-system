package Interfaces.AdministratorManagementServices;

import Classes.*;
import Classes.Products.Product;
import Classes.Users.Supplier;

public interface SupplierManagement  {

    public boolean reportSupplierPerformance(Supplier supplier) ;
    public boolean reportSuppliersRelatedToThisProduct(Product product) ;
    public void handleSupplierManagement(int supplierChoice);
}
