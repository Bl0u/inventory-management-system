package Administrator.AdminManagers;
import Classes.Users.* ;
import Classes.Products.Product;
import Administrator.AdministratorManagementServices.ReportManagement;
import Supplier.Supplier;

public class ReportManager implements ReportManagement {


    @Override
    public boolean reportProduct(Product product) {
        return false;
    }

    @Override
    public boolean reportCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean reportSupplier(Supplier supplier) {
        return false;
    }


    @Override
    public boolean reportSales() {
        return false;
    }

    @Override
    public boolean reportLowStockItems() {
        return false;
    }

    public void handleReportGeneration(int reportChoice) {

    }
}
