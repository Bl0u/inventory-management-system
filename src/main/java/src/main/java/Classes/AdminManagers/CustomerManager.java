package Classes.AdminManagers;


import Classes.* ;
import Classes.Users.Customer;
import Classes.Users.User;


import Interfaces.* ;
import Interfaces.AdministratorManagementServices.UserManagement;

import java.util.Scanner;

public class CustomerManager implements UserManagement {

    public static int summation(int a, int b) {
        switch (a) {
            case 1:
                System.out.println("HOLLLLLA");
                break;
            default:
                System.out.println("hello");
                Scanner sc = new Scanner(System.in);
                String help = sc.nextLine();  // Waits for input
                System.out.println("NEGGA");
        }
        return a + b;
    }


    public boolean addCustomer(String user) {
        return false;
    }

    @Override
    public boolean addCustomer(User user) {
        return false;
    }

    @Override
    public boolean updateCustomer(User user) {
        return false;
    }

    @Override
    public boolean deleteCustomer(User user) {
        return false;
    }

    @Override
    public void handleCustomerManagement(int userChoice) {
        // Handle the user’s choice in the admin interface
        Scanner scanner = new Scanner(System.in);

        switch (userChoice) {
            case 1:
                // Add a new customer
                System.out.println("Enter customer details to add:");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                User newCustomer = new Customer(name, email);  // Assuming User class has a constructor
                if (addCustomer(email)) {
                    System.out.println("Customer added successfully.");
                } else {
                    System.out.println("Failed to add customer.");
                }
                break;

            case 2:
                // Update customer details
                System.out.println("Enter customer ID to update:");
                int customerIdToUpdate = scanner.nextInt();
                scanner.nextLine();  // Consume newline character left by nextInt()
                System.out.print("New Name: ");
                String newName = scanner.nextLine();
                System.out.print("New Email: ");
                String newEmail = scanner.nextLine();
                User customerToUpdate = new Customer(customerIdToUpdate, newName, newEmail);
                if (updateCustomer(customerToUpdate)) {
                    System.out.println("Customer updated successfully.");
                } else {
                    System.out.println("Customer not found.");
                }
                break;

            case 3:
                // Delete customer
                System.out.println("Enter customer ID to delete:");
                int customerIdToDelete = scanner.nextInt();
                User customerToDelete = new Customer(customerIdToDelete);  // Assuming User has an ID constructor
                if (deleteCustomer(customerToDelete)) {
                    System.out.println("Customer deleted successfully.");
                } else {
                    System.out.println("Customer not found.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
}
