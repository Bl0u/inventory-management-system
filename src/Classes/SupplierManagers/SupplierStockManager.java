package Classes.SupplierManagers;
import Classes.*;
import Classes.Products.Product;
import Classes.Users.User;
import Classes.enums.UserType;
import Interfaces.*;
import Interfaces.AdministratorManagementServices.StockManagement;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class SupplierStockManager implements StockManagement {
    SupplierProductManager supplierProductManager = new SupplierProductManager() ;
    @Override
    public void addProduct(User user) {
            if (user.getUserType() == UserType.ADMIN || user.getUserType() == UserType.CUSTOMER){
                System.out.println("you have to be supplier to scan a product sir");
                return;
            }
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter product name:");
            String name = scanner.nextLine();

            System.out.println("Enter product category:");
            String category = scanner.nextLine();

            if (category.substring(0,5).toLowerCase().equals("fruit") ||
                    category.substring(0,5).toLowerCase().equals("drink") ||
                    category.substring(0,5).toLowerCase().equals("vegat")){
                System.out.println("Enter product Unite:");
                String unite = scanner.nextLine();
            }

            System.out.println("Enter product cost price:");
            int cost = scanner.nextInt();
            scanner.nextLine();  // Consume the leftover newline character

            // Create the Product object using the constructor
            Product product = new Product(name, category, cost, user);
            product.setSellPrice(cost, user);

            // Output the product details
            product.printProductDetails();
            System.out.println("\nAdd to the stock ? Type -> Y/yes or N/No");
            String answer = scanner.nextLine() ;
            if (answer.equals("Y") || answer.equals("Yes")) storeProductINDB(product) ;
            else {
                System.out.println("\n\nYou want to add another product? Type -> Y/yes or N/No");
                String answer2 = scanner.nextLine();
                if (answer2.equalsIgnoreCase("y") || answer2.equalsIgnoreCase("yes")) {
                    this.addProduct(user);
                }
                // else missing
            }
    }

    @Override
    public void deleteProduct() {
        this.printAllStock();
        Scanner scanner = new Scanner(System.in);
        int ID = scanner.nextInt();
        // remove the product that has the same ID
    }

    @Override
    public void printAllStock() {
        // print all the stock for a supplier
    }

    @Override
    public void reStockProduct(int productID, String name, int quantity, int costPrice, int reStockThreashold) {

    }

    @Override
    public void searchProduct(int id) {

    }

    @Override
    public void searchProduct(String name) {
        // if name is category, then return all the products in that category
        if (name.substring(0,5).toLowerCase().equals("fruit") ||
                name.substring(0,5).toLowerCase().equals("drink") ||
                name.substring(0,5).toLowerCase().equals("vegat") ||
                name.substring(0,5).toLowerCase().equals("elect")){
            // retrieve all products in this category
        }
        // return all the products with the name

    }

    @Override
    public void storeProductINDB(Product product) {
        // store this product in the DB
    }

    @Override
    public void handleStockManagement(int stockChoice) {

    }
}
