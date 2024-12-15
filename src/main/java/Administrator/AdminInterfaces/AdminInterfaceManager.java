package Administrator.AdminInterfaces;
import Administrator.Managers.OrderService.OrderReportManager;
import Administrator.Managers.ProductService.ProductManager;
import Administrator.Managers.ReportService.ReportManager;
import Administrator.Managers.StockService.StockManager;
import Administrator.Managers.SupplierService.SupplierManager;
import Classes.InterfaceManagers.Interface;
import java.util.Scanner;

public class AdminInterfaceManager extends Interface
        implements AdministratorInterfaceManagement {

    private ProductManager productManager;
    private SupplierManager supplierManager;
    private ReportManager reportManager;
    private OrderReportManager orderReportManager;
    private ReportManager reportManager2;
    private StockManager stockManager;

    public AdminInterfaceManager(){
        stockManager = new StockManager();
        reportManager2 = new ReportManager();
        orderReportManager = new OrderReportManager();
        reportManager = new ReportManager();
        supplierManager = new SupplierManager();
        productManager = new ProductManager();
    }

    @Override
    public void printManageOrderFunctions() {
        System.out.println("1- Manage Orders:");
        System.out.println("  * Print all orders");
        System.out.println("  * Print orders for a specific customer");
        System.out.println("  * Print all orders containing a specific product");
        System.out.println("  * Print all orders with a value higher than a specified amount");
        System.out.println("  * Print all orders with a specific status");
        System.out.println("  * Print details of a specific order");
        System.out.println("  * Return");

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
        System.out.println("  * Return");

    }

    @Override
    public void printGenerateReportsFunctions() {
        System.out.println("3- Generate Reports:");
        System.out.println("  * Report on a specific product");
        System.out.println("  * Report on a specific customer");
        System.out.println("  * Report on a specific supplier");
        System.out.println("  * Generate sales report");
        System.out.println("  * Generate report for low-stock items");
        System.out.println("  * Return");

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
        System.out.println("  * Return");

    }

    @Override
    public void printManageSuppliersFunctions() {
        System.out.println("5- Manage Suppliers:");
        System.out.println("  * Report on supplier performance");
        System.out.println("  * Report on suppliers related to a specific product");
        System.out.println("  * Return");

    }

    @Override
    public void printManageUsersFunctions() {
        System.out.println("6- Manage Users:");
        System.out.println("  * Add a new customer");
        System.out.println("  * Update customer details");
        System.out.println("  * Delete a customer");
        System.out.println("  * Return");

    }

    @Override
    public void printGeneratlFunctions() {
        System.out.println("7- Exit");

    }

    public void printAllAdminFunctions(){
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
        AdminInterfaceState currentState = AdminInterfaceState.CHOOSE_CATEGORY; // Start with the category selection screen
        boolean running = true;

        while (running) {
            switch (currentState) {
                case AdminInterfaceState.CHOOSE_CATEGORY:
                    // Display categories for Admin
                    this.printAllAdminFunctions();
                    System.out.println("Your choice: ");
                    int categoryChoice = scanner.nextInt();
                    currentState = switch (categoryChoice) {
                        case 1 -> AdminInterfaceState.MANAGE_ORDERS;
                        case 2 -> AdminInterfaceState.MANAGE_PRODUCTS;
                        case 3 -> AdminInterfaceState.GENERATE_REPORTS;
                        case 4 -> AdminInterfaceState.MANAGE_STOCK;
                        case 5 -> AdminInterfaceState.MANAGE_SUPPLIERS;
                        case 6 -> AdminInterfaceState.MANAGE_USERS;
                        case 7 -> AdminInterfaceState.EXIT;
                        default -> AdminInterfaceState.CHOOSE_CATEGORY;
                    };
                    break;

                case AdminInterfaceState.MANAGE_ORDERS:
                    // Handle order management functions
                    this.printManageOrderFunctions();

                    int orderChoice = scanner.nextInt();
                    if (orderChoice == 7) {
                        currentState = AdminInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        orderReportManager.handleOrderManagement(orderChoice);
                        currentState = AdminInterfaceState.MANAGE_ORDERS;
                    }
                    break;

                case AdminInterfaceState.MANAGE_PRODUCTS:
                    // Handle product management functions
                    this.printManageProductsFunctions();
                    int productChoice = scanner.nextInt();
                    if (productChoice == 8) {
                        currentState = AdminInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        productManager.handleProductManagement(productChoice);
                        currentState = AdminInterfaceState.MANAGE_PRODUCTS;
                    }
                    break;

                case AdminInterfaceState.GENERATE_REPORTS:
                    // Handle report generation functions
                    this.printGenerateReportsFunctions();
                    int reportChoice = scanner.nextInt();
                    if (reportChoice == 6) {
                        currentState = AdminInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        reportManager.handleReportGeneration(reportChoice);
                        currentState = AdminInterfaceState.GENERATE_REPORTS;
                    }
                    break;

                case AdminInterfaceState.MANAGE_STOCK:
                    // Handle stock management functions
                    this.printManageStockFunctions();
                    int stockChoice = scanner.nextInt();
                    if (stockChoice == 8) {
                        currentState = AdminInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        stockManager.handleStockManagement(stockChoice);
                        currentState = AdminInterfaceState.MANAGE_STOCK;
                    }
                    break;

                case AdminInterfaceState.MANAGE_SUPPLIERS:
                    // Handle supplier management functions
                    this.printManageSuppliersFunctions();
                    int supplierChoice = scanner.nextInt();
                    if (supplierChoice == 3) {
                        currentState = AdminInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        supplierManager.handleSupplierManagement(supplierChoice);
                        currentState = AdminInterfaceState.MANAGE_SUPPLIERS;
                    }
                    break;

                case AdminInterfaceState.MANAGE_USERS:
                    // Handle User management functions
                    this.printManageUsersFunctions();
                    int userChoice = scanner.nextInt();
                    if (userChoice == 4) {
                        currentState = AdminInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        currentState = AdminInterfaceState.MANAGE_USERS;
                    }
                    break;

                case AdminInterfaceState.EXIT:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid selection, returning to main menu.");
                    currentState = AdminInterfaceState.CHOOSE_CATEGORY;
                    break;
            }
        }
    }



}
