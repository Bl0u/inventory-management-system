package Supplier;

import Classes.InterfaceManagers.Interface;

public class SupplierInterfaceManager extends Interface implements SupplierInterfaceManagement {
    @Override
    public void printInterface() {}

    @Override
    public void printUserFunctions() {
        System.out.println("Product and Stock Management Functions:");

        System.out.println("\n- Manage Stock:");
        System.out.println("  * Add a new product to stock");
        System.out.println("  * Delete a product from stock");
        System.out.println("  * Print all stock details");
        System.out.println("  * Restock a product");
        System.out.println("  * Search for a product by ID");
        System.out.println("  * Search for a product by name");
        System.out.println("  * Read product details");
    }

    @Override
    public void handleProductManagement(int v) {

    }

    @Override
    public void handleStockManagement(int v) {

    }

    @Override
    public void printProductManagementFunctions() {
        System.out.println("\n- Manage Products:");
        System.out.println("  * Set product price");
        System.out.println("  * Update product name");
        System.out.println("  * Update product category");
        System.out.println("  * Update product quantity");
        System.out.println("  * Update product cost price");
        System.out.println("  * Update product restock threshold");
        System.out.println("  * Update complete product details");
    }
}
