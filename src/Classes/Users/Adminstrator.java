package Classes.Users;

import Classes.*;
import Classes.AdminManagers.*;
import Classes.InterfaceManagers.AdministratorInterfaceManager;
import Classes.Users.User;
import Classes.enums.AdministratorInterfaceState;
import Classes.enums.UserType;

import Interfaces.*;
import Interfaces.AdministratorManagementServices.ProductManagement;
import Interfaces.InterfaceManagement.AdministratorInterfaceManagement;

import java.util.Scanner;

public class Adminstrator extends User {

    // Managers initialization
    private ProductManager productManager;
    private SupplierManager supplierManager;
    private ReportManager reportManager;
    private OrderReportManager orderReportManager;
    private ReportManager reportManager2;
    private CustomerManager customerManager;
    private StockManager stockManager;
    // Managers END
    UserType userType = UserType.ADMIN ;
    public AdministratorInterfaceManager administratorInterfaceManager =
            new AdministratorInterfaceManager();

    public Adminstrator(String name, String email) {
        super(name, email, UserType.ADMIN);
        stockManager = new StockManager();
        customerManager = new CustomerManager();
        reportManager2 = new ReportManager();
        orderReportManager = new OrderReportManager();
        reportManager = new ReportManager();
        supplierManager = new SupplierManager();
        productManager = new ProductManager();
    }

    public Adminstrator() {
        stockManager = new StockManager();
        customerManager = new CustomerManager();
        reportManager2 = new ReportManager();
        orderReportManager = new OrderReportManager();
        reportManager = new ReportManager();
        supplierManager = new SupplierManager();
        productManager = new ProductManager();

    }

    @Override
    public ProductManagement getProductManagementInterface() {
        return productManager;
    }

    @Override
    public UserType getUserType() {
        return userType;
    }

    public AdministratorInterfaceManagement adminInterface(){
        return this.administratorInterfaceManager;
    }
    public void printInterface() {
        AdministratorInterfaceManager administratorInterfaceManager1 =
                new AdministratorInterfaceManager();
        Scanner scanner = new Scanner(System.in);
        AdministratorInterfaceState currentState = AdministratorInterfaceState.CHOOSE_CATEGORY; // Start with the category selection screen
        boolean running = true;

        while (running) {
            switch (currentState) {
                case CHOOSE_CATEGORY:
                    // Display categories for admin
                    administratorInterfaceManager1.printAllAdminFunctions();
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
                    administratorInterfaceManager1.printManageOrderFunctions();

                    int orderChoice = scanner.nextInt();
                    if (orderChoice == 7) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        orderReportManager.handleOrderManagement(orderChoice);
                        currentState = AdministratorInterfaceState.MANAGE_ORDERS;
                    }
                    break;

                case MANAGE_PRODUCTS:
                    // Handle product management functions
                    administratorInterfaceManager1.printManageProductsFunctions();
                    int productChoice = scanner.nextInt();
                    if (productChoice == 8) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        productManager.handleProductManagement(productChoice);
                        currentState = AdministratorInterfaceState.MANAGE_PRODUCTS;
                    }
                    break;

                case GENERATE_REPORTS:
                    // Handle report generation functions
                    administratorInterfaceManager1.printGenerateReportsFunctions();
                    int reportChoice = scanner.nextInt();
                    if (reportChoice == 6) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        reportManager.handleReportGeneration(reportChoice);
                        currentState = AdministratorInterfaceState.GENERATE_REPORTS;
                    }
                    break;

                case MANAGE_STOCK:
                    // Handle stock management functions
                    administratorInterfaceManager1.printManageStockFunctions();
                    int stockChoice = scanner.nextInt();
                    if (stockChoice == 8) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        stockManager.handleStockManagement(stockChoice);
                        currentState = AdministratorInterfaceState.MANAGE_STOCK;
                    }
                    break;

                case MANAGE_SUPPLIERS:
                    // Handle supplier management functions
                    administratorInterfaceManager1.printManageSuppliersFunctions();
                    int supplierChoice = scanner.nextInt();
                    if (supplierChoice == 3) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        supplierManager.handleSupplierManagement(supplierChoice);
                        currentState = AdministratorInterfaceState.MANAGE_SUPPLIERS;
                    }
                    break;

                case MANAGE_USERS:
                    // Handle user management functions
                    administratorInterfaceManager1.printManageUsersFunctions();
                    int userChoice = scanner.nextInt();
                    if (userChoice == 4) {
                        currentState = AdministratorInterfaceState.CHOOSE_CATEGORY;
                    } else {
                        customerManager.handleCustomerManagement(userChoice);
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


}
