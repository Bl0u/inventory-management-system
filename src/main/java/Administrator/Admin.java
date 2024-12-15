package Administrator;
import User.user;  // Import the User class from the User package

import Administrator.AdminManagers.*;
import Administrator.AdminInterfaces.AdminInterfaceManager;
import Classes.enums.UserType;
import Administrator.AdministratorManagementServices.ProductManagement;

import java.util.Scanner;
public class Admin extends user {

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
        public AdminInterfaceManager administratorInterfaceManager =
                new AdminInterfaceManager();

        public Admin(String name, String email) {
            super(name, email, UserType.ADMIN);
            stockManager = new StockManager();
            customerManager = new CustomerManager();
            reportManager2 = new ReportManager();
            orderReportManager = new OrderReportManager();
            reportManager = new ReportManager();
            supplierManager = new SupplierManager();
            productManager = new ProductManager();
        }

        public Admin() {
            System.out.println("Hello neggga");
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
            AdminInterfaceManager administratorInterfaceManager1 =
                    new AdminInterfaceManager();
            Scanner scanner = new Scanner(System.in);
            AdminInterfaceState currentState = AdminInterfaceState.CHOOSE_CATEGORY; // Start with the category selection screen
            boolean running = true;

            while (running) {
                switch (currentState) {
                    case AdminInterfaceState.CHOOSE_CATEGORY:
                        // Display categories for Admin
                        administratorInterfaceManager1.printAllAdminFunctions();
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
                        administratorInterfaceManager1.printManageOrderFunctions();

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
                        administratorInterfaceManager1.printManageProductsFunctions();
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
                        administratorInterfaceManager1.printGenerateReportsFunctions();
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
                        administratorInterfaceManager1.printManageStockFunctions();
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
                        administratorInterfaceManager1.printManageSuppliersFunctions();
                        int supplierChoice = scanner.nextInt();
                        if (supplierChoice == 3) {
                            currentState = AdminInterfaceState.CHOOSE_CATEGORY;
                        } else {
                            supplierManager.handleSupplierManagement(supplierChoice);
                            currentState = AdminInterfaceState.MANAGE_SUPPLIERS;
                        }
                        break;

                    case AdminInterfaceState.MANAGE_USERS:
                        // Handle user management functions
                        administratorInterfaceManager1.printManageUsersFunctions();
                        int userChoice = scanner.nextInt();
                        if (userChoice == 4) {
                            currentState = AdminInterfaceState.CHOOSE_CATEGORY;
                        } else {
                            customerManager.handleCustomerManagement(userChoice);
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
