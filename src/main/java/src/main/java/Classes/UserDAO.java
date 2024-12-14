package Classes;

import java.sql.*;

public class UserDAO {

    public UserDAO(){
        this.createConnection();
    }

    private void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement",
                    "root", "Hello@#$1234") ;

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM inventorymanagement.administrator") ;
            while(rs.next()){

                int ID = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("second_name");
                System.out.println(ID + " " + firstName + " " + lastName);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
