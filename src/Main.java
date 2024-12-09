
import Classes.Products.Product;
import Classes.Users.Adminstrator;
import Classes.Users.Supplier;
import Classes.enums.UserType;
import Classes.InterfaceManagers.* ;
import Interfaces.InterfaceManagement.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import Classes.enums.WorkFlow ;
import Classes.Users.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Main DB = new Main();
        //DB.createConnection();

        Supplier supplier = new Supplier();
        supplier.supplierStockManager.addProductToTheStock();
    }

    void createConnection()  {
        try{
            Class.forName("com.mysql.jdbc.Driver") ;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement",
                    "root","Hello@#$1234") ;
            System.out.println("Database connected successfully");
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex) ;
        } catch (SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}