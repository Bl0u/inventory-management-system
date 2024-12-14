import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CRUD extends JFrame {

    private JTextField firstNameTextField;
    private JButton insertButton;
    private JTextField secondNameTextField;
    private JPanel GUI;
    Connection con;
    CRUD(){
        this.createConnection();
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String f_name= firstNameTextField.getText();
                    String s_name = secondNameTextField.getText();  // Correct
//                    Statement stmt = con.createStatement();
                    String dbop = "INSERT INTO administrator (first_name, second_name) VALUES (?, ?)";

                    try (PreparedStatement stmt = con.prepareStatement(dbop)) {
                        stmt.setString(1, f_name);  // Set first name from the JTextField
                        stmt.setString(2, s_name);  // Set second name from the JTextField
                        stmt.executeUpdate();  // Execute the insert operation
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        setContentPane(GUI);
        setTitle("Inventory Management System");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    private Connection createConnection(){
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement",
                    "root", "Hello@#$1234");
            System.out.println("Connection established: " + con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return con;  // Return the established connection
    }

    @Override
    public JPanel getContentPane() {
        return GUI;
    }


    public static void main(String[] args) {

        CRUD crud = new CRUD();
    }
}
