package Classes.InterfaceManagers;
import Classes.*;
import Classes.AdminManagers.StockManager;
import Classes.Products.Product;
import Classes.Users.Adminstrator;
import Interfaces.*;
import Interfaces.InterfaceManagement.AdministratorInterfaceManagement;
import java.util.Scanner;
import Classes.enums.AdministratorInterfaceState;
import Classes.Products.Product.*;
import static Classes.enums.AdministratorInterfaceState.*;

public class AdministratorInterfaceManager extends Interface
        implements AdministratorInterfaceManagement {

    @Override
    public void printManageOrderFunctions() {
        System.out.println("1- Manage Orders:");
        System.out.println("  * Print all orders");
        System.out.println("  * Print orders for a specific customer");
        System.out.println("  * Print all orders containing a specific product");
        System.out.println("  * Print all orders with a value higher than a specified amount");
        System.out.println("  * Print all orders with a specific status");
        System.out.println("  * Print details of a specific order");

    }

    @Override
    public void printManageProductsFunctions() {
        System.out.println("2- Manage Products:");
        System.out.println("  * Set product price");
        System.out.println("  * Update product name");
        System.out.println("  * Update product category");
        System.out.println("  * Update product quantity");
        System.out.println("  * Update product cost price");
        System.out.println("  * Update product restock threshold");
        System.out.println("  * Update complete product details");

    }

    @Override
    public void printGenerateReportsFunctions() {
        System.out.println("3- Generate Reports:");
        System.out.println("  * Report on a specific product");
        System.out.println("  * Report on a specific customer");
        System.out.println("  * Report on a specific supplier");
        System.out.println("  * Generate sales report");
        System.out.println("  * Generate report for low-stock items");

    }

    @Override
    public void printManageStockFunctions() {
        System.out.println("4- Manage Stock:");
        System.out.println("  * Add a new product to stock");
        System.out.println("  * Delete a product from stock");
        System.out.println("  * Print all stock details");
        System.out.println("  * Restock a product");
        System.out.println("  * Search for a product by ID");
        System.out.println("  * Search for a product by name");
        System.out.println("  * Read product details");

    }

    @Override
    public void printManageSuppliersFunctions() {
        System.out.println("5- Manage Suppliers:");
        System.out.println("  * Report on supplier performance");
        System.out.println("  * Report on suppliers related to a specific product");

    }

    @Override
    public void printManageUsersFunctions() {
        System.out.println("6- Manage Users:");
        System.out.println("  * Add a new customer");
        System.out.println("  * Update customer details");
        System.out.println("  * Delete a customer");

    }

    @Override
    public void printGeneratlFunctions() {
        System.out.println("7- Exit");

    }

    public void printUserFunctions(){
        System.out.println("1- Manage Orders:");
        System.out.println("2- Manage Products:");
        System.out.println("3- Generate Reports:");
        System.out.println("4- Manage Stock:");
        System.out.println("5- Manage Suppliers:");
        System.out.println("6- Manage Users:");
        System.out.println("7- Exit");

    }



}
