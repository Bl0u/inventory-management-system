package Interfaces.AdministratorManagementServices;

import Classes.*;
import Classes.Products.Product;
import Classes.Users.Supplier;
import Classes.Users.User;

public interface SupplierManagement  {
    public boolean addSupplier ()     ;
    public boolean updateSupplier ()  ;
    public boolean deleteSupplier ()  ;

    public boolean storeInDB(Supplier supplier);
    public Supplier findSupplierByEmail(String email);
    public boolean reportSupplierPerformance() ;
    public boolean reportSuppliersRelatedToThisProduct() ;
    public void handleSupplierManagement(int supplierChoice);
}
