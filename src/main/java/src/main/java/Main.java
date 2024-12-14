import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    void createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement",
                    "root", "Hello@#$1234");
            System.out.println("Database connected successfully");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static void main(String[] args) {

        CRUD crud = new CRUD();
        crud.setContentPane(crud.getContentPane());
        crud.setTitle("Hello");
        crud.setSize(300,400);
        crud.setVisible(true);
        crud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}