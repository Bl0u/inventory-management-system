package Interfaces.AdministratorManagementServices;

import Classes.* ;
import Classes.Products.Product;

public interface PromotionManagement {

    public boolean addDefaultDiscountOn(Product product, int fixed, int percentage) ;
    public boolean removeDefaultDiscountFrom(Product product) ;

}
