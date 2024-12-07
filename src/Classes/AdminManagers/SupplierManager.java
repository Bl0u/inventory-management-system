package Classes.AdminManagers;
import Classes.*;
import Classes.Products.Product;
import Classes.Users.Supplier;
import Classes.Users.User;
import Interfaces.AdministratorManagementServices.UserManagement;
import Interfaces.AdministratorManagementServices.SupplierManagement;

public class SupplierManager implements UserManagement, SupplierManagement {



    @Override
    public boolean reportSupplierPerformance(Supplier supplier) {
        return false;
    }

    @Override
    public boolean reportSuppliersRelatedToThisProduct(Product product) {
        return false;
    }

    @Override
    public boolean addCustomer(User user) {
        return false;
    }

    @Override
    public boolean updateCustomer(User user) {
        return false;
    }

    @Override
    public boolean deleteCustomer(User user) {
        return false;
    }
}
