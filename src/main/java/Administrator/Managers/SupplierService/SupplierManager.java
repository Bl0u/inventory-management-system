package Administrator.Managers.SupplierService;

import Supplier.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SupplierManager implements SupplierManagement {

    public int summation (int a, int b){
        return a+b;
    }

    public List<Supplier> getAllSuppliersFromDB(){
        List<Supplier> suppliers = new ArrayList<Supplier>();

        return suppliers ;

    }

    private List<Supplier> supplierDB = getAllSuppliersFromDB();
    // Store the supplier in the "database"
    @Override
    public boolean storeInDB(Supplier supplier) {
        System.out.println("storing in DB....");
        return true; // Adds the supplier to the list and returns true if successful
    }

    @Override
    public Supplier findSupplierByEmail(String email) {
        System.out.println("Searching for supplier with email " + email);
        for (Supplier supplier : supplierDB) {
            if (supplier.getEmail().equals(email)) {
                return supplier;
            }
        }
        return null;
    }

    @Override
    public boolean addSupplier() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Supplier Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Supplier Email: ");
        String email = scanner.nextLine();

        if (findSupplierByEmail(email) != null) {
            System.out.println("Supplier with this email already exists!");
            return false;
        }

        Supplier newSupplier = new Supplier(name, email);
        // adjust the storeinDB function
        if (storeInDB(newSupplier)) {
            System.out.println("Supplier added successfully.");
            return true;
        } else {
            System.out.println("Failed to add supplier.");
            return false;
        }
    }

    @Override
    public boolean updateSupplier() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Supplier Email to Update: ");
        String email = scanner.nextLine();

        Supplier supplier = findSupplierByEmail(email);
        if (supplier == null) {
            System.out.println("Supplier not found!");
            return false;
        }

        System.out.print("Enter New Supplier Name: ");
        String newName = scanner.nextLine();
        supplier.setName(newName); // Update the supplier's name
        System.out.println("Supplier updated successfully.");
        return true;
    }

    @Override
    public boolean deleteSupplier() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Supplier Email to Delete: ");
        String email = scanner.nextLine();

        Supplier supplier = findSupplierByEmail(email);
        if (supplier == null) {
            System.out.println("Supplier not found!");
            return false;
        }

        //supplierDB.remove(supplier); // Remove the supplier from the list
        System.out.println("Supplier deleted successfully.");
        return true;
    }

    @Override
    public boolean reportSupplierPerformance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Supplier Email to Generate Performance Report: ");
        String email = scanner.nextLine();

        Supplier supplier = findSupplierByEmail(email);
        if (supplier == null) {
            System.out.println("Supplier not found!");
            return false;
        }

        // Placeholder: Generate performance metrics (e.g., total products supplied)
        System.out.println("Performance Report for Supplier: " + supplier.getName());
        System.out.println("- Total products supplied: 100 (example)");
        System.out.println("- Total revenue generated: $5000 (example)");
        return true;
    }

    @Override
    public boolean reportSuppliersRelatedToThisProduct() {
        // Placeholder: Implement logic to find suppliers related to a product
        // For now, we'll just print all suppliers
        System.out.println("Enter product ID to Report Related To:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine();
        supplierDB.clear();
        //loop on products for sale, for each product check supplier,
        // return if there is a match
        //supplierDB = supplierRelatedToThisProductDB();
        System.out.println("List of all suppliers:");
        for (Supplier supplier : supplierDB) {
            System.out.println("- " + supplier.getName() + " (" + supplier.getEmail() + ")");
        }
        return true;
    }

    @Override
    public void handleSupplierManagement(int supplierChoice) {
        Scanner scanner = new Scanner(System.in);
        switch (supplierChoice) {
            case 1:
                addSupplier();
                break;
            case 2:
                updateSupplier();
                break;
            case 3:
                deleteSupplier();
                break;
            case 4:
                reportSupplierPerformance();
                break;
            case 5:
                reportSuppliersRelatedToThisProduct();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
}
