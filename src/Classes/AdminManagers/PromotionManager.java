package Classes.AdminManagers;

import Classes.*;
import Classes.Products.Product;
import Classes.Users.User;


import Interfaces.AdministratorManagementServices.PromotionManagement;
import Classes.*;

public class PromotionManager implements PromotionManagement {

    @Override
    public boolean addDefaultDiscountOn(Product product, int fixed, int percentage) {
        return false;
    }

    @Override
    public boolean removeDefaultDiscountFrom(Product product) {
        return false;
    }
}
