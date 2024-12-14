package Classes;

import Classes.*;
import Classes.Users.User;
import Interfaces.*;

import java.time.LocalDateTime;

public class Order {
    private String orderId; // decided on the DB itself
    private User seller; // Can be a Supplier or Administrator
    private User buyer;  // Can be a Customer or Administrator
    private Cart cart;   // Contains the list of products
    private String shippingInfo;
    private String paymentType; // e.g., Visa, PayPal
    private LocalDateTime estimatedDeliveryTime;
    private String orderStatus; // e.g., Pending, Completed, Cancelled
}
