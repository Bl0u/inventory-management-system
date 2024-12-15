package Interfaces;

import Classes.Products.Product;

public interface CartManagement {

    public boolean addProduct(Product product) ;
    public boolean deleteProduct(Product product) ;
    public boolean cartHasProduct(Product product) ;
    public boolean updateProduct() ;
    public boolean clearCart() ;
    public boolean printCart() ;
    public boolean isCartEmpty() ;

    /*
       - addProduct(Classes.Product product, int quantity): Adds a product to the cart with a specified quantity.
   - removeProduct(Classes.Product product): Removes a product from the cart.
   - updateProductQuantity(Classes.Product product, int quantity): Updates the quantity of a specific product.
   - clearCart(): Empties the cart.
   - viewCart(): Displays all items in the cart, their quantities, and the total cost.
   - isCartEmpty(): Checks if the cart is empty.
   - hasProduct(Classes.Product product): Checks if a specific product is in the cart.
     */

    // update should list all the items in the program interface and then the User choose which item to manuplaute
    // after choosing an item, he gets another interface with the manipulateable items ... etc
    // update function has the "cartHasProduct" function for validation
}
