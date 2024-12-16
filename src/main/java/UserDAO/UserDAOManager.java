package UserDAO;

import Administrator.Admin;
import UserClass.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAOManager implements UserDAOInterface{
    public static Connection con ;

    public static void main(String[] args) {
        UserDAOManager userDAOManager = new UserDAOManager();
        Admin admin = new Admin("Peter", "NEGGA");
        userDAOManager.storeUser(admin);
    }
    @Override
    public void storeUser(User user) {
        this.createConnetion();
        user.storeDB();
    }
    void createConnetion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement",
                        "root", "Hello@#$1234");
            System.out.println("Connection established");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void getUser(User user) {


    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }
}
