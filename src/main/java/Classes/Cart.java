package Classes;
import Classes.Products.Product;

import java.util.HashMap;
import java.util.Map;


public class Cart {
    private Map<Product, Integer> products ;

    public Cart() {
        this.products = new HashMap<>();
    }

}
