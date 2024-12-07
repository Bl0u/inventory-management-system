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

public class AdministratorInterfaceManager extends Interface implements AdministratorInterfaceManagement {
    Adminstrator admin = new Adminstrator() ;
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
    @Override
    public void printInterface() {
        Scanner scanner = new Scanner(System.in);
        AdministratorInterfaceState currentState = AdministratorInterfaceState.CHOOSE_CATEGORY; // Start with the category selection screen
        boolean running = true;

        while (running) {
            switch (currentState) {
                case CHOOSE_CATEGORY:
                    // Display categories for admin
                    printUserFunctions();
                    System.out.println("Your choice: ");
                    int categoryChoice = scanner.nextInt();
                    currentState = switch (categoryChoice) {
                        case 1 -> AdministratorInterfaceState.MANAGE_ORDERS;
                        case 2 -> AdministratorInterfaceState.MANAGE_PRODUCTS;
                        case 3 -> AdministratorInterfaceState.GENERATE_REPORTS;
                        case 4 -> AdministratorInterfaceState.MANAGE_STOCK;
                        case 5 -> AdministratorInterfaceState.MANAGE_SUPPLIERS;
                        case 6 -> AdministratorInterfaceState.MANAGE_USERS;
                        case 7 -> AdministratorInterfaceState.EXIT;
                        default -> AdministratorInterfaceState.CHOOSE_CATEGORY;
                    };
                    break;

                case MANAGE_ORDERS:
                    // Handle order management functions
                    printManageOrderFunctions();

                    int orderChoice = scanner.nextInt();
                    if (orderChoice == 7) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        handleOrderManagement(orderChoice);
                        currentState = AdministratorInterfaceState.MANAGE_ORDERS;
                    }
                    break;

                case MANAGE_PRODUCTS:
                    // Handle product management functions
                    printManageProductsFunctions();
                    int productChoice = scanner.nextInt();
                    if (productChoice == 8) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        handleProductManagement(productChoice);
                        currentState = AdministratorInterfaceState.MANAGE_PRODUCTS;
                    }
                    break;

                case GENERATE_REPORTS:
                    // Handle report generation functions
                    printGenerateReportsFunctions();
                    int reportChoice = scanner.nextInt();
                    if (reportChoice == 6) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        handleReportGeneration(reportChoice);
                        currentState = AdministratorInterfaceState.GENERATE_REPORTS;
                    }
                    break;

                case MANAGE_STOCK:
                    // Handle stock management functions
                    printManageStockFunctions();
                    int stockChoice = scanner.nextInt();
                    if (stockChoice == 8) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        handleStockManagement(stockChoice);
                        currentState = AdministratorInterfaceState.MANAGE_STOCK;
                    }
                    break;

                case MANAGE_SUPPLIERS:
                    // Handle supplier management functions
                    printManageSuppliersFunctions();
                    int supplierChoice = scanner.nextInt();
                    if (supplierChoice == 3) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        handleSupplierManagement(supplierChoice);
                        currentState = AdministratorInterfaceState.MANAGE_SUPPLIERS;
                    }
                    break;

                case MANAGE_USERS:
                    // Handle user management functions
                    printManageUsersFunctions();
                    int userChoice = scanner.nextInt();
                    if (userChoice == 4) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        handleAdministratorManagement(userChoice);
                        currentState = AdministratorInterfaceState.MANAGE_USERS;
                    }
                    break;

                case EXIT:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid selection, returning to main menu.");
                    currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    break;
            }
        }
    }




    // Implementations of the function handlers (to be filled with appropriate logic)
    @Override
    public void handleOrderManagement(int orderChoice) {
        // Handle order management actions
    }

    @Override
    public void handleProductManagement(int productChoice) {
        // Handle product management actions
    }

    @Override
    public void handleReportGeneration(int reportChoice) {
        // Handle report generation actions
    }

    @Override
    public void handleStockManagement(int stockChoice) {
        if (stockChoice == 1){
            System.out.println("please enter the product details");

        }
        // Handle stock management actions
    }

    @Override
    public void handleSupplierManagement(int supplierChoice) {
        // Handle supplier management actions
    }

    @Override
    public void handleAdministratorManagement(int userChoice) {
        // Handle user management actions
    }
}
