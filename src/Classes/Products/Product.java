package Classes.Products;
import java.util.Scanner;
import Classes.*;
import Classes.Users.Supplier;
import Classes.Users.User;
import Classes.enums.UserType;
import Interfaces.*;
import Interfaces.AdministratorManagementServices.ProductManagement;

import java.time.LocalDate;

public class Product {

// Attributes
    // Manipulate
    private String name                     ;
    private String category                 ;
    private String Unite;

    private LocalDate expirationDate        ; // LocalDate(year, month, day)

    private int id                          ;
    private int costPrice = 0               ;
    private int reStockThreshold = 5        ;

    //Fixed

    private int sellPrice ;
    private final double min = 0.4, max = 0.9 ;
    private final int grossProfit = sellPrice - costPrice                     ;
    private Supplier supplier;
    //------------------------------------------------------------
// End of Attributes


// Constructors
    //public Product(String name, String category, String unite, int cost, User user){

    //}
    public Product(String name, String category, int cost, User user){
        setSupplier(user);
    }

    public Product(User user){
        //scanProduct(user);
    }
// End of Cosntructors


    // Setters and Getters
    public void setSupplier(User user) {
        if (user.getUserType() == UserType.SUPPLIER)
            this.supplier = (Supplier) user;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }
    public void setSellPrice(int cost, User user) {
        ProductManagement productManagement = user.getProductManagementInterface();
        this.sellPrice = productManagement.setPrice(cost, this);
    }
    public void setUnite(String unite) {
        Unite = unite;
    }

    public int getId() {
        // return ID generated in DB
        return id;
    }
    public String getSupplier() {
        return supplier.getName();
    }
    public String getName() {
        return name;
    }
    public int getReStockThreshold() {
        return reStockThreshold;
    }
    public LocalDate getExpirationDate() {
        // retrieve exp date from DB
        return expirationDate;
    }
    public int getGrossProfit() {
        return grossProfit;
    }
    public int getSellPrice() {
        return sellPrice;
    }
    public String getCategory() {
        return category;
    }
    public String getUnite() {
        return this.Unite;
    }

    public void printProductDetails() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Category: " + this.category);
        System.out.println("Cost Price: " + this.costPrice);
        System.out.println("Sell Price: " + this.sellPrice);
        System.out.println("Supplier: " + this.supplier.getClass().getSimpleName());
    }

    // end of Setters and Getters
}
