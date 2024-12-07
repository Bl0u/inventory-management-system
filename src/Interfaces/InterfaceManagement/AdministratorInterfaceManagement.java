package Interfaces.InterfaceManagement;

public interface AdministratorInterfaceManagement {

    // print function interfaces
    void printManageOrderFunctions();
    void printManageProductsFunctions();
    void printGenerateReportsFunctions();
    void printManageStockFunctions();
    void printManageSuppliersFunctions();
    void printManageUsersFunctions();
    void printGeneratlFunctions();

    // Method to handle order management actions
    void handleOrderManagement(int orderChoice);

    // Method to handle product management actions
    void handleProductManagement(int productChoice);

    // Method to handle report generation actions
    void handleReportGeneration(int reportChoice);

    // Method to handle stock management actions
    void handleStockManagement(int stockChoice);

    // Method to handle supplier management actions
    void handleSupplierManagement(int supplierChoice);

    // Method to handle user management actions
    void handleAdministratorManagement(int userChoice);
}
