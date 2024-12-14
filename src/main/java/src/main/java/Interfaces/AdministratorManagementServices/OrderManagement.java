package Interfaces.AdministratorManagementServices;

import Classes.Users.Customer;
import Classes.Products.Product;

public interface OrderManagement {

    public void printAllOrders()                             ;
    public void printThisCustomerOrder(Customer customer)    ;
    public void printAllOrdersHas(Product product)           ;
    public void printAllOrdersWithValueHigherThan(int value) ;
    public void printAllOrdersWithStatus(String status)      ;
    public void printOrder(int id)                        ;
    public void handleOrderManagement(int orderChoice);
}
