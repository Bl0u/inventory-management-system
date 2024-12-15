package Classes.SupplierManagers;
import Classes.Products.Product;
import Administrator.Managers.StockService.StockManagement;

import java.util.Scanner;

public class SupplierStockManager implements StockManagement {
    SupplierProductManager supplierProductManager = new SupplierProductManager() ;
    @Override
    public void addProductToTheStock() {
            Scanner scanner = new Scanner(System.in);
            Product product = new Product();
            product.scanProduct();

            // Output the product details
            product.printProductDetails(product);
            System.out.println("\nAdd to the stock ? Type -> Y/yes or N/No");
            String answer = scanner.nextLine() ;
            if (answer.equals("Y") || answer.equals("Yes")) storeProductInDB(product) ;
            else {
                System.out.println("\n\nYou want to add another product? Type -> Y/yes or N/No");
                String answer2 = scanner.nextLine();
                if (answer2.equalsIgnoreCase("y") || answer2.equalsIgnoreCase("yes")) {
                    this.addProductToTheStock();
                }
                // else missing
            }
    }

    @Override
    public void deleteProductFromTheStock() {
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
    public void reStockProduct() {

    }

    @Override
    public void searchProductInTheStock(int id) {

    }

    @Override
    public void searchProductInTheStock(String name) {
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
    public void storeProductInDB(Product product) {
        // store this product in the DB
    }

    @Override
    public void handleStockManagement(int stockChoice) {

    }
}
