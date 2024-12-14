package Classes.Products;
import java.util.Scanner;

import Classes.Users.Supplier;
import Classes.Users.User;
import Classes.enums.UserType;
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
    public Product(){

    }

    public Product(String name, String category, int cost){

    }
    public Product(String name, String category, int Unite, int cost){

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
        if (supplier.getName() != null) return supplier.getName();
        else return null;
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

    public int getCostPrice() {
        return costPrice;
    }

    public void printProductDetails(Product product) {
        System.out.println("Product Name: " + product.getName());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Cost Price: " + product.getCostPrice());
        System.out.println("Sell Price: " + product.getSellPrice());
        //System.out.println("Supplier: " +
                //(product.getSupplier() != null ? this.supplier.getClass().getSimpleName() : "null"));
    }
    public void scanProduct() {
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
            setUnite(unite);
        }

        System.out.println("Enter product cost price:");
        int cost = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline character

        // Create the Product object using the constructor
        setCategory(category);
        setName(name);
        setCostPrice(cost);
        //product.setSellPrice(cost, user);

    }

    // end of Setters and Getters
}
