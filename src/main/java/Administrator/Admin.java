package Administrator;
import UserClass.User;

import Administrator.AdminInterfaces.AdminInterfaceManager;
import Classes.enums.UserType;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static UserDAO.UserDAOManager.con;

public class Admin extends User {

        // Variables initialization
        AdminInterfaceManager manager = new AdminInterfaceManager();
        UserType userType = UserType.ADMIN ;
        AdminInterfaceManager adminInterfaceManager = new AdminInterfaceManager();
        // Variables END

        public Admin(String name, String email) {
            super(name, email, UserType.ADMIN);
        }

        public Admin() {
//            adminInterfaceManager.printInterface();
            System.out.println("Hello neggga");
        }

    @Override
    public String toString() {
        return "Admin{" +
                "Name=" + this.getName() +
                ", Email=" + this.getEmail() +
                '}';
    }

    @Override
    public void storeDB() {
        System.out.println("Storing Admin credentials");
        System.out.println(this.toString());

        try {
            // Start a transaction
            con.setAutoCommit(false);  // Disable auto-commit mode (you'll commit manually later)

            // Define the SQL query with column names
            String sql = "INSERT INTO administrator (first_name, second_name) VALUES (?, ?)";

            // Prepare the statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // Set the values for the placeholders
            stmt.setString(1, this.getName());
            stmt.setString(2, this.getEmail());

            // Execute the statement
            stmt.execute();

            // If the insertion is successful, commit the transaction
            con.commit();
            System.out.println("Admin credentials stored and transaction committed");

            // Close the statement
            stmt.close();
        } catch (SQLException e) {
            // If an error occurs, rollback the transaction to maintain consistency
            try {
                con.rollback();
                System.out.println("Transaction rolled back due to an error: " + e.getMessage());
            } catch (SQLException rollbackEx) {
                System.out.println("Error during rollback: " + rollbackEx.getMessage());
            }
            throw new RuntimeException("Error storing admin credentials", e);
        } finally {
            try {
                // Set auto-commit back to true (if needed for future transactions)
                con.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println("Error resetting auto-commit: " + e.getMessage());
            }
        }
    }

    @Override
    public void deleteDB(User user) {

        System.out.println(" Admin deleteDP");
    }

    @Override
    public void updateDB(User user) {

        System.out.println(" Admin updateDB");
    }

    @Override
    public void readDB(User user) {

        System.out.println(" Admin readDB");
    }

    @Override
        public UserType getUserType() {
            return userType;
        }

        // build  tostring function



}
